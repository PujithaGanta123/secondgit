package day6;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
public class Parsing {

	public static void main(String[] args) {
		LocalDateTime ld=LocalDateTime.now();
		System.out.println("before formatting:"+ld);
		DateTimeFormetter df= DateTimeFormetter.ofpattern("MMM d YYYY ");
	    String dtf=ld.format(dtf);
		System.out.println("after formatting:"+dtf);
		LocalDate parsed=LocalDate.parse("2024-01-09");
		System.out.println("after parsing:"+parsed);
	}
}
