package day6;

public class ConvertArray {
	
		public static void main(String args[]) {
			int arr[] = {1,2,3,4,5,6,7,8,9,10};
			int arr_left[] = new int[arr.length/2];
			int[] arr_right = new int[arr.length/2];
			int[] modified = new int[arr.length];
			for(int i=0;i<arr_left.length;i++) {
				arr_left[i]=arr[i];
			}
			int k=0;
			for(int i=arr.length-1;i>=arr_right.length;i--) {
				//System.out.println(i+","+k+","+arr[i]);
				arr_right[k] = arr[i];
				k+=1;
			}
			int j=0;
			for(int i=0;i<arr.length;i+=2) {
				modified[i] = arr_right[j];
				modified[i+1] = arr_left[j];
				j+=1;
			}
			for(int i=0;i<modified.length;i++) {
				System.out.print(modified[i]+" ");
			}
		}
	}

