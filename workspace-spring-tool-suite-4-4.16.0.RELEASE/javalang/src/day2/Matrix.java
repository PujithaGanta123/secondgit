package day2;
import java.util.Scanner;
public class Matrix {
public static void main (String arg[])
{
	Scanner sc= new Scanner(System.in);
	int a[][]=new int[2][2];
	int b[][]=new int[2][2];
	int sum=0;
	System.out.println("Enter elements in an array1");
	
	for(int i=0;i<2;i++)
	{
		for(int j=0;j<2;j++) {
			a[i][j]=sc.nextInt();
			
		}
	}
	System.out.println("Enter elements in an array2");
	for(int k=0;k<2;k++)
	{
	System.out.println("sum of elements"+sum);
	}
}
}
