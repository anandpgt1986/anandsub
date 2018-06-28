package CTS_Training.Polymorphism;

class Sum {
	 void sum(int a, int b) {
	  System.out.println("Sum of two=" + (a + b));
	 }
	 
	 
	 void sum(int a, int b, int c) {
	  System.out.println("Sum of three=" + (a + b + c));
	 }
	 
	 void sum(String  a, String b) {
		  System.out.println("Concatenated value is " + (a + b));
		 } 
	}

class Polymorphism {
	 public static void main(String args[]) {
	  Sum s= new Sum();
	  s.sum(6, 10);
	  s.sum(10, 6, 5);
	  s.sum("Hello","World");
	 }
	}
