package dsDay3;

import java.util.Arrays;

public class main {
	public static void radixSort(int[] arr) {
		//maximum number
		int max=Arrays.stream(arr).max().getAsInt();
		//do count sort for every digit place; 1's,10's,100's
		//exponential method
		for(int exp=1;max/exp>0;exp *=10) {
			countSort(arr,exp);
		}
	}

	private static void countSort(int[] arr, int exp) {
		int n=arr.length;
		int[]output=new int[n];
		int[]count=new int[10];
		Arrays.fill(count,0);
		
		for(int i=0; i<n;i++) {
			count[(arr[i]/ exp)%10]++;
		}
		System.out.println("\nCount array for"+ exp + ":"+Arrays.toString(count));
		
		for(int i=1;i<10;i++) {
			count[i]=count[i]+count[i-1];
		}
		System.out.println("updated array :"+Arrays.toString(count));
		for(int i=n-1; i>=0;i--) {
			output[count[(arr[i]/exp)%10]-1]=arr[i];
			count[(arr[i]/exp)%10]--;
		}
		System.out.println("output array :"+Arrays.toString(count));
		
		System.arraycopy(output, 0, arr, 0, n);
		
	}

	public static void main(String[]arg) {
		int[] arr= {29,83,471,36,91,8};
		System.out.println("original array:"+Arrays.toString(arr));
		radixSort(arr);
		System.out.println("sorted array:"+Arrays.toString(arr));
		
		
	}
     
     }
	


