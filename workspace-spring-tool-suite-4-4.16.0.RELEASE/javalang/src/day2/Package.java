package day2;
import assignment1.PackageDemo;

     public class Package extends PackageDemo{
    	 public static void main(String[]args) {
    		 Package ob=new Package();
    		 ob.mul(4,5);
    	 }
    	 void mul(int a,int b) {
    		 int mul=a*b;
    		 System.out.println("mul:"+mul);
    	 }
     }

