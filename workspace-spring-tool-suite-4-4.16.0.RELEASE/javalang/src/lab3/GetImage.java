package lab3;
import java.util.Scanner;
public class GetImage {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the input String");
		String input=sc.nextLine();
		System.out.println("input:"+input);
		StringBuffer sb1=new StringBuffer(input);
		sb1.reverse();
		System.out.println(sb1);
		System.out.println("input:"+input+"|"+sb1);
		sc.close();
	}
       
}
