package assessment;
import java.util.Scanner;
public class LeapYear {
	public static void main(String arg[])
	{
	int year = 0;
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the number");
	int num=sc.nextInt();

	if((year % 4 ==0) && (year % 100!=0) || (year%400 == 0))
	{
	System.out.println("specified year is leap year");
	}
	else
	{
	System.out.println("specified year is not leap year");
	}
	}
	}

