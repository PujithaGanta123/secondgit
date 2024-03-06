package day5Assignment;
import java.util.Scanner;
public class Frequency {
	
		public static void main(String args[]) {
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the string");
			String str=sc.nextLine();
			char ch='e';
			int frequency=0;
			for(int i=0;i<str.length();i++) {
				if(ch==str.charAt(i)) {
					frequency++;
				}
			}
			System.out.println("Frequency of "+ ch+"="+frequency);
		}
	 
	}

