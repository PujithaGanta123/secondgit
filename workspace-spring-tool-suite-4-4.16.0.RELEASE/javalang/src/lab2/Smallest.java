package lab2;
import java.util.Scanner;
public class Smallest {
	static int size;
		static int numbers[];
		public static void main(String args[]) { 
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the size");
			size=sc.nextInt();
			numbers=new int[size];
			System.out.println("Enter the array elements");
			for(int i=0;i<size;i++) {
				numbers[i]=sc.nextInt();
			}	
			Smallest s=new Smallest();
			int ans = s.smallestnum(numbers,size); 
			System.out.print("Smallest second num:"+ans);
		}
		 int  smallestnum(int numbers[],int size) {
			for(int i=0;i<numbers.length-1;i++) {
				for(int j=0;j<numbers.length-i-1;i++) {
					if(numbers[j]>numbers[j+1]) {
						int temp=numbers[i];
						numbers[j]=numbers[j+1];
						numbers[j+1]=temp;
					}
				}
			}
			return numbers[1];	
	}
}
