package exception;
import java.util.*;
public class ThreadRunnable {

	public static void main(String[] args) {
		NumberThread t1=new NumberThread();
		t1.setName("Numbers");
		t1.run();
		MultiplesThread m1=new MultiplesThread();
		m1.setName("Multiples");
		m1.run();

	}

}
abstract class NumbersThread implements Runnable
{
	public void runnable()
	{
		for(int i=1;i<=10;i+=2)
		{
			if(i%2==0)
			System.out.println(i+currentThread().getName());
			try {
				Thread.sleep(1000);
			}
			catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		}
	}
	
}
class MultiplesThread extends Thread
{
	public void runnable()
	{
		for(int i=1;i<=10;i+=2)
		{
			if(i%2!=0)
			System.out.println(i+currentThread().getName());
			try {
				Thread.sleep(1000);
			} 
			catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		}
	}
	
}
