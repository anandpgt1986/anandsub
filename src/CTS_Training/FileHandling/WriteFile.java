//We can use FileWriter, BufferedWriter, Files or FileOutputStream to write file in java. 
//Below code snippet use Stream to write data to file.

package CTS_Training.FileHandling;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class WriteFile {

	public static void main(String[] args) throws IOException { 
		Writer writer = null;

		try {
		    writer = new BufferedWriter(new OutputStreamWriter(
		          new FileOutputStream("data.txt"), "utf-8"));
		    writer.write("Hello Everybody!. I am updating the file");
		} catch (IOException ex) {
			
			System.out.println("No file found");
		    
		} finally {
		   try {writer.close();} catch (Exception ex) {/*ignore*/}
		}
		}
	}

