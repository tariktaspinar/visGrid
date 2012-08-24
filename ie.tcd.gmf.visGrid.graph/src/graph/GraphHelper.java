package graph;

import ie.tcd.gmf.visgrid.graph.actions.LiveGraphCreator;

import java.io.File;
import java.net.URI;

import org.LiveGraph.LiveGraph;

import manager.LiveGraphManager;

public class GraphHelper {

	private LiveGraphManager manager;

	public GraphHelper(){
	}

	public void init(){
		String loc = null;
		try {
			File tempFileLiveGraph = new File("visGridLiveGraph/");
			loc = tempFileLiveGraph.getAbsolutePath() +"/";
			tempFileLiveGraph.mkdirs();
			manager = new LiveGraphManager(loc);
		} catch (Exception e1) {
			System.err.println("Error in GraphHelper when creating new LiveGraphManager");
			e1.printStackTrace();
		}

		try {
			// Create the paramaters to be in visGridGraphData dir and launch
			//String[] params = new String[] {"-dfs",loc+ "dataFileSettings.lgdfs","-gs",loc+"graphSettings.lggs","-dss", loc+"dataSeriesSettings.lgdss", "-f", loc + "visGridGraphData.csv"};
			String[] params = new String[] {"-f",loc + "visGridGraphData.csv"};
			LiveGraph app = LiveGraph.application();
			app.execStandalone(params);
		} catch (java.lang.NullPointerException npe){
			System.err.println("Error when starting liveGraph, null pointer exception");
			npe.printStackTrace();
		} catch (Exception e){
			System.err.println("Error when starting liveGraph");
			e.printStackTrace();
		}
	}

}
