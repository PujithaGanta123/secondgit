package interFacedemo;

import java.util.function.Function;

public class FunctionInput {

	public static void main(String[] args) {
		Function<Integer,Integer> f1=FunctionInput::Integer;
		System.out.println(f1.apply(345));
		Function<Float,Float> f2=FunctionInput::Number;
		System.out.println(f2.apply(45.9f));
		
		
	}
	public static int Integer(int a){
		return (int)a;
	}
	public static float Number(float f) {
		return (float) f;
	}
	

}

