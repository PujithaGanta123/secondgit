package exception;

public class Exception {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//null pointer exception
		String str=null;
		//System.out.println(str.length());
		//Number format exception
		String notANumber="abc";
		
		try {
			
		System.out.println(str.length());
		}
		catch(NullPointerException e){
		System.out.println("nullPointerException:");	
		}
		try {
			int num=Integer.parseInt(notANumber);
		}
		catch(NumberFormatException e){
			System.out.println("NumberFormatException:");
		}
		
		finally {
			System.out.println(notANumber.length());
			System.out.println(str);
			
		}
		
		
		
	}

}
