package day10;

import java.util.Arrays;
import java.util.Comparator;

public class ComparatorCust {
	public static void main(String[] arg) {

		Customer11[] cg=new Customer11[5];
	cg[0]=new Customer11(12,21,7);
	cg[1]=new Customer11(13,23,8);
	cg[2]=new Customer11(10,20,9);
	cg[3]=new Customer11(14,24,6);
	//Arrays.sort(cg);
	Arrays.sort(cg, Customer11.idcomp);
	System.out.println("After Sorting for ID :"+Arrays.toString(cg));
	System.out.println();
	Arrays.sort(cg, Customer11.discountcomp);
	System.out.println("After Sorting for discount :"+Arrays.toString(cg));
	System.out.println();
	Arrays.sort(cg,Customer11.pointscomp);
	System.out.println("After Sorting for descending points :"+Arrays.toString(cg));
	System.out.println();
}

}
class Customer11

{

int id;

int discount;
int points;

Customer11(int id,int discount,int points)

{

	this.id=id;

	this.discount=discount;
	this.points=points;

}
public String toString()
{
	return "ID: "+id+"Discount: "+discount+"Points: "+points;
}

public static Comparator<Customer11>
  pointscomp = new Comparator<Customer11>()
  {
	public int compare(Customer11 e1, Customer11 e2)
	{
		return (int) (e2.points-e1.points);
	}
  };
  public static Comparator<Customer11>
  discountcomp= new Comparator<Customer11>()
  {
	public int compare(Customer11 e1, Customer11 e2)
	{
		return (int) (e1.discount-e2.discount);
	}
  };
  public static Comparator<Customer11>
  idcomp = new Comparator<Customer11>()
  {
	public int compare(Customer11 e1, Customer11 e2)
	{
		return (int) (e1.id-e2.id);
	}
  }
}
	


