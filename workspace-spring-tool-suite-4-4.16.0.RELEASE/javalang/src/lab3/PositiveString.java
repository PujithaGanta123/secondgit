package lab3;

public class PositiveString {

	public static void main(String[] args) {
		String input="ant";
		boolean ispositive=ispositiveString(input);
		System.out.println("is positive string?"+ispositive+" ");

	}

	static boolean ispositiveString(String str) {
		//check if string is null
		if(str==null||str.isEmpty()) {
		return false;
		
	}
	//Iterate through the characters of then string
	for(int i=1;i<str.length();i++) {
		if(str.charAt(i)<=str.charAt(i-1)) {
			return false;
			//not in alphabetical order
		}
	}
	return true;
	//all chars are alphabetical order
	}

}
