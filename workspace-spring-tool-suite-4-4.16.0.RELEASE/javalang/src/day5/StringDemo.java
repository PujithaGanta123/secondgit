package day5;

public class StringDemo {

	public static void main(String[] args ) {
		String course="BE";
		
		String course2=new String("BE");
		String course3=new String("BE");
		String course4=new String("BEC");
		String course5="DevopsCloude";
		System.out.println("IndexOf:"+course5.lastIndexOf('s', 5));
		System.out.println("hashcode:"+course4.hashCode());
		System.out.println("hashcode:"+course5.hashCode());
		System.out.println("LowerCase:"+course3.toLowerCase());
		System.out.println("hashcode:"+course2.hashCode());
		System.out.println("ComparedTo:"+course5.compareTo(course4));
		System.out.println("concat:"+course4.concat(course));
		System.out.println("UpperCase:"+course5.toUpperCase());
		System.out.println("EqualsIgnore:"+course.equalsIgnoreCase(course3));
		System.out.println("substring:"+course5.substring(5));
		System.out.println("subString:"+course5.substring(3, 12));
		System.out.println("strip:"+course5.strip());
		System.out.println(" "+course);
		
		

	}

}
