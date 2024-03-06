package day1;

public class EvenOrOdd {

	public static boolean AllEven(int a[])
	{
		int c=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2==0)
				c++;
		}
		if(c==a.length)
			return true;
		return false;
	}
		

}
