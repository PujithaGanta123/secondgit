package day6;
import java.util.Scanner;
public class LargestSmallest {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr_len = digitsCount(n);
		int[] digits_arr = new int[arr_len];
		int i=0;
		while(n>0) {
			digits_arr[i] =  n%10;
			n=n/10;
			i+=1;
		}
		digits_arr = arrSort(digits_arr);
		int largest=0;
		int smallest=0;
		for(int k=0;k<digits_arr.length;k++) {
			largest=(largest*10)+digits_arr[k];
		}
		System.out.println("Largest:"+largest);
		for(int k=digits_arr.length-1;k>=0;k--) {
			smallest = (smallest*10)+digits_arr[k];
		}
		int x = (int)Math.pow(10,(digitsCount(smallest)-1));
		int zeros_count =  arr_len - digitsCount(smallest);
		// initially obtained smallest value is without zeros. now zeros should be added in second digit.
		// so I took smallest divided by its digit-1 gives first digit.
		// then multiply it with 10 to the power of number of zeros. now zeros is inserted in required place.
		// now multiply it with smallest digits-1 and adding the modulo of the smallest gives the required smallest.
		smallest = (smallest/x)*(int)(Math.pow(10, zeros_count))*x+(smallest%x);
		System.out.println("Smallest:"+smallest);

	}
	static int digitsCount(int n) {
		int count=0;
		while(n>0) {
			count+=1;
			n=n/10;
		}
		return count;
	}
	static int[] arrSort(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]<arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		return arr;
	}
 
}

