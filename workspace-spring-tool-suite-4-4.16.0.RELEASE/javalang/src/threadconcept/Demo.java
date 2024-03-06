package threadconcept;
class Task {
int i=1;
static int d=0;
}
class DemoTask implements Runnable
{
	static char c='A';
	
	public void run() {
		for(;c<='Z';c++)
		{
			System.out.println(Thread.currentThread().getName()+" "+c);
		}
		
	}
	
}
public class Demo
{
	public static void main(String ar[])
	{
		Task t=null;//reference
		/*System.out.println("static var:"+t.d);//0//Null pointer
		System.out.println("instance var:"+t.i);//Null pointer*/
		Thread t1=new Thread();
		Thread t2=new Thread();
		t1.setName("Apple");//A C
		t2.setName("Banana");// A B D
		t1.start();//
		t2.start();
		
		
	}
}