package interFacedemo;

import java.util.function.Predicate;

public class PredicateDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Predicate<Integer> p2=(a)->(a<=9)?true:false;
		if(p2.test(10)==true)
			System.out.println("On Time");
		else
			System.out.println("Late");
		
 
	}

	}


