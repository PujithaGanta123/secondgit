package lab3;

public class ModifyNumber {

	public static void main(String[] args) {
		int originalNumber=654;
		int modifiedNumber= modifyNumber(originalNumber);
		System.out.println("originalNumber:"+originalNumber);
		System.out.println("modifiedNumber:"+modifiedNumber);

	}

	public static int modifyNumber(int number) {
		StringBuilder modified=new StringBuilder(number);
		String ns=Integer.toString(number);
		for(int i=0;i<ns.length()-1;i++)
		{
			int currentDigit=Character.getNumericValue(ns.charAt(i));
			int nextDigit=Character.getNumericValue(ns.charAt(i+1));
			int difference=Math.abs(currentDigit-nextDigit);
			modified.append(difference);
		}
		modified.append(ns.charAt(ns.length()-1));
		return Integer.parseInt(modified.toString());
	}

}
