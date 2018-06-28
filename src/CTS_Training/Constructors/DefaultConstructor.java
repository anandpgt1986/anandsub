package CTS_Training.Constructors;

class clerk{
 int roll=101;
   String grade="Manager";
   void display(){System.out.println(roll+" "+grade);
   }
   
   public static void main(String args[]){
   clerk c1=new clerk();// we are actually invoking the constructor here
   clerk c2=new clerk();
  c1.display();
  c2.display();
 }
}
