package assignmetImp;

import java.util.Scanner;

public class Exception extends SocialSecurityNumber {
	 static SocialSecurityNumber ssn=new SocialSecurityNumber();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter SSN number");
	    String s=sc.nextLine();
		try {
			ssn.validation(s);
		}
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println("invalid ssn number");
		}
		try {
			ssn.ComponentValidation(s);
		}
		catch(InvalidSocialSecurityNumberException e){
			e.message();;
		}
		finally {
			System.out.println("thanks for using the application");
		}
		

	}

}
