package threadMethod;

import java.util.Random;

public class Producer implements Runnable{
	private WareHouse ware;
	public Producer(WareHouse ware)
	{
		this.ware=ware;
	}
	@Override
	public void run() {
		
		Random r=new Random();
		while(true)
		{
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		int num=r.nextInt(100);
		synchronized(ware)
		{
			
			ware.push(num);
			System.out.println("Pushed"+num);	
			ware.notify();
		}
		
		}
	
	}
	
	

}
