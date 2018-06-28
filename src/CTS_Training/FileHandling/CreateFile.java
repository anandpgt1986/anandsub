//createNewFile() method returns true if file is successfully created, otherwise it returns false.

package CTS_Training.FileHandling;

import java.io.File;
import java.io.IOException;

public class CreateFile {

	public static void main(String[] args) { //executing the 2nd tile would return false since file is already created
		File file = new File("data1.abcde");
		try {
			boolean createNewFile = file.createNewFile();
			System.out.println("File Created = "+createNewFile);
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}
}