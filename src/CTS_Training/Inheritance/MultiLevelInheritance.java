package CTS_Training.Inheritance;

class Teacher1 {//show what happens if I change to Teacher
	 void teach() {
	  System.out.println("Teaching subject");
	 }
	}

	class Student extends Teacher1 {
	 void listen() {
	  System.out.println("Listening");
	 }
	}
	
	class homeTution extends Student {
	 void explains() {
	  System.out.println("Does homework");
	 }
	}
	
	class CheckForInheritance1 {
	 public static void main(String argu[]) {
	  homeTution h = new homeTution();
	  h.explains();
	  h.teach();
	  h.listen();
	 }
	}
