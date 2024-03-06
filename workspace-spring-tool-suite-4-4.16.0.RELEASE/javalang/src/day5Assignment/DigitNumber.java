package day5Assignment;
import java.util.Scanner;
public class DigitNumber {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size:");
		int size=sc.nextInt();
		int a[]=new int[size];
		System.out.println("enter the elements in array:");
		for(int i=0;i<size;i++) {
			a[i]=sc.nextInt();
		}
		System.out.println("One-digit numbers are:");
		digit(a,1);
		System.out.println("Two-digit numbers are:");
		digit(a,2);
		System.out.println("Three-digit numbers are:");
		digit(a,3);
	}	
	public static void digit(int a[],int digitCount) {
		for(int i=0;i<a.length;i++) {
			int num=a[i];
			int count=0;
			int temp=num;
			while(temp!=0) {
				temp=temp/10;
				count++;
			}
			if(count==digitCount) {
				System.out.print(num+" ");
			}
		}
			System.out.println();
		}
	}

