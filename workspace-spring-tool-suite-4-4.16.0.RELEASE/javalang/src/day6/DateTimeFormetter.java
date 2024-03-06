package day6;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class DateTimeFormetter {

	public static void main(String[] arg) {
		Scanner sc=new Scanner(System.in);
	    System.out.println("enter a date (yyyy-mm-dd):");
        String dateInput=sc.nextLine();
        LocalDate parsedDate = LocalDate.parse(dateInput,DateTimeFormetter.ISO_Date);
        System.out.println("parsed Date:"+parsedDate);
        System.out.println("enter date and time(yyyy-mm-dd HH:mm:ss): ");
        String dateTimeInput=sc.nextLine();
        LocalDateTime parseDateTime = LocalDateTime.parse(dateTimeInput,DateTimeFormetter.ofpattern("yyyy-mm-dd hh:mm:ss"));
        System.out.println("parsed date and time:"+parseDateTime);
        sc.close();
	}

	
	}
	

