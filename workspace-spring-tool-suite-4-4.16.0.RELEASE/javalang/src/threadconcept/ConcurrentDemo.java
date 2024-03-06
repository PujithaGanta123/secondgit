package threadconcept;

public class ConcurrentDemo implements Runnable {
	
	public static void main(String[] args) 
	{
		ConcurrentDemo c=new ConcurrentDemo();
		Thread t1=new Thread();
		t1.setName("A");
		Thread t2=new Thread();
		t2.setName("B");
		t1.start();
		t2.start();
		
 
	}
 
	
	public void run() {
		Account a=new Account();
		depositAcc(a,10);//10
		withdrawAcc(a,10);//0
		
		
	}
	private void withdrawAcc(Account a,int amt)
	{
		
		if(a.getBalance()<amt)
		{
			System.out.println("Insufficent balance"+a.getBalance()+"to withdraw"+amt);
		}
		else
			a.withdraw(amt);
		System.out.println("Amount withdraw and balance is :"+a.getBalance());
		
		
	}
	private void depositAcc(Account a, int amt)
	{
		
		a.deposit(amt);
		System.out.println("Amount deposited and balance is :"+a.getBalance());
	}
 
}
class Account
{
	private int balance;
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	public void deposit(int amt)
	{
		balance=balance+amt;
	}
	public void withdraw(int amt)
	{
		balance=balance-amt;

	}

}
