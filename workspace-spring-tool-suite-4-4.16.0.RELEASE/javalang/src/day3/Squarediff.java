package day3;

import java.util.Scanner;
public class Squarediff {
       int a,s1=0,s2=0,s3=0;
       static int diff=0;
       int calculateDifference()
       {
    	   Scanner sc=new Scanner(System.in);
    	   System.out.println("Enter a number");
    	   a=sc.nextInt();
    	   for(int i=1;i<=a;i++) {
    		   s1+=i*i;
    	   }
    	   System.out.println(s1);
    	   
    	   for(int i=1;i<a;i++) {
    		   s2+=i;
    	   }
    	   s3=s2*s2;
    	   System.out.println(s3);
    	   diff=s1-s3;
    	   return diff;
    	   
       }
       public static void main(String args[]) {
    	   Squarediff sob1=new Squarediff();
    	   sob1.calculateDifference();
    	   System.out.println("Difference is"+diff);
       }
	
	}

