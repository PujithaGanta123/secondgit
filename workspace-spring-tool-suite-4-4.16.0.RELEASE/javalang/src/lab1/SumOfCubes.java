package lab1;
import java.util.Scanner;

public class SumOfCubes {
	public static int SumOfDigits(int n)
	{
		int sum=0;
		
		for(int i=0;i<=n;i++)
		{
			sum+=i*i*i;
		}
		return sum;
		
		
	}
public static void main(String[]arg){
	int n=5;
	
	
	System.out.println(SumOfDigits(n));
}
}
