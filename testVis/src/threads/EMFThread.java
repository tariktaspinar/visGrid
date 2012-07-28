package threads;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStream;
import java.io.InputStreamReader;

import org.eclipse.core.resources.IFile;

import http.Property;

public class EMFThread implements Runnable{
	public IFile file;

	public EMFThread(IFile file){
		this.file = file;
	}

	public void run() {
		while (true){
			try{
				
				File outFile = new File(file.getLocation().toOSString()+".swp");
				// if outfile doesn't exist, then create it
				if (!outFile.exists()) {
					outFile.createNewFile();
				}
				
				FileWriter fstream = new FileWriter(outFile.getAbsoluteFile());
				BufferedWriter out = new BufferedWriter(fstream);
				
				
				InputStream in = file.getContents();
				BufferedReader br = new BufferedReader(new InputStreamReader(in));
				String line; // current line, edited in the inner while loop
				while((line = br.readLine()) != null) {
					// only focus on connections
					if (line.contains("connections")){
						// get first and last index of the name value
						int first = line.indexOf("name=") + 6;
						int second = line.indexOf("\"",first);
						int valFirst =0;
						int valSecond =second;
						String name = line.substring(first,second);
						
						// Until we reach the end of the line (the next sequence is " />" basically)
						while (valSecond < line.length()-3){ // Less than the /> at the end of the line		
							first = second+2; // There will be a space and then the attribute
							second = line.indexOf("=",first);
							
							String prop = line.substring(first, second).trim(); // name of the property
							System.out.println("Prop: "+ prop);
							String val = http.Property.getValueOfProperty(name,prop); // get http propeprties
							
							valFirst = line.indexOf("\"",second);
							valSecond = line.indexOf("\"",valFirst+1);
							second = valSecond;
							System.out.println(line.substring(0,valFirst+1) +" : " +(int)(valFirst+1));
							System.out.println(line.substring(valSecond,line.length()-1)+" : " +valSecond);
							line = line.substring(0,valFirst+1) + val + line.substring(valSecond,line.length()-1); // Longhand way of replacing the val with the new val
						}
					}
					out.write(line);
					out.write('\n');
				}

				in.close();
				out.close();
			} catch (Exception e){
				e.printStackTrace();
			}
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}