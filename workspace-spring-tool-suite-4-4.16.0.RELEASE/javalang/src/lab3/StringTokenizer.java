package lab3;
import java.util.Scanner;
public class StringTokenizer {

	public static void main(String[] args) {
		System.out.println("enter line of integer");
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		StringTokenizer str=new StringTokenizer(s);
		int sum=0;
		while(str.hasMoreTokens()) {
		    String token=str.nextToken();    
			int n=Integer.parseInt(token);
			System.out.println(" "+n+" ");
			sum=sum+n;
			
		}
		System.out.println("sum of the numbers is:"+sum);
		}
	}

