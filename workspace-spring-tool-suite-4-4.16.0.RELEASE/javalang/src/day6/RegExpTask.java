package day6;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class RegExpTask {
		public static void main(String args[]) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the aadhar number");
			String aadhar = sc.next();
			System.out.println("Enter email id:");
			String email = sc.next();
			Pattern p = Pattern.compile("[0-9]{12}");
			Matcher m = p.matcher(aadhar);
			if(m.matches()) {
				System.out.println("Valid aadhar number");
			}
			else {
				System.out.println("Invalid aadhar number");
			}
			Pattern p1 = Pattern.compile("^[a-zA-Z0-9+_.-]+@[a-zA-Z]+.com$");
			Matcher m1 = p1.matcher(email);
			if(m1.matches()) {
				System.out.println("Valid email id");
			}
			else {
				System.out.println("Invalid email id");
			}
		}
}
