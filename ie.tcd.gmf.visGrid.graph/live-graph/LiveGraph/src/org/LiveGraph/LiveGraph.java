package org.LiveGraph;

import javax.swing.JOptionPane;

import org.LiveGraph.bootstrap.CommandLineProcessor;
import org.LiveGraph.bootstrap.UpgradeManager;
import org.LiveGraph.dataCache.DataCache;
import org.LiveGraph.dataCache.DataStreamToCacheReader;
import org.LiveGraph.dataCache.UpdateInvoker;
import org.LiveGraph.events.EventManager;
import org.LiveGraph.gui.GUIManager;
import org.LiveGraph.plot.GraphExporter;
import org.LiveGraph.plot.Plotter;
import org.LiveGraph.settings.DataFileSettings;
import org.LiveGraph.settings.DataSeriesSettings;
import org.LiveGraph.settings.GraphSettings;

import com.softnetConsult.utils.exceptions.ThrowableTools;


/**
 * This is the main executable class of the LiveGraph plotter application.
 * An instance of this class represents the application itself. The task of this
 * class is to interpret the command line parameters, to set-up and to start-up
 * the GUI and the back-end of the application, and to provide some
 * functions which are used by different modules of the application to communicate
 * with each other and to access global data, such as settings.
 * 
 * <p style="font-size:smaller;">This product includes software developed by the
 *    <strong>LiveGraph</strong> project and its contributors.<br />
 *    (<a href="http://www.live-graph.org" target="_blank">http://www.live-graph.org</a>)<br />
 *    Copyright (c) 2007-2009 G. Paperin.<br />
 *    All rights reserved.
 * </p>
 * <p style="font-size:smaller;">File: LiveGraph.java</p>
 * <p style="font-size:smaller;">Redistribution and use in source and binary forms, with or
 *    without modification, are permitted provided that the following terms and conditions are met:
 * </p>
 * <p style="font-size:smaller;">1. Redistributions of source code must retain the above
 *    acknowledgement of the LiveGraph project and its web-site, the above copyright notice,
 *    this list of conditions and the following disclaimer.<br />
 *    2. Redistributions in binary form must reproduce the above acknowledgement of the
 *    LiveGraph project and its web-site, the above copyright notice, this list of conditions
 *    and the following disclaimer in the documentation and/or other materials provided with
 *    the distribution.<br />
 *    3. All advertising materials mentioning features or use of this software or any derived
 *    software must display the following acknowledgement:<br />
 *    <em>This product includes software developed by the LiveGraph project and its
 *    contributors.<br />(http://www.live-graph.org)</em><br />
 *    4. All advertising materials distributed in form of HTML pages or any other technology
 *    permitting active hyper-links that mention features or use of this software or any
 *    derived software must display the acknowledgment specified in condition 3 of this
 *    agreement, and in addition, include a visible and working hyper-link to the LiveGraph
 *    homepage (http://www.live-graph.org).
 * </p>
 * <p style="font-size:smaller;">THIS SOFTWARE IS PROVIDED &quot;AS IS&quot;, WITHOUT WARRANTY
 *    OF ANY KIND, EXPRESSED OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF
 *    MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND  NONINFRINGEMENT. IN NO EVENT SHALL
 *    THE AUTHORS, CONTRIBUTORS OR COPYRIGHT  HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 *    LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING  FROM, OUT OF OR
 *    IN CONNECTION WITH THE SOFTWARE OR THE USE OR  OTHER DEALINGS IN THE SOFTWARE.
 * </p> 
 *  
 * @author Greg Paperin (<a href="http://www.paperin.org" target="_blank">http://www.paperin.org</a>)
 * @version {@value org.LiveGraph.LiveGraph#version}
 */
public class LiveGraph {

/**
 * LiveGraph software version.
 */
public static final String version = "2.0.beta02";

// Static stuff {

/**
 * Singleton application instance.
 */
private static LiveGraph app = null;

/**
 * Singleton application access method.
 * 
 * @return The singleton application object.
 */
public static LiveGraph application() {
	if (null == LiveGraph.app)
		LiveGraph.app = new LiveGraph();
	return LiveGraph.app;
}

/**
 * Program entry point.
 * Creates an application instance and calls the {@link #execStandalone(String[])} method.
 * 
 * @param args Command line parameters.
 */
public static void main(String [] args) {	
	LiveGraph.application().execStandalone(args);
}

// } end of static stuff.


private EventManager eventManager = null;
private GUIManager guiManager = null;
private DataCache dataCache = null;
private UpgradeManager upgradeManager = null;
private boolean initialised = false;
private boolean standAlone = false;

private Thread.UncaughtExceptionHandler commonDefaultUncaughtExceptionHandler = null;

/**
 * Application's data update invoker.
 */
private UpdateInvoker updateInvoker = null;


/**
 * Holds the data file settings for the application.
 */
private DataFileSettings dataFileSettings = null;

/**
 * Holds the graph settings for the application.
 */
private GraphSettings graphSettings = null;

/**
 * Holds the data series settings for the application.
 */
private DataSeriesSettings seriesSettings = null;

/**
 * Holds the graph exporter.
 */
private GraphExporter graphExporter = null;


public void execStandalone() {
	execStandalone(new CommandLineProcessor());
}

/**
 * Main program method.
 * It parses the command line parameters, sets up the GUI and the back-end components
 * of the application and configures the their communication. It then loads the default
 * settings and passes the execution control to the main Swing GUI loop. 
 * 
 * @param args Command line arguments.
 */
public void execStandalone(String[] args) {
	execStandalone(new CommandLineProcessor(args));
}

public void execStandalone(CommandLineProcessor cmdLn) {
	
	// Ensure command line info is present:
	if (null == cmdLn)
		cmdLn = new CommandLineProcessor();
	
	// Start engine:
	execEngine();
	standAlone = true;
	
	// Set up application upgrade manager:
	upgradeManager = new UpgradeManager();
	
	// Create application windows:
	guiManager.createPlotWindow();
	guiManager.setDisplayPlotWindows(true);
	
	guiManager.createSeriesSettingsWindow();
	guiManager.setDisplaySeriesSettingsWindows(true);
	
	guiManager.createDataFileSettingsWindow();
	guiManager.setDisplayDataFileSettingsWindows(false);
	
	guiManager.createGraphSettingsWindow();
	guiManager.setDisplayGraphSettingsWindows(false);
	
	guiManager.createMessageWindow();
	guiManager.setDisplayMessageWindows(false);
	
	// Display any possible error messages about the command line arguments:
	if (cmdLn.hasErrors()) {
		String errMsg = cmdLn.getErrorMessages();
		System.out.println();
		System.out.println(errMsg);
		guiManager.logErrorLn(errMsg);
	}
	
	// Load default or command-line specified graph settings:
	if (null != cmdLn.getFile_GraphSettings()) {
		String fn = cmdLn.getFile_GraphSettings().getAbsolutePath();
		guiManager.logInfoLn("Attempting to load initial graph settings from \"" + fn + "\".");
		if (!graphSettings.load(fn))
			guiManager.logErrorLn("Error while loading initial graph settings from \"" + fn + "\".");
	}
	
	// Load default or command-line specified data series settings:
	if (null != cmdLn.getFile_DataSeriesSettings()) {
		String fn = cmdLn.getFile_DataSeriesSettings().getAbsolutePath();
		guiManager.logInfoLn("Attempting to load initial data series settings from \"" + fn + "\".");
		if (!seriesSettings.load(fn))
			guiManager.logErrorLn("Error while loading initial data series settings from \"" + fn + "\".");
	}
	
	// Load default or command-line specified data file settings:
	if (null != cmdLn.getFile_DataFileSettings()) {
		String fn = cmdLn.getFile_DataFileSettings().getAbsolutePath();
		boolean ignoreDataFile = (null != cmdLn.getFile_Data());
		guiManager.logInfoLn("Attempting to load initial data file settings from \"" + fn + "\".");
		if (!dataFileSettings.load(fn, ignoreDataFile))
			guiManager.logErrorLn("Error while loading initial data file settings from \"" + fn + "\".");
	}
	
	// Load command-line specified data file:
	if (null != cmdLn.getFile_Data()) {
		String fn = cmdLn.getFile_Data().getAbsolutePath();
		guiManager.logInfoLn("Attempting to read initial data from \"" + fn + "\".");
		dataFileSettings.setDataFile(fn);
	}
	
	// Initiate automatik upgrade check if needed:
	upgradeManager.autoUpdate();
}

public synchronized void execEngine() {
	
	if (initialised)
		throw new IllegalStateException("Cannot start LiveGraph engine as it is already running");
	
	// Setup exception handling:
	installUncaughtExceptionHandler();
	
	// Create the global event manager:
	eventManager = new EventManager();
	eventManager.addShutDownHook(new TidyUpAfterEventManagerShutDown());
	
	// Create the data cache:
	dataCache = new DataCache();
	
	// Create the data reader:
	DataStreamToCacheReader dataReader = new DataStreamToCacheReader(dataCache);
	eventManager.registerListener(dataReader);
	
	// Create the global GUI manager:
	guiManager = new GUIManager();
	guiManager.setDataCache(dataCache);
	
	// Create settings holder objects:
	dataFileSettings = new DataFileSettings();
	graphSettings = new GraphSettings();
	seriesSettings = new DataSeriesSettings();
	
	// Create the data update invoker,
	// set-up its communication with the cache and other objects,
	// and create the data update invocation thread:	
	updateInvoker = new UpdateInvoker(dataCache);
	eventManager.registerListener(updateInvoker);
	Thread fileUpdateInvokerThread = new Thread(updateInvoker, "LiveGraph Update Invoker Thread");
	
	// Start the event dispatching thread:
	eventManager.startDispatchingEvents();

	// Start the data update invocation thread:
	fileUpdateInvokerThread.start();
	
	// Check for correct Java version and display an error message if wrong version is detected:
	if (!runsCorrectJavaVersion()) {
		JOptionPane.showMessageDialog(null, "The Java runtime environment you are using may not "
										  + "support all program features.\n\n"
										  + "LiveGraph is targeted for Java version 1.6 or later, "
										  + "however, it may run on earlier Java versions with a "
										  + "reduced feature set.\nNote that various error messages "
										  + "may be displayed when accessing the unsupported features.\n\n"
										  + "Your current Java version is " + getJavaSpecificationVersion(),
									  "Incompatible Java version", JOptionPane.WARNING_MESSAGE);
	}
	
	standAlone = false;
	initialised = true;
}


/**
 * Determines the current Java specification version. 
 * @return The current Java specification version or {@code "unknown"} if it could not be obtained.
 */
public String getJavaSpecificationVersion() {
	try {
		String ver = System.getProperty("java.specification.version"); 
		return (null == ver ? "unknown" : ver);
	} catch (Throwable e) {
		return "unknown";
	}
}

/**
 * Determines whether the currect Java version is appropriate. This is done based on the system
 * property {@code java.specification.version}. Java version {@code 1.6} or higher is considered ok.
 * @return Whether the currect Java version is appropriate.
 */
public boolean runsCorrectJavaVersion() {
	
	String specVer = getJavaSpecificationVersion();	
		
	if (specVer.equalsIgnoreCase("unknown"))
		return false;
	
	int p = specVer.indexOf(".");
	if (0 > p)
		return false;
	
	int mainVer = Integer.parseInt(specVer.substring(0, p));
	if (1 > mainVer)
		return false;
	if (1 < mainVer)
		return true;
	
	if (specVer.length() - 1 <= p)
		return false;
	
	int subVer =  Integer.parseInt(specVer.substring(p + 1, p + 2));
	if (6 > subVer)
		return false;
	
	return true;
}


/**
 * This method is called by the main window when it is closed. This method
 * initiates the disposing of all windows and the data update invocation
 * thread in order to correctly close the application and save all settings
 * to default files. API users should call ths method in order to shut down
 * LiveGraph.
 */
public void disposeGUIAndExit() {
	
	if (!initialised)
		throw new IllegalStateException("Cannot shut down LiveGraph since it is not running");
	
	if (standalone()) {
		try {
			dataFileSettings.save("session" + DataFileSettings.preferredFileExtension);
			graphSettings.save("session" + GraphSettings.preferredFileExtension);
			seriesSettings.save("session" + DataSeriesSettings.preferredFileExtension);
		} catch(SecurityException e) {}
	}
	
	if (null != graphExporter) {
		graphExporter.disposeInternalGUI();
		graphExporter = null;
	}
	
	updateInvoker.setMustQuit(true);
	updateInvoker = null;
	
	guiManager.disposeAllGUI();	
	eventManager.shutDownWhenFinished();
}

private class TidyUpAfterEventManagerShutDown implements EventManager.ShutDownHook {
	public void hasShutDown(EventManager evMan) {
		if (null == evMan || evMan != evMan)
			throw new IllegalArgumentException(""+evMan);
	    
		shutDown();
    }
}

private synchronized void shutDown() {
	
	if (null != updateInvoker)
		updateInvoker.setMustQuit(true);
	updateInvoker = null;
	
	if (null != commonDefaultUncaughtExceptionHandler) {
		try {
			Thread.setDefaultUncaughtExceptionHandler(commonDefaultUncaughtExceptionHandler);
		} catch (SecurityException e) { }
	}
	commonDefaultUncaughtExceptionHandler = null;
		
	eventManager = null;
	guiManager = null;
	dataCache = null;
	upgradeManager = null;
	dataFileSettings = null;
	graphSettings = null;
	seriesSettings = null;
	graphExporter = null;
	standAlone = false;
	initialised = false;
	LiveGraph.app = null;
}


/**
 * Gets the applications' global event manager.
 * 
 * @return Global event manager.
 */
public EventManager eventManager() {
	return this.eventManager;
}

/**
 * Gets the applications' global gui manager.
 * 
 * @return Global event manager.
 */
public GUIManager guiManager() {
	return this.guiManager;
}

public UpdateInvoker updateInvoker() {
	return this.updateInvoker;
}

public UpgradeManager upgradeManager() {
	return this.upgradeManager;
}

public boolean standalone() {
	return this.standAlone;
}

public boolean initialised() {
	return initialised;
}

/**
 * Gets the application's global data file settings.
 * 
 * @return Global data file settings.
 */
public DataFileSettings getDataFileSettings() {
	return dataFileSettings;
}

/**
 * Gets the application's global graph settings.
 * 
 * @return Global graph settings.
 */
public GraphSettings getGraphSettings() {
	return graphSettings;
}


/**
 * Gets the application's global data series settings.
 * 
 * @return Global data series settings.
 */
public DataSeriesSettings getDataSeriesSettings() {
	return seriesSettings;
}


/**
 * Get the exporter that can be used to create image representations of LiveGraph plots.
 * 
 * @return An exporter that can be used to create image representations of LiveGraph plots.
 */
public GraphExporter getGraphExporter() {
	if (null == graphExporter) {
		Plotter plotter = new Plotter(dataCache);
		eventManager.registerListener(plotter);
		graphExporter = new GraphExporter(plotter);
	}
	return graphExporter;
}



/**
 * Installs an uncaught exception handler that logs errors to the message window
 * as well as to the colsole.
 */
private void installUncaughtExceptionHandler() {
	
	try {
		commonDefaultUncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler();
		UncaughtExceptionHandler handler = new UncaughtExceptionHandler();
		Thread.setDefaultUncaughtExceptionHandler(handler);
		
	} catch (SecurityException e) {
		commonDefaultUncaughtExceptionHandler = null;
		System.err.println("LiveGraph has no permission to install a custom exception handler."
						 + " Will run without one.");		
		System.out.println("LiveGraph has no permission to install a custom exception handler."
						 + " Will run without one.");
	}
}


private class UncaughtExceptionHandler implements Thread.UncaughtExceptionHandler {
	public void uncaughtException(Thread t, Throwable e) {
		synchronized(System.err) {
			System.err.println("Error in thread \"" + t.getName() + "\":");
			e.printStackTrace(System.err);
		}
		if (null != guiManager && null != updateInvoker) {
			String err = String.format("Error in thread \"%d\":%n%s",
									   t.getName(),
									   ThrowableTools.stackTraceToString(e));
			guiManager.logErrorLn(err);
		}
    }
} // private class UncaughtExceptionHandler

} // public class LiveGraph
