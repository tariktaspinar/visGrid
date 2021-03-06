package org.LiveGraph.dataFile.write;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.LiveGraph.dataFile.read.PipedInputStream;

import com.softnetConsult.utils.files.FileTools;
import com.softnetConsult.utils.sys.SystemTools;



/**
 * This class provides static convenience methods for creating dedicated data stream writers.
 * Given just a directory on the local hard drive, this class can automatically
 * choose a descriptive and unique name for a data file and return an appropriate
 * {@link DataStreamWriter} object.<br />
 * <br />
 * An example of how to use this class can be found in
 * {@link org.LiveGraph.demoDataSource.LiveGraphDemo}.<br />
 * 
 * <p style="font-size:smaller;">This product includes software developed by the
 *    <strong>LiveGraph</strong> project and its contributors.<br />
 *    (<a href="http://www.live-graph.org" target="_blank">http://www.live-graph.org</a>)<br />
 *    Copyright (c) 2007-2009 G. Paperin.<br />
 *    All rights reserved.
 * </p>
 * <p style="font-size:smaller;">File: DataStreamWriterFactory.java</p> 
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
public class DataStreamWriterFactory {

/**
 * Data file extension used if no other specified.
 */
public static final String defaultFileExtension = "lgdat";
// Custom
private static File objFile;


/**
 * Creates a new {@link DataStreamWriter} object to write to the specified {@code PipedInputStream}.
 * Use this method to create writers to use with the memory stream mode.
 * @param pipedInputStream The input stream to which the data will be directed.
 * @return A new data stream writer connected to the specified piped stream.
 * @throws IOException If an error occurs when creating the piped streams (e.g. when the
 * {@code PipedInputStream} is already connected or in other cases).
 */
public static DataStreamWriter createDataWriter(PipedInputStream pipedInputStream) throws IOException {
	PipedOutputStream outs = new PipedOutputStream(pipedInputStream);
	DataStreamWriter outw = new DataStreamWriter(outs);
	return outw;
}

/**
 * Creates a new {@link DataStreamWriter} object for a unique file whose name is created
 * on the basis of the specified base name and directory as well as an optional
 * timestamp and an optional counter to make the file name unique.<br />
 * This method is a convenience shorthand for
 * {@code createDataWriter(dataFileDir, dataFileBaseName, defaultFileExtension)}, where
 * {@code DataStreamWriterFactory.defaultFileExtension} = {@value #defaultFileExtension}.
 * See the {@linkplain #createDataWriter(String, String, String) three parameters version}
 * for details.
 * 
 * @param dataFileDir The directory where the data file will be created.
 * @param dataFileBaseName The base name for the data file.
 * @return A new {@link DataStreamWriter} for the file created from the specifed values.
 * @throws DataFileAlreadyExistsException If the specified files exists and canot be
 * overwritten.
 * @see #createDataWriter(String, String, String)
 * @see com.softnetConsult.utils.files.FileTools#findUniqueFile(String, String, String, boolean)
 */
public static DataStreamWriter createDataWriter(String dataFileDir, String dataFileBaseName) {
	return createDataWriter(dataFileDir, dataFileBaseName, defaultFileExtension);
}


/**
 * Creates a new {@link DataStreamWriter} object for a unique file whose name is created
 * on the basis of the specified base name, extension and directory as well as an optional
 * timestamp and an optional counter to make the file name unique.<br />
 * If despite of the unique file name an output stream cannot be open (this may happen
 * with a small probability in the case of several competing processes) the semantics of
 * this method are the same as for {@link #createDataWriter(File, boolean)} (with
 * {@code overwrite = false}).<br />
 * <br />
 * This method uses the library method
 * {@link com.softnetConsult.utils.files.FileTools#findUniqueFile(String, String, String, boolean)}
 * for generating a unique file path (with {@code alwaysUseTimestamp = false}).
 * The semantics are as follows:<br /> 
 * 1) A file name is created on the basis of the specified directory, base name and extension.
 * (e.g. &quot;{@code directory/simulation.lgdat}&quot;).<br />
 * 2) If the specified file name contains a substring that defines a timestamp marker
 * (the string &quot;{@value com.softnetConsult.utils.files.FileTools#FILE_NAME_UNIQUE_MAKER_TAG}&quot;),
 * the marker is replaced by a timestamp based on the current system time. If the specified file
 * name does not contain a timestamp marker, no timespamp is inserted.
 * Executed on 20 Jan 2008 at 18:30:15 the result may look like this:
 * &quot;{@code directory/simulation.08.01.20-18.30.15.lgdat}&quot;.<br />
 * 3) If no physical file with the resulting file name exists already, this file name is used.
 * If a file with the resulting path exists, a counter is inserted just before the extension.
 * The result may look like this:
 * &quot;{@code directory/simulation.08.01.20-18.30.15(1).lgdat}&quot;.<br />
 * 4) The uniqueness counter is increased (starting with 1) until the resulting file name
 * does not describe a physical file that already exists.<br />
 * 
 * @param dataFileDir The directory where the data file will be created.
 * @param dataFileBaseName The base name for the data file.
 * @param dataFileExt The extension of the data file.
 * @return A new {@link DataStreamWriter} for the file created from the specifed values.
 * @throws DataFileAlreadyExistsException If the specified files exists and canot be
 * overwritten. 
 * @see com.softnetConsult.utils.files.FileTools#findUniqueFile(String, String, String, boolean)
 */
public static DataStreamWriter createDataWriter(String dataFileDir,
												String dataFileBaseName, String dataFileExt) {
	
	setObjFile(FileTools.findUniqueFile(dataFileDir, dataFileBaseName, dataFileExt, false));
	return createDataWriter(getObjFile(), false);
}


/**
 * Creates a new {@link DataStreamWriter} object for the specified file path. <br />
 * If the file already exists, it may be overwritten if {@code overwrite} is {@code true}.<br />
 * If a file output stream cannot be opened either becasue the file already exists and
 * {@code overwrite} is {@code false} or for any other reason, the stream creation will be
 * attempted again several times with a short random delay that increases after each attempt. <br />
 * If after several attempts the file stream could not be opened, a
 * {@code DataFileAlreadyExistsException} will be raised.<br />
 * This is equivalent to {@code createDataWriter(new File(filePath), overwrite)}.
 * 
 * @param filePath Path of the file to which the new {@link DataStreamWriter} is to write its output.
 * @param overwrite Whether to attempt overwriting the specified file it is exists.
 * @return A new {@link DataStreamWriter} for the specified file.
 * @throws NullPointerException If the specified file is {@code null}.
 * @throws DataFileAlreadyExistsException If the specified files exists and canot be
 * overwritten.
 */
public static DataStreamWriter createDataWriter(String filePath, boolean overwrite) {
	
	if (null == filePath)
		throw new NullPointerException("Cannot create a DataStreamWriter for a null file");
	
	return createDataWriter(new File(filePath), overwrite);
}


/**
 * Creates a new {@link DataStreamWriter} object for the specified file. <br />
 * If the file already exists, it may be overwritten if {@code overwrite} is {@code true}.<br />
 * If a file output stream cannot be opened either becasue the file already exists and
 * {@code overwrite} is {@code false} or for any other reason, the stream creation will be
 * attempted again several times with a short random delay that increases after each attempt. <br />
 * If after several attempts the file stream could not be opened, a
 * {@code DataFileAlreadyExistsException} will be raised.
 * 
 * @param file A file to which the new {@link DataStreamWriter} is to write its output.
 * @param overwrite Whether to attempt overwriting the specified file it is exists.
 * @return A new {@link DataStreamWriter} to the specified file.
 * @throws NullPointerException If the specified file is {@code null}.
 * @throws DataFileAlreadyExistsException If the specified files exists and canot be
 * overwritten.
 */
public static DataStreamWriter createDataWriter(File file, boolean overwrite) {

	if (null == file)
		throw new NullPointerException("Cannot create a DataStreamWriter for a null file");
	
	final int[] MAX_WAIT = new int[] {1000, 1000, 1000, 1500, 1500, 2000, 2000, 2000, 3000, 3000};
	final int[] MIN_WAIT = new int[] { 100,  100,  100,  500,  500, 1000, 1000, 1000, 1500, 2000};
	
	IOException failureReason = null;
	for (int retry = 0; retry < MAX_WAIT.length; retry++) {
		
		if (overwrite && file.exists())
			file.delete();
		
		if (!file.exists()) {		
			try {
				FileOutputStream outs = new FileOutputStream(file);
				DataStreamWriter writer = new DataStreamWriter(outs, file);
				return writer;
			} catch (IOException e) { }
		}
		int w = MIN_WAIT[retry] + (int) (Math.random() * (MAX_WAIT[retry] - MIN_WAIT[retry]));
		SystemTools.sleep(w);
	}
	
	DataFileAlreadyExistsException dfaee = new DataFileAlreadyExistsException(file);
	if (null != failureReason)
		dfaee.initCause(failureReason);
	throw dfaee;
}

public static File getObjFile() {
	return objFile;
}

public static void setObjFile(File newFile) {
	objFile = newFile;
}

} // public class DataStreamWriterFactory
