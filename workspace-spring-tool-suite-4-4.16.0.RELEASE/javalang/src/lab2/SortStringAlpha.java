package lab2;

import java.util.Arrays;

public class SortStringAlpha {
		public static String[] SortString(String[] inputArray)
		{
			if(inputArray==null || inputArray.length==0)
			{
				return new String[0];
			}
			Arrays.sort(inputArray);
			int halfLength=inputArray.length/2;
			for(int i=0;i<halfLength;i++)
			{
				inputArray[i]=inputArray[i].toUpperCase();
			}
			for(int i=halfLength;i<inputArray.length;i++)
			{
				inputArray[i]=inputArray[i].toLowerCase();
			}
			return inputArray;
		}
		public static void main(String args[])
		{
			String[] input= {"apple","banana","Grape","Orange"};
			String[] result=SortString(input);
			System.out.println(Arrays.toString(result));
		}
	 
	}

