class Mythread extends Thread 
    {
        @Override 
        public void run()
            {
                System.out.println("task is running");

            }
    }
public class mainThread 
{
    public static void main(String args[])
        {
            Mythread t1 = new Mythread();
            t1.start();
        }
}  