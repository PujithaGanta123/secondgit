package day5;

public class Stringbuilder {
	public static void main(String[]arg) {
    StringBuilder su=new StringBuilder("devops");
    StringBuilder sb=new StringBuilder("Cloud");
    sb.append("cloud");
	System.out.println(su);
	System.out.println(su.compareTo(sb));
	sb.deleteCharAt(4);
	System.out.println(su);
    
	} 
    
}
