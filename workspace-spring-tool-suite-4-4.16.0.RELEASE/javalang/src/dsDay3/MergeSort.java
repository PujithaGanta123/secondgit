package dsDay3;

import java.util.Scanner;
public class MergeSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		 int[] a = {9,14,3,2,43,11,58,22};
		for(int gap=a.length/2;gap>0;gap/=2) {
			for(int i=0; i<a.length-1;i++) {
				int newElement= a[i];
				int j=i;                                                 
				while(j >= gap && a[j - gap] > newElement) {
					a[j] = a[j - gap];
                    j -= gap;
                    a[j]=newElement;
				}
				System.out.println(a);
			}
			System.out.println(a[gap]);
		}
		
		
		

	}

}
