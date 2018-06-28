package CTS_Training.Inheritance;

class Teacher {
 void teach() {
  System.out.println("Teaching subjects");
 }
}

class Students extends Teacher {
 void listen() {
  System.out.println("Listening to teacher");
 }
}

class CheckForInheritance {
 public static void main(String args[]) {
  Students s1 = new Students();
  s1.listen();
  s1.teach();
 }
}