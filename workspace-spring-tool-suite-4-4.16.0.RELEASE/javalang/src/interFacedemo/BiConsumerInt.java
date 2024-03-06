package interFacedemo;


import java.util.ArrayList;
import java.util.List;
import java.util.function.BiConsumer;

public class BiConsumerInt {
public static void main(String[] args ) {
		
		BiConsumer<Float,Float> b3=BiConsumerInt::printfloat;
		b3.accept(35.5f, 4.5f);
		BiConsumer<Double,Double> b4=BiConsumerInt::printdouble;
		b4.accept(4000d,10000d);
		//LambdaExpression
		BiConsumer<Integer,Integer> b5=(a,b)->System.out.println("sum is"+(a+b));
		b5.accept(550, 450);
		//List
		List<Integer> l=new ArrayList<>();
		l.add(10);
		l.add(15);
		l.add(30);
		l.add(17);
		BiConsumer<List<Integer>,Integer> b=BiConsumerInt::printNumbers;
		b.accept(l,50);
		
		
	}
	static void printfloat(float s,float m) {
		System.out.println("sum of float values:"+(s+m));
	}
	static void printdouble(double s,double m) {
		System.out.println("sum is:"+(s+m));
	}
	static void printNumbers(List<Integer> l,int i ) {
		System.out.println("sum is:"+(l+i));
	
		
	}

}