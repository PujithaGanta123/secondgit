package day6;


	import java.util.Locale;
	import java.text.NumberFormat;
	 
	public class Currency {
	 
		public static void main(String[] args) {
		
	double amt=142.679;
	NumberFormat currencyFormat=NumberFormat.getCurrencyInstance(Locale.GERMAN);
	String st=currencyFormat.format(amt);
	System.out.println(st);
	 
	NumberFormat currencyFormatt=NumberFormat.getCurrencyInstance(Locale.FRANCE);
	String st1=currencyFormatt.format(amt);
	System.out.println(st1);
	
	
		}
	 
	}

