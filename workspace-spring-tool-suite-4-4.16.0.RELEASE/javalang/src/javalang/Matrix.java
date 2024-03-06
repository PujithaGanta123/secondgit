package javalang;
import java.util.Scanner;
public class Matrix {
	public static void main(String[]arg) {
		
		int a[][]=new int[2][2];
		int b[][]=new int[2][2];
		int c[][]=new int [2][2];
		int sum=0;
		System.out.println("Enter elements in an array");
		Scanner sc=new Scanner(System.in);
		
		for(int i=0;i<2;i++)
		{
			for (int j=0;j<2;j++)
			{
				a[i][j]=sc.nextInt();
				//sum+=a[i][j];
			}
		}
		for(int i=0;i<2;i++) {
			for(int j=0;j<2;j++) {
				b[i][j]=sc.nextInt();
				
			}
		}
		for(int i=0;i<2;i++) {
			for(int j=0;j<2;j++) {
				c[i][j]=sc.nextInt();
				sum+=c[i][j];
			}
		}
			
		
		System.out.println("Sum of elements:"+sum);
		

	}
}
