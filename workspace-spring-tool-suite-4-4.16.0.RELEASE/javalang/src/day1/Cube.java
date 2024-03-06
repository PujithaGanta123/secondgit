package day1;
import java.util.Scanner;
public class Cube {

	public static void main(String[] args) {
		Cube a=new Cube();
		a.sum();
	}
	void sum()
	{
		   int n,b,sum=0;
		   System.out.println("Enter a number:");
		   Scanner sc=new Scanner(System.in);
		   n=sc.nextInt();
		   while(n>0) {
			   b=n%10;
			   sum=sum+(b*b*b);
			   n=n/10;
		   }
 
		 System.out.println("Sum:"+sum);
	}

	}


