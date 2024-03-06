package threadMethod;

public class Test {
public static void main(String[] args) {
		
		WareHouse ware=new WareHouse();
		Thread pt=new Thread(new Producer(ware));
		Thread ct=new Thread(new Consumer(ware));
		pt.start();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		/*for(Thread t:ct)
		{
			t=new Thread(new Consumer(ware));
			t.start();
		}*/
		ct.start();
 
	}

}
