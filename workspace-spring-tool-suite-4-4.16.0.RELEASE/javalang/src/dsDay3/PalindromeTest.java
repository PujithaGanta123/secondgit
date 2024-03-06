package dsDay3;

import java.util.Scanner;
import java.util.Stack;

public class PalindromeTest {

	public static void main(String[] args) {
		System.out.println("enter input String");
		Scanner sc=new Scanner(System.in);
        String inputString= sc.nextLine();
        Stack stack=new Stack();
        for(int i=0; i<inputString.length();i++) {
        	stack.push(inputString.charAt(i));
        }
        String reverseString=" ";
        while(!stack.empty()) {
        	reverseString+=stack.pop();
        }
        if(inputString.equals(reverseString)) {
        	System.out.println("the input String is not palindrome");
        }
        else {
        	System.out.println("the input String is palindrome");
        }
	}

}
