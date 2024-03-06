package day6;
import java.util.Scanner;
public class Words {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter four lines of text:");
		String[] lines =new String[4];
		for(int i=0;i<4;i++) {
			lines[i]=sc.nextLine();
		}
		System.out.println("words,Lengths and First Character:");
		for(String line: lines) {
			String[] words=line.split("\\s+");
			for(String word:words) {
				int length=word.length();
				char firstChar=length>0?word.charAt(0): '-';
				System.out.println("word:"+word+"length:"+length+"first character:"+firstChar);
			}
		}
       sc.close();
	}

}
