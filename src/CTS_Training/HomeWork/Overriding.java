
//Consider a scenario, Bank is a class that provides method to get the rate of interest. But, rate of interest may differ according to banks. For example, SBI, ICICI and AXIS banks are providing 8.4%, 7.3% and 9.7% rate of interest.
//Create the base and  overriding classes and print out the various percentages

package CTS_Training.HomeWork;

class Bank{  
float getRateOfInterest() 
	{
	return 0;
	}  
}  
class SBI extends Bank{  
float getRateOfInterest()
	{
	return 8.4f;
	}  
}  
class ICICI extends Bank{  
float getRateOfInterest()
	{
	return 7.3f;
	}  
}  
class AXIS extends Bank{  
float getRateOfInterest()
	{
	return 9.7f;
	}  
}  
class TestPolymorphism{  
public static void main(String args[]){  
Bank b;  
b=new SBI();  
System.out.println("SBI Rate of Interest: "+b.getRateOfInterest());  
b=new ICICI();  
System.out.println("ICICI Rate of Interest: "+b.getRateOfInterest());  
b=new AXIS();  
System.out.println("AXIS Rate of Interest: "+b.getRateOfInterest());  
}  
}  