package day1;

public class FloatArray {
	public static float array1(float []a) {
		float sum =0;
		for(float num:a) {
			sum+=num;
		}
		float sum1=FloatArray.array1(a);
		return sum1;
	}


}
