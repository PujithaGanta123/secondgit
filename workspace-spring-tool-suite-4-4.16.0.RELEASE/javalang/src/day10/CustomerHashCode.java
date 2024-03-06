package day10;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class CustomerHashCode {

	public static void main(String[] args) {
		Set<Customer> cusSet=new HashSet<>();
		cusSet.add(new Customer("Pujitha",6445));
		cusSet.add(new Customer("Bindu",6876));
		Customer c1=new Customer("Pravali",6935);
		Customer c2=new Customer("Ramya",6629);
		cusSet.add(c1);
		//iterator
		Iterator it=cusSet.iterator();
		//print name
		while(it.hasNext()) {
			Customer c11=(Customer)it.next();
			System.out.println(c1.name);
		}
		

	}

	public Object name;

}
class Customer
{
	public static Comparator idcomp;
	public static Comparator discountcomp;
	public static Comparator pointscomp;
	String name;
	int cusId;
	
	public Customer(String string, int i, int j, int k) {
		// TODO Auto-generated constructor stub
	}
	void Customer(String name,int cusId)
	{
		this.name=name;
		this.cusId=cusId;
	}
	public String toString() {
		return "name"+name+"cusID:"+cusId;
		
	}
	//check for duplicates
		//override equals method
		public boolean equals(Customer c)
		{
			System.out.println("Customer object same");
			return this.name.equals(c.name);
			
			
		}	
		//ovveride hashcode()
		public int hashCode()
		{
			System.out.println("Customer object same");
			return cusId;
		}


	}


