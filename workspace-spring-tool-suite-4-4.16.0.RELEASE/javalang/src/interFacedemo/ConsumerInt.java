package interFacedemo;

import java.util.function.Consumer;

public class ConsumerInt {
	
		static void printfloatvalue(float f) {
			System.out.println("Message from printfloatvalue:"+f);
		}
		static void printdouble(double d) {
			System.out.println("Message from printdouble:"+d);
		}
	 
		public static void main(String[] args) {
			
			Consumer<Float> cf=ConsumerInt::printfloatvalue;
			cf.accept(8.5f);
			Consumer<Double> cd=ConsumerInt::printdouble;
			cd.accept(1000d);
			
		}

}
