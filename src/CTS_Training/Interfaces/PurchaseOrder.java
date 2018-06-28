package CTS_Training.Interfaces;



public interface PurchaseOrder{

void discount();
}


class B2BPO implements PurchaseOrder{
	public void discount() {
	System.out.println("10");

	} 
}


class B2CPO implements PurchaseOrder{
	public void discount() {
	System.out.println("20");
	}
}

class Execution
{
	public static void main(String args[]){
		B2BPO myB2B = new B2BPO();
		myB2B.discount();
		
		B2CPO myB2C = new B2CPO();
		myB2C.discount();
		
		  
	}
}
