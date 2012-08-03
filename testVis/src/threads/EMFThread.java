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
import java.util.List;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.gmf.runtime.diagram.ui.editparts.DiagramEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITextAwareEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ShapeNodeEditPart;
import org.eclipse.gmf.runtime.notation.Shape;
import org.eclipse.gmf.runtime.notation.impl.DecorationNodeImpl;
import org.eclipse.gmf.runtime.notation.impl.ShapeImpl;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchWindow;

import visGrid.diagram.edit.parts.HouseEditPart;
import visGrid.diagram.part.VisGridDiagramEditor;

import http.Property;

public class EMFThread implements Runnable{
	public IFile file;
	public IProject proj;
	public IWorkbenchWindow window;

	public EMFThread(IFile file, IProject proj, IWorkbenchWindow window){
		this.file = file;
		this.proj = proj;
		this.window = window;
	}

	public static void copyFile(File sourceFile, File destFile) throws IOException { // Method to copy a file
		if(!destFile.exists()) {
			destFile.createNewFile();
		}

		FileChannel source = null;
		FileChannel destination = null;

		try {
			source = new FileInputStream(sourceFile).getChannel();
			destination = new FileOutputStream(destFile).getChannel();
			destination.transferFrom(source, 0, source.size());
		}
		finally {
			if(source != null) {
				source.close();
			}
			if(destination != null) {
				destination.close();
			}
		}
	}

	public void run() {
		while (true){
			try{

				/*File outFile = new File(file.getLocation().toOSString()+".swp");
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
						int valFirst = line.indexOf("name=") + 6;
						int valSecond = line.indexOf("\"",valFirst);
						int propFirst, propSecond;
						String name = line.substring(valFirst,valSecond);

						// Until we reach the end of the line (the next sequence is " />" basically)
						while (valSecond < line.length()-3){ // Less than the /> at the end of the line		
							propFirst = valSecond+2; // There will be a space and then the attribute
							propSecond = line.indexOf("=",propFirst);
							String prop = line.substring(propFirst, propSecond).trim(); // name of the property
							String val = http.Property.getValueOfProperty(name,prop); // get http propeprties
							valFirst = line.indexOf("\"",propSecond);
							valSecond = line.indexOf("\"",valFirst+1);
							line = line.substring(0,valFirst+1) + val + line.substring(valSecond,line.length()); // Longhand way of replacing the val with the new val
							valSecond = valSecond + (val.length() - (valSecond-valFirst)) + 1; // update valSecond to the values of the new line, which may have changed size
						}
					}
					out.write(line);
					out.write('\n');
				}

				in.close();
				out.close();
				//copyFile(outFile,new File(file.getLocation().toOSString())); // Copy the swap file to the original file
				 */
				IWorkbenchPage page = window.getActivePage();
				IEditorPart part = page.getActiveEditor();
				if (part instanceof VisGridDiagramEditor){
					VisGridDiagramEditor editor= (VisGridDiagramEditor)part;
					DiagramEditPart diagrampart = editor.getDiagramEditPart();
					List list = diagrampart.getChildren();
					for (int i=0;i<list.size();i++){ 
						ShapeNodeEditPart edit = (ShapeNodeEditPart) list.get(i);
						String mainObjectType = ((String[]) edit.toString().split("EditPart"))[0]; // Parses type eg "House" from class name
						List children2 = ((ShapeNodeEditPart)edit).getChildren();
						String mainObjectName = ((ITextAwareEditPart) children2.get(0)).getEditText();				
						for (int j=1;j<children2.size();j++){
							ITextAwareEditPart shapenode = (ITextAwareEditPart) children2.get(j); // NB the val is stored at shapenode.getEditText()
							String attributeName = ((String[])shapenode.toString().split("EditPart"))[0].replace(mainObjectType, "");
							String updatedVal = Property.getValueOfProperty(mainObjectName,attributeName.toLowerCase());
							if (updatedVal == null) updatedVal = Property.getValueOfProperty(mainObjectName,attributeName);
							if (updatedVal != null) {
								shapenode.setLabelText(updatedVal);
							}
							else System.out.println("No Property found for: " +mainObjectName+", "+attributeName);
						}
					}
				}

				//proj.refreshLocal(2, null);
			} catch (Exception e){
				e.printStackTrace();
				continue;
			}
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}