package day10;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetHashCode {

	public static void main(String[] args) {
		Set<String> obj=new HashSet<>();
		obj.add("pujitha");
		obj.add("sreeja");
		obj.add("priya");
		obj.add("john");
		
		System.out.println(obj.add("john"));
		obj.add("rahul");
		obj.add(null);
		System.out.println(obj);
		
		Set alldt=new HashSet();
		alldt.add("pujitha");
		alldt.add(374);
		alldt.add(45.50f);
		System.out.println("HashSet:"+alldt);
		
		Set adt=new TreeSet();
		adt.add(123);
		adt.add(234);
		adt.add(67);
		System.out.println("TreeSet:"+adt);
		
		
 
	}

	}


