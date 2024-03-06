package pujitha;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.jupiter.api.ClassOrderer.Random;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;


import day1.EvenOrOdd;
import day1.FloatArray;
import day1.LeapYear;


public class TestCase {
	@Test
	public void test() {
		
		int a=10;
		int b=50;
		int result=b/a;
		assertEquals(5,result);
	}


@Test
public void test1(){
   float i=35f;
   int j=40;
   float result=j-i;
   assertEquals(5,result,0.01);
   
	
}
@Test
public void test2() {
	String s="pujitha";
	String str="ganta";
	String result=s.concat(str);
	assertEquals("pujithaganta",result);
}
@Test
public void test3() {
	assertEquals(true,LeapYear.year());
	

}



@ParameterizedTest
@RepeatedTest(3)
public void test4()
{
	EvenOrOdd.AllEven(new int[] {42,38,32,78});
}
Random rand=new Random();

@ParameterizedTest
@ValueSource(floats= { 1f, 2f, 3f,4f,5f,6f})
public void test5(float[] sum1) {
	assertEquals(sum1,FloatArray.array1(sum1));
}

}
