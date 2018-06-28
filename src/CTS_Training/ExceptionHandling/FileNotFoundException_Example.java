package CTS_Training.ExceptionHandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class FileNotFoundException_Example {

	public static void main(String[] args) {
		File file = new File("ABC.txt");

		try {
			FileReader fr = new FileReader(file.getAbsoluteFile());
		} catch (FileNotFoundException e1) { // FileNotfound is sub class of IO Exception, which is Checked exception

			e1.printStackTrace();
		}
		
//code without handling the exception - below code would throw error
		
//		public static void main(String[] args) {
//			File file = new File("ABC.txt");
//
//			FileReader fr = new FileReader(file.getAbsoluteFile());  //error would be thrown in compile time itself
//		
//
//	}
//		
//	}

	}
}
