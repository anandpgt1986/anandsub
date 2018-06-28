package CTS_Training.Inheritance;

class Teacher2 {
	 void teach() {
	  System.out.println("Teaching subject");
	 }
	}

	class Student2 extends Teacher2 {
	 void listen() {
	  System.out.println("Listening");
	 }
	}
	
	class Principal extends Teacher2 {
	 void evaluate() {
	  System.out.println("Evaluating");
	 }
	}
	
	class CheckForInheritance2 {
	 public static void main(String argu[]) {
	  Principal p = new Principal();
	  p.evaluate();
	  p.teach();
	  //p.listen(); //will produce an error
	  
	
	  
	  
	 }
	}