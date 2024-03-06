package threadconcept;

public class Threadimpl {

	public static void main(String[] args) {
		NumberThread t1=new NumberThread();
		t1.setName("Numbers");
		t1.start();
		MultipleThread m1=new MultipleThread();
		m1.setName("Multiples");
		m1.start();
		
	}
 
}
//extends thread
class NumberThread extends Thread
{
	public void run()
	{
		for(int i=1;i<=10;i++)
		{
			System.out.println(i+currentThread().getName());
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
}
class MultipleThread extends Thread
{
	public void run()
	{
		for(int i=5;i<=50;i+=5)
		{
			System.out.println(i+currentThread().getName());
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
}
		

