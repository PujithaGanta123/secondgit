package interFacedemo;

import java.util.function.BiFunction;
import java.util.function.Function;

public class BiFunctionInt {

	public static void main(String[] args) {
		
	     BiFunction<Integer,Integer,Integer> f1=BiFunctionInt::Add;
	     System.out.println(f1.apply(345,635));
	     BiFunction
	     
			
			
		}
		public static int Add(int a,int b){
			return (int)a+b;
		}
	

}
