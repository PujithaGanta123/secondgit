package day6;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class DateDemo {
	
  public static void main(String[]args, DateTimeFormatter d1) {
	  Date d11=new Date();
	  System.out.println("current date:"+d11.getDate());
	  System.out.println("current Date before set:"+ d11.getMonth());
	  d11.setDate(4);
	  System.out.println("curreny Date after set:"+d11.getMonth());
	  
	  LocalDate l=LocalDate.now();
	  System.out.println("current Date:"+l);
	  System.out.println("DateOfMonth:"+l.getDayOfMonth());
	  System.out.println("DayOfWeek:"+l.getDayOfWeek());
	  System.out.println("DayOfWeek:"+l.getDayOfYear());
	  
	  
	  LocalDateTime ld=LocalDateTime.now();
	  System.out.println("Current Time:"+ld);
	  System.out.println("Hour:"+ld.getHour());
	  System.out.println("Minute:"+ld.getMinute());
	  
	  
	
  }
}
