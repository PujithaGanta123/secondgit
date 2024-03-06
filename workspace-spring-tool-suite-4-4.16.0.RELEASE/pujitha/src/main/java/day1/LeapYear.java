package day1;
import static org.junit.Assert.assertEquals;

public class LeapYear {
	public static boolean year() {

		int year = 2024;

		if((year % 4 ==0) && (year % 100!=0) || (year%400 == 0))
		{
		return true;
		}
		else
		
		return false;

	}

}
