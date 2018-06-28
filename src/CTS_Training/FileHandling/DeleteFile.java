//File class delete method is used to delete a file or an empty directory. Below is a simple example to delete a file.
package CTS_Training.FileHandling;


import java.io.File;

public class DeleteFile {

	public static void main(String[] args) {
		File file = new File("data.txt");
		file.delete();
		//boolean delete = file.delete();
		//System.out.println("File deleted = " + delete);
	}
}