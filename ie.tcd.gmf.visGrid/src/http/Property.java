package http;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;
import java.util.HashSet;
import java.util.TreeSet;
import java.util.Vector;
import dataTypes.Model;

public class Property {
	
	public static void main(String[] args){
	}
	
	public static Vector<Model> getModuleList() throws IOException{
		Vector <Model> modules = new Vector<Model>();
		
		URL url = new URL("http://localhost:10001/objects");
		HttpURLConnection connection = (HttpURLConnection)url.openConnection();
		connection.setRequestMethod("GET");
		BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
		String inputLine;
		while ((inputLine = in.readLine()) != null) {
			int starts,ends;
			String name, type, parent;
			if (inputLine.contains("<modules>")){
				inputLine = in.readLine();
				assert (inputLine.contains("<name>"));
				starts = inputLine.indexOf(">")+1;
				ends = inputLine.lastIndexOf('<');
				name = inputLine.substring(starts,ends);
				
				inputLine = in.readLine();
				assert (inputLine.contains("<type>"));
				starts = inputLine.indexOf(">")+1;
				ends = inputLine.lastIndexOf('<');
				type = inputLine.substring(starts,ends);
				
				inputLine = in.readLine();
				assert (inputLine.contains("<parent>"));
				starts = inputLine.indexOf(">")+1;
				ends = inputLine.lastIndexOf('<');
				parent = inputLine.substring(starts,ends);
				
				modules.add(new Model(name,type,parent));
			}
		}
		in.close();
		return modules;
	}

	public static boolean isReturnChar(String strLine) {
		if (strLine.length() == 0) return true;
		for (int i=0;i<strLine.length();i++){
			if ((int)strLine.charAt(i) == 10 || strLine.length() <=1){
				return true;
			}
		}
		return false;
	}

	public static String getNextLine(BufferedReader br) throws IOException {
		String tmp = br.readLine();
		// replace isn't working for some reason, I did try
		tmp.replaceAll(" ", "%20");
		return tmp;
	}
	
	public static String getValueOfProperty(String currentObj, String strLine) throws IOException {
		URL url = new URL("http://localhost:10001/" + currentObj + "/" + strLine);
		//	System.out.println("Url is " + url.toString());
		HttpURLConnection connection = (HttpURLConnection)url.openConnection();
		connection.setRequestMethod("GET");
		// check for 404
		if (connection.getResponseCode() == 404) return null;
		BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
		String inputLine;
		while ((inputLine = in.readLine()) != null) {
			String val = getValueFromString(inputLine);
			if (val != null) return val;
		}
		in.close();
		return null;
	}
	
	public static String getValueFromString(String s){
		try {
			if (s.contains("<value>")){
				int startIndex = 8;
				int endIndex = s.indexOf("<",8);
				return s.substring(startIndex, endIndex);
			}
		} catch (Exception e){
			e.printStackTrace();
		}
		return null;
	}
}