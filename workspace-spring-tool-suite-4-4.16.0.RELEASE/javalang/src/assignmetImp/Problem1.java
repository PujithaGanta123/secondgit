package assignmetImp;


	import java.time.LocalDate;
	import java.time.LocalDateTime;
	import java.time.format.DateTimeFormatter;
	import java.util.Scanner;
	 
	
	public class Problem1 {
		public static void main(String args[]) {
			System.out.println("Sample output:1");
			String code1 = "BD7A20171201";
			isValidCode(code1);
			System.out.println("\nSample output:2");
			String code2 = "BD7A20180307";
			isValidCode(code2);
			System.out.println("\nSample output:3");
			String code3 = "BD7A202";
			isValidCode(code3);
			System.out.println("\nSample output:4");
			String code4 = "B37A20181201";
			isValidCode(code4);
			System.out.println("\nSample output:5");
			String code5 = "BD7A30221201";
			isValidCode(code5);
			System.out.println("\nSample output:6");
			String code6 = "BD7A20201501";
			isValidCode(code6);
			System.out.println("\nSample output:7");
			String code7 = "BD7A20151235";
			isValidCode(code7);
			System.out.println("\nSample output:8");
			String code8 = "BD7A20221535";
			isValidCode(code8);

		}
		public static void isValidCode(String code) {
			Character c1 = code.charAt(0);
			Character c2 = code.charAt(1);
			Character c4 = code.charAt(3);
			Character c3 = code.charAt(2);
			
			if(code.length()!=12) {
				System.out.println("Invalid input");
			}
			else if(!(Character.isAlphabetic(c1) && Character.isAlphabetic(c2) && Character.isAlphabetic(c4) && 
					Character.isDigit(c3))) {
				System.out.println("Invalid Batch number");
			}
			else {
				String year= code.substring(4, 8);
				String month=code.substring(8, 10);
				String day=code.substring(10);
				if(Integer.valueOf(year)>=2015 && Integer.valueOf(year)<=2020 &&Integer.valueOf(month)>=1 
						&& Integer.valueOf(month)<=12&&Integer.valueOf(day)>=1 && Integer.valueOf(day)<=31) {
					
							String date_string = year+"-"+month+"-"+day;
							LocalDate date = LocalDate.now();
							date = LocalDate.parse(date_string);
						
							DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
							date_string = dtf.format(date);
							System.out.println("Batch Number:"+c1+""+c2+""+c3+""+c4);
							System.out.println("Expiry Date:"+date_string);
						}
						else {
							System.out.println("Invalid DATE");
						}
					}
					
				}
				
			
		}


