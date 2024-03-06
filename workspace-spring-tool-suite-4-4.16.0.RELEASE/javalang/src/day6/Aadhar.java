package day6;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Aadhar {
	
	
	public static void main(String []arg) {
		 
	     System.out.println("Enter Aadhar number of the customer");
	         
	      Scanner sc=new Scanner(System.in);	
	      String Aadhar=sc.nextLine();
			
			String regex = "[0-9]{12}";
			Pattern p = Pattern.compile(regex);
			Matcher m = p.matcher(Aadhar);
		    
			 if(Aadhar.length()==12 && m.matches()==true)
				
				 System.out.println(Aadhar+"is valid Aadhar number");
			  else
				System.out.println(Aadhar+"is an invalid Aadhar number");
			
	      }
	

	}
class Email{
	private void mail() {
		Scanner sc1=new Scanner(System.in);
		System.out.println("enter Emai of the customer");
		String email=sc1.nextLine();
		String regex=("^[A-Za-z0-9+@$%&+\\.+a-z{5}]$");
		Pattern p=Pattern.compile(regex);
		Matcher m=p.matcher(email);
		if( m.matches()==true)
			System.out.println(email+"is valid");
		else
			System.out.println(email +" is not valid");
		

	}
}

