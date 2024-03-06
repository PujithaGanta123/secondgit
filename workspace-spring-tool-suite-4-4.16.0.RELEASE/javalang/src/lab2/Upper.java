package lab2;
import java.util.Arrays;
import java.util.Scanner;
public class Upper {

	public static void main(String[] args) {
		Scanner scd=new Scanner(System.in);
		System.out.println("size of array:");
 
		int n=scd.nextInt();
		String arr[]=new String[n];
		System.out.println("enter the string elements in array:");
		for(int i=0;i<n;i++) {
			 arr[i]=scd.next();
		}
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		int left,right;
		if(n%2==0) {
			left=n/2;
			right=left+1;}
		else {
			left=(n/2)+1;
			right=left+1;}
		for(int i=0;i<left;i++) {
			arr[i]=arr[i].toUpperCase();}
		for(int i=left+1;i<right;i++) {
			arr[i]=arr[i].toLowerCase();}
 
 
		for( int i=0;i<n;i++) {
			System.out.println(arr[i]);
		}
	}


	}


