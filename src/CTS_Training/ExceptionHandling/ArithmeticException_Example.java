package CTS_Training.ExceptionHandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class ArithmeticException_Example {

	public static void main(String[] args) {
		try {
			int a = 10 / 0;
		}

		catch (ArithmeticException e) {
			System.out.println(e);
		}

		System.out.println("rest of the code...");

	}

//code without handling the exception
	
//	 public static void main(String[] args) {
//	
//	 int a=50/0; //error thrown in execution time
//	
//	 System.out.println("rest of the code..."); //this line wont be printed
//	
//	 }

}
