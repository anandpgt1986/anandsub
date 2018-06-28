package CTS_Training.Polymorphism;

class parent {
	 public void work() {
	  System.out.println("Parent is under retirement from work.");
	 }
	}

	class child1 extends parent { //same as extends
	 public void work() {
	  System.out.println("Child1 has a job");
	  System.out.println("He is doing it well");
	  //super.work();//to call the parent class
	 }
	
	 
//	 class child2 extends parent { //same as extends
//		 public void work() {
//		  System.out.println("Child2 has a job");
//		  System.out.println("He is doing it well");
//		  //super.work();//to call the parent class
//		 }
//	 }
	 
	 public static void main(String args[]) {
//	  child c1 = new child();
//	  c1.work();
	  
	  parent p1=new child1();
	  p1.work();
	  
//	  parent p2=new child2();
//	  p2.work();
	  
	 }
	}
	
	
	
	
	

