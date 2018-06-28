package CTS_Training.FileHandling;

import java.io.File;
import java.io.IOException;

class ChangeFilePermissions {

	public static void main(String[] args) throws IOException { 
File file = new File("data.txt");

//check file permissions for application user
System.out.println("File is readable? "+file.canRead());
System.out.println("File is writable? "+file.canWrite());
System.out.println("File is executable? "+file.canExecute());

//change file permissions for application user only

file.setWritable(true); //change to false and execute the WriteFile.java

System.out.println("File is writable after running command? "+file.canWrite());


	}
}
