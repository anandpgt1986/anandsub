package CTS_Training.ExceptionHandling;

//Java program to demonstrate working of throws
class Throws_Example2
{
 static void fun() throws IllegalAccessException  //show by removing throws
 {
     System.out.println("Inside fun(). ");
     throw new IllegalAccessException("123");
 }
 public static void main(String args[])
 {
     try
     {
         fun();
     }
     catch(IllegalAccessException e)
     {
         System.out.println("caught in main.");
     }
 }
}
