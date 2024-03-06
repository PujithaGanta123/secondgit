package lab3;
import java.util.Scanner;
public class TextAnalyzer {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter text");
		StringBuilder sb=new StringBuilder();
		while (sc.hasNextLine()) {
			sb.append(sc.nextLine()).append("\n");
		}
		String text=sc.toString();
		int charCount=text.length();
		int lineCount=text.split("\n").length;
		int wordCount=text.split("\s+").length;
		System.out.println("number of characters:"+ charCount);
		System.out.println("number of lines:"+ lineCount);
		System.out.println("number of words:"+ wordCount);

	}

}
