package day6;

import java.text.NumberFormat;
import java.util.Locale;

public class Percentage {
	public static void main(String[]arg) {
	displayPercent(Locale.FRANCE);
	displayPercent(Locale.US);
	displayPercent(Locale.UK);
	displayPercent(Locale.FRENCH);
}static public void displayPercent(Locale currlocale)
{
	Double percent= new Double(0.89);
	NumberFormat num=NumberFormat.getPercentInstance(currlocale);
	System.out.println("Formatted Percent: "+num.format(percent));
	
	
}
}
