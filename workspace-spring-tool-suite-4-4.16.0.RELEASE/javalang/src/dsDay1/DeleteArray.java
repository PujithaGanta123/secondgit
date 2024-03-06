package dsDay1;

import java.util.Scanner;

public class DeleteArray {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int a[]=new int [5];
        System.out.println("enter the elements in array");
              
              for(int i=0;i<=a.length-1;i++) {
            	 a[i]=sc.nextInt();
              }
              System.out.println("Enter the position you want to delete the element from: ");
           	  int pos=sc.nextInt();
           	  
           	  System.out.println("Enter the element you want to delete: ");
           	  int element=sc.nextInt();
           	  int b[]=new int[a.length-1];
           	  
           	  for(int i=0;i<pos;i++) {
           		  b[i]=a[i];
           	  }
           	  
           	  for(int i=pos;i<b.length;i++) {
           		  b[i]=a[i+1];
           	  }
           	  
           	  for(int i=0;i<b.length;i++) {
           		  System.out.println(b[i]+" ");
           	  }
      }
            	 
}
            		
	


