package assignment2;

public class Palindrom {
public static void main(String arg[])
{
	int num=12321,reverse = 0, rem, temp;
	temp=num;
	while(temp!=0)
	{
		rem =temp %100;
		reverse=reverse*10+rem;
		temp /= 10;
	}
	if(num==reverse)
		System.out.println(num+" is palindrome");
	else
		System.out.println(num+" is not plindrome");	
	}
}

