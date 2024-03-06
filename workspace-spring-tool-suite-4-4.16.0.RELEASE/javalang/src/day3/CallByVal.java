package day3;

public class CallByVal {
	 
	public static void main(String[] args) {
				
		bank b=new bank(30000,2000);
		
		b.swap(b);
		System.out.println("Inside Main"+"a:"+b.balance+"b:"+b.withdraw);
		
		

	}
	
	
	

}
class bank
{
	float balance,withdraw;
	
	
	bank(float bal,float withd)
	{
		this.balance=bal;
		this.withdraw=withd;
	}
	
	void swap(bank b)
	{
		
		
		float t;
		
		t=balance;
		balance=withdraw;
		withdraw=t;
		System.out.println("Inside function"+"a:"+b.balance+"b:"+b.withdraw);
	}
}
