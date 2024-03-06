package exception;

public class ExcepDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=10,j=0,k=0;
		int a[]=new int[10];
		try
		{
		k=i/j;
		}
		catch(ArithmeticException e)
		{
			System.out.println("divide by zero");
		}
		try
		{
			a[10]=90;
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Array element exceeds the size");
		}
		finally
		{
			System.out.println(k);
		}
		
		System.out.println("finished");

	}

}
