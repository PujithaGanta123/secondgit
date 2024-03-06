package lab1;
import java.util.*;
public class NaturalSum {
     int n;
     static int sum=0;
     Scanner sc=new Scanner(System.in);
     int calculateSum()
     {
    	 System.out.println("Enter a number");
    	 int n=sc.nextInt();
    	 for(int i=1;i<=n;i++)
    	 {
    		 if(i%3==0 ||i%5==0)
    		 {
    			 sum=sum+i;
    		 }
    	 }
    	 return sum;
     }
     public static void main(String[]arg)
     {
    	 NaturalSum ob=new NaturalSum();
    	 ob.calculateSum();
    	 System.out.println("Sum:"+sum);
     }
}
