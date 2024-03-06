package day7;

public class UtilityClass {

	public static void main(String[] args) {
		Integer i1=Integer.valueOf("3456");
		System.out.println(i1);
		Float f1=new Float("23.87");
		System.out.println(f1);
		Double d1=new Double("4673");
		System.out.println(d1);
		Character c=new Character('p');
		System.out.println(c);
		Boolean b1=new Boolean("true");
		System.out.println(b1);
		 
		byte b= i1.byteValue();
		double d=i1.doubleValue();
		float f=i1.floatValue();
		
		System.out.println("Byte:"+b+"Double:"+d+"Float:"+f);
		
		short s=f1.shortValue();
		long l=f1.longValue();//34
		double d3=f1.doubleValue();
		System.out.println("Short:"+s+"Long:"+l+"Double:"+d3);
		
		String s1=Integer.toHexString(14);
		System.out.println("Hexadecimal:"+s1);//
		String s2=Integer.toBinaryString(14);
		String s3=Integer.toOctalString(14);	
		System.out.println("Binary:"+s2+"Octal: "+s3);
		System.out.println(Character.isDigit('c'));
		System.out.println(Character.isDigit('1'));
		
		
	}

}
