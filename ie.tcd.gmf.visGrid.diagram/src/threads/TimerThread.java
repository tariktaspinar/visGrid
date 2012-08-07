package threads;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.channels.FileChannel;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchWindow;

import visGrid.diagram.edit.parts.HouseAir_temperatureEditPart;
import visGrid.diagram.part.VisGridDiagramEditor;

public class TimerThread implements Runnable{
	public HouseAir_temperatureEditPart h;
	
	public TimerThread(HouseAir_temperatureEditPart houseAir_temperatureEditPart) {
		this.h = houseAir_temperatureEditPart;
	}

	public void run() {
		while (true){
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}