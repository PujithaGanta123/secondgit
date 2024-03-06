package interFacedemo;



interface IntegerToLong{
	long convert(int i);
	
}

public class IntToLongConverter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IntegerToLong converter=i -> (long)i;
		int inputvalue=123;
		long result=converter.convert(inputvalue);
		System.out.println("converted integer is:"+result);

	}

}
