package day6;


	import java.text.NumberFormat;
	import java.time.LocalDate;
	import java.time.format.DateTimeFormatter;
	import java.util.Locale;
	 
	public class Number {
		public static void main(String[] args) {
			displayNumber(Locale.getDefault());
			displayNumber(Locale.GERMANY);
			displayNumber(Locale.ITALY);
			LocalDate date=LocalDate.now();
			DateTimeFormatter formatter=DateTimeFormatter.ofPattern("dd-MMM-yyyy");
			String text=date.format(formatter);
			System.out.println(text);
			DateTimeFormatter formatte=DateTimeFormatter.ofPattern("MMM/dd/yyyy ");
			String txt=date.format(formatte);
			System.out.println(txt);
		}
		static public void displayNumber(Locale currlocale)
		{
			Integer i=new Integer("367492");
			Double d=new Double("362.965");
			NumberFormat num=NumberFormat.getNumberInstance(currlocale);
			String dout=num.format(d);
			String iout=num.format(i);
			System.out.println("Formatted Integer:"+iout);
			System.out.println("Formatted Double:"+dout);

		}
	}

