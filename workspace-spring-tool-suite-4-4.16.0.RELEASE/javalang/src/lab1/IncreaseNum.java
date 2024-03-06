package lab1;
import java.util.Scanner;
public class IncreaseNum {
    public static void main(String arg[]) {
    	Scanner sc=new Scanner(System.in);
    	System.out.println("Enter the value of n: ");
    	int n=sc.nextInt();
    	boolean inc=true;
    	int temp=n%10;
    	n=n/10;
    	while(n>0)
    	{
    		if(temp<=n%10)
    		{
    			inc=false;
    			break;
    		}
    		temp=n%10;
    		n=n/10;
    	}
    	if(!inc)
    		System.out.println("Not increasing");
    	else
    		System.out.println("Increasing number");
    }
}
