package CTS_Training.Constructors;


 public class ParameterizedConstructor{
 public ParameterizedConstructor(int a, int b){ 
  System.out.print("Parameterized Constructor");
  System.out.println(" having Two parameters");
 }
  public ParameterizedConstructor(int a, int b, int c){
  System.out.print("Parameterized Constructor");
  System.out.println(" having Three parameters");
 }
  public static void main(String args[]){
  ParameterizedConstructor pc1 = new ParameterizedConstructor(12, 12);// we are saving a new line here with a constructor. 
 //Otherwise we might have to create a new line for the method
  ParameterizedConstructor pc2 = new ParameterizedConstructor(1, 2, 13);
  
 }
}

 