package lab1;
import java.util.Scanner;
public class Fibonaccai {
	public static void main(String arg[])
	{
		int n1=1,n2=1,n3,i,n;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number");
        n=sc.nextInt();	
        System.out.println("Fibonaccai Series");
        if(n==1)
        {
        	System.out.println(n1);
        }
        else
        {
        	System.out.println(n1+"\n"+n2);
        }
        for(i=2;i<n;i++)
        {
        n3=n1+n2;
        System.out.println(n3);
        n1=n2;
        n2=n3;
        }
	}

}
