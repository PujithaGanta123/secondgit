package day10;
import java.util.*;
public class Customer {
	public static void main(String[] args) {
		 
		Map<Integer,Customer1> mp=new HashMap<>();
 
		Customer1 cust=new Customer1(14,"PUJITHA",11);
		Customer1 cus=new Customer1(14,"PUJITHA",11);
 
		mp.put(14, cust);
 
		for(Map.Entry me:mp.entrySet()) {
 
					Customer1 cust1 = (Customer1)me.getValue();
 
					if(Integer.valueOf(me.getKey().toString())%2!=0) {
 
						System.out.println("Name: "+cust1.name+" Customer id:"+cust1.id+" Discount:"+(cust1.discount+5));
 
					}
 
					else {
 
						System.out.println("Name: "+cust1.name+" Customer id:"+cust1.id+" Discount:"+cust1.discount);
 
					}
 
				}
 
	}
 
}
 
		class Customer1
 
		{
 
			String name;
 
			int id;
 
			int discount;
 
			Customer1(int id,String name,int discount)
 
			{
 
				this.id=id;
 
				this.name=name;	
 
				this.discount=discount;
 
			}
 
			//toString()
 
			public String toString()
 
			{
 
				return "Customer Id: "+id+" Name: "+name;
 
			}
 
			//equals()
 
			public boolean equals()
 
			{
 
				return false;
 
			}
 
			//hashCode()
 
			public int hashCode()
 
			{
 
				return id;
 
			}
}
