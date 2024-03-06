package day10;

import java.util.Arrays;

public class Coparable {
	public static void main(String args[]) {
		Customer2[] cu=new Customer2[5];
		cu[0]=new Customer2(1,"pujitha",20,2000);
		cu[1]=new Customer2(12,"pravali",10,1000);
		cu[2]=new Customer2(15,"nandini",50,5000);
		cu[3]=new Customer2(11,"soma",40,4000);
		cu[4]=new Customer2(14,"divaya",30,3000);
		Arrays.sort(cu);
		System.out.println("After sorting: "+Arrays.toString(cu));
	}
}
class Customer2 implements Comparable<Customer2>{
    int custid;
	String name;
	double discount;
	int points;
	Customer2(int custid,String name,double discount,int points){
		this.custid=custid;
		this.name=name;
		this.discount=discount;
		this.points=points;
	}
		//override
		public String toString()
		{
			return "Customer Id: "+custid+"Name: "+name+"Discount: "+discount+"Points: " +points;
		}
		public int compareTo(Customer2 o) {
			return (int)(this.points-o.points);
		}
}
