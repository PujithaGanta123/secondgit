package exception;

import java.util.Scanner;

public class UserDef {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			check();
		} catch (AgeInvalidException e) {
			e.message();
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}
 
	}
	public static void check()throws AgeInvalidException
	{
		int a;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your age");
		a=sc.nextInt();
		if(a>=18)
		 System.out.println("Valid age"+a);
		else
		 throw new AgeInvalidException(a);
	}
 
}
//User Defined Exception
class AgeInvalidException extends Throwable
{
	int age;
	AgeInvalidException(int age)
	{
		this.age=age;
	}
	
	public void message()
	{
		System.out.println("Enter Age greater than 18,age entered was "+age);
	}

	}


