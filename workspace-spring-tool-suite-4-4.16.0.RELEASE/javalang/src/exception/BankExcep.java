package exception;

import java.util.Scanner;

public class BankExcep {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			check();
		} catch (InsufficentBalanceException e) {
			e.message();
			e.printStackTrace();
			
		}
	}
		public static void check()throws InsufficentBalanceException
		{
			int bal;
			Scanner sc=new Scanner(System.in);
			System.out.println("available balance is 2000");
			System.out.println("enter amount");
			bal=sc.nextInt();
			if(bal>0)
			 System.out.println("withdrown "+bal);
			else
			 throw new InsufficentBalanceException(bal);
		}
	 
	}
		class InsufficentBalanceException extends Throwable
		{
			int balance;
			 InsufficentBalanceException(int balanece) {
				 this.balance=balance;
			}
			 public void message()
				{
					System.out.println("Entered balance is: "+balance);
				}
		

	}


