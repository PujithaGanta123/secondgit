package lab4;

public class Account {

	
		static long accNum=0;
		double balance;
		Person accHolder;
		Account()
		{
			balance = 500.0;
			accNum++;
		}
		Account(double bal)
		{
			balance = bal;
		}
		void deposit(double amount)
		{
			balance+=amount;
		}
		void withdraw(double amount)
		{
			balance-=amount;
		}
		double getBalance()
		{
			return balance;
		}
		public static void main(String args[])
		{
			Account smith = new Account(2000);
			Account kathy = new Account(3000);
			smith.deposit(2000);
			kathy.withdraw(2000);
			System.out.println("Balance in smith account:"+smith.getBalance());
			System.out.println("Balance in kathy account:"+kathy.getBalance());
		}
	}
	class Person
	{
		String name;
		float age;
		public void setDetails(String n,float ag)
		{
			name=n;
			age=ag;
		}
		public float getAge()
		{
			return age;
		}
		public String getName()
		{
			return name;
		}
	}
	class Savings extends Account
	{
		final double minBal=500;
		void withdraw(double amount)
		{
			if(minBal>amount)
				balance-=amount;	
		}
 
	}
	class Current extends Account
	{
		double overdraftLimit=10000;
		void withdraw(double amount)
		{
			boolean flg = true;
			if(amount>overdraftLimit)
				flg=false;
			flg=true;	
		}
	

	}


