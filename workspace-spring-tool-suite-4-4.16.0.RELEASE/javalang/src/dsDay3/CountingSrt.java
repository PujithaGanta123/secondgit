package dsDay3;

public class CountingSrt {

	public static void main(String[] args) {
		int[] intArray= {1,5,8,2,4,10,6,3,9,4};
		CountingSort(intArray,1,10);
		for(int i=0;i<intArray.length;i++) {
			System.out.println(intArray[i]);
		}
	}
		public static void CountingSort(int[]input,int min,int max) {
			int[] CountArray=new int[(max-min)+1];
			
			for(int i=0;i<input.length;i++) {
				CountArray[input[i]-min]++;
			}
			int j=0;
			for(int i=min;i<=max;i++) {
				
				while(CountArray[i-min]>0) {
					input[j++]=i;
					CountArray[i-min]--;
				}
			}
		
	}

}
