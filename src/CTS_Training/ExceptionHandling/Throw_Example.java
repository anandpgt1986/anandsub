package CTS_Training.ExceptionHandling;

public class Throw_Example {
	static void validate(int age) {
		if (age < 18)
			throw new ArithmeticException("not valid age");
		else
			System.out.println("welcome to vote");
	}

	public static void main(String args[]) {
		validate(13);
		System.out.println("rest of the code...");
	}
}
