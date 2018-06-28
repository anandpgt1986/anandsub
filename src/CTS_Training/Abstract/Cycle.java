package CTS_Training.Abstract;

abstract class Cycle {
	 abstract void work();
	}

	class HeroCycle extends Cycle { //try to comment next 2 lines and show
	 void work() {
	  System.out.println("Selling good");
	 }
	 
	 public static void main(String argu[]) {
	  Cycle o = new HeroCycle(); //note that here we are creating object for HeroCycle rather than Cycle
	  //(you CANNOT create Objects from an Abstract Class! )
	  o.work();
	  System.out.println("Code executed");
	 }
	 
	}