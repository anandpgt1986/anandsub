package CTS_Training.ExceptionHandling;

class tst 
{
    public static void main(String[] args) throws InterruptedException //show by removing throws
    {
        Thread.sleep(3000);
        System.out.println("Hello Geeks");
    }
    

}

// In the above program, we are getting compile time error because there is a chance of exception if the main thread is 
//going to sleep,other threads get the chance to execute main() method which will cause InterruptedException.