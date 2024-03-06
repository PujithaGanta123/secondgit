package day1;

public class Bank {
	int accno;
	String name;
	String password;

	public static void mail(String ar[])
	{
	Bank b=new Bank();
	b.accno=101;
	b.name="puji";
	b.password="123";
	System.out.println("From Bank-Name:"+b.name+"AccNo:"+b.accno+"Password:"+b.password);
	 
	Customer c=new Customer();
	c.display();
	 
	}
	 
	public String getPassword()
	{
		return password;
	}
	public  void setPassword(String password)
	{
	this.password=password;
	 
	}

	public void setSalary(String string) {
		// TODO Auto-generated method stub
		
	}

	}
	class Customer
	{
	 
	void display()
	{
	Bank b1=new Bank();
	b1.accno=101;
	b1.name="Mercy";
	b1.setPassword("123");
	 
	System.out.println("From Customer-Name:"+b1.name+"AccNo:"+b1.accno+"Password:"+b1.getPassword());
	}
	 
	}

