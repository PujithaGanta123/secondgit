package day3;
import java.util.Scanner;
public class PrimeNumber {
public static void main(String[] arg)
{
	int n = 0,p;
Scanner sc =new Scanner(System.in);
System.out.println("enter the number");
int num=sc.nextInt();
for(int i=2;i<=n;i++)
{
	p=0;
	for(int j=1;j<=i;j++)
	{
		if(i%j==0)
			p++;
	}
	if(p==2)
		System.out.println(i);
}
}
}
