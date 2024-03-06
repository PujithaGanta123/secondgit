package lab2;

import java.util.Arrays;
import java.util.HashSet;

public class RemoveDuplicatesModifyArray {

	public static void main(String[] args) {
		int[] inputArray= {5,8,2,5,7,8,1,2,3};
		int[] resultArray=modifyArray(inputArray);
		System.out.println(Arrays.toString(resultArray));
	}
	public static int[] modifyArray(int[] inputArray)
	{
		HashSet<Integer> uniqueSet=new HashSet<>();
		for(int num:inputArray)
		{
			uniqueSet.add(num);
		}
		int[] uniqueArray=new int[uniqueSet.size()];
		int index=0;
		for(int num:uniqueSet)
		{
			uniqueArray[index++]=num;
		}
		Arrays.sort(uniqueArray);
		int[] resultArray=new int[uniqueArray.length];
	for(int i=0;i<uniqueArray.length;i++)
	{
		resultArray[i]=uniqueArray[uniqueArray.length-1-i];
	}
	return resultArray;
}

	}

}
