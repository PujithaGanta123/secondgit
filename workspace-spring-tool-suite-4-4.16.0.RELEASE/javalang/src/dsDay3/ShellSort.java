package dsDay3;

import java.util.Arrays;

public class ShellSort {
	public static void main(String[] args) {
		 
	    int[] intArray = {9,14,3,2,43,11,58,22};

        for (int gap = intArray.length / 2; gap > 0; gap /= 2) {


            for (int i = gap; i < intArray.length; i++) {//4//5
                int newElement = intArray[i];//43//11

                int j = i;//j=4//5

                while (j >= gap && intArray[j - gap] > newElement) {//a[1] >a[5]
                    intArray[j] = intArray[j - gap];
                    j -= gap;//1
                }

                intArray[j] = newElement;


            }
            System.out.println(Arrays.toString(intArray));
        }

        System.out.println(Arrays.toString(intArray));
        }

}
