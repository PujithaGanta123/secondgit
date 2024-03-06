package lab3;
import java.util.Scanner;
public class AlterString {

	public static void main(String[] args ) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the input string");
		String input=sc.nextLine();
		System.out.println("input:"+input);

		String s="aeiouAEIOU";
		String output=" ";
		for(int i=0;i<input.length();i++) {
		    char ch=input.charAt(i);
		    if(s.indexOf(ch)==-1) {
		    	ch--;
		    	if(s.indexOf(ch)!=-1) 
		    		
		    	ch+=2;
		    }
		    	output+=ch;
		   
		}
		System.out.println("output:"+output);

	}

}
