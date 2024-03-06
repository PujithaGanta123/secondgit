package lab2;

import java.util.Arrays;

public class GetSortedInteger {

	public static void main(String[] args) {
		int[] getSorted(int[] inputArray)
		{
			for(int i=0,j=inputArray.length-1;i<j;i++,j--)
			{
				int temp=inputArray[i];
				inputArray[i]=inputArray[j];
				inputArray[j]=temp;
			}
			Arrays.sort(inputArray);
			return;
		}
	 
	   public static void main(String args[])
	   {
		   int[] originalArray= {5,2,8,1,3};
		   int[] getSorted=getSorted(originalArray);
		   //System.out.println("Original Array:"+Arrays.toString(originalArray));
		   System.out.println("Original Array:"+originalArray);
		   System.out.println("Reversed and sorted Array:"+Arrays.toString(getSorted));
	   }

	}

}
