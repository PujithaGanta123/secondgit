package day1;

public class ArithmaticOpp {
	int a=10;
	int b=12;
	int c; 
	public static void main (String a[])
	{
	ArithmaticOpp o1=new ArithmaticOpp();
	o1.add();
	ArithmaticOpp.message();
	}
	public void add()

	{
	c=a+b;
	System.out.println("sum:"+c);
	}
	public static void message()
	{
	System.out.println("welcome to java");
	}
	}

