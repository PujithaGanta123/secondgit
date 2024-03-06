package threadMethod;

public class Consumer implements Runnable{
	private WareHouse ware;
	public Consumer(WareHouse ware)
	{
		this.ware=ware;
	}
	@Override
	public void run() {
		
		while(true)
		{
		synchronized(ware)
		{
			if(ware.isEmpty())
			{
			
			System.out.println("Stack empty");
			
			try {
				ware.wait();
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		
		
		}
		else
			
			System.out.println("Popped:"+ware.pop());
		}
		}
		
	}

}
