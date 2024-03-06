package day5;

public class StringBuff {
     

	public static void main(String[]arg) {
    	 StringBuffer sb=new StringBuffer("devops");
    	 StringBuffer sb1=new StringBuffer("Cloud");
    	 sb.append("cloud");
    	 System.out.println(sb);
    	 System.out.println(sb.compareTo(sb1));
    	 sb.deleteCharAt(4);
    	 System.out.println(sb);
    	 
     }
}
