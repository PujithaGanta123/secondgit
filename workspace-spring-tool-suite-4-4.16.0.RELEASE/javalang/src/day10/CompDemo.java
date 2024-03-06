package day10;

import java.util.Arrays;
import java.util.Comparator;
		
public class CompDemo {
	public static void main(String[] args) {
		CGEmployee[] cg=new CGEmployee[5];
		cg[0]=new CGEmployee("Lakshmi",12,21,25000);
		cg[1]=new CGEmployee("Mallika",13,23,20000);
		cg[2]=new CGEmployee("Meghana",10,20,27000);
		cg[3]=new CGEmployee("Usha",11,22,24000);
		cg[4]=new CGEmployee("Spandana",14,24,29000);
		
		//Arrays.sort(cg);
		Arrays.sort(cg, CGEmployee.idcomp);
		System.out.println("After Sorting for ID :"+Arrays.toString(cg));
		Arrays.sort(cg, CGEmployee.agecomp);
		System.out.println("After Sorting for Age :"+Arrays.toString(cg));
		Arrays.sort(cg, CGEmployee.salcomp);
		System.out.println("After Sorting for descending Salary :"+Arrays.toString(cg));
	}
 
}
class CGEmployee
//implements Comparable<CGEmployee>
{
	String name;
	int empId;
	int age;
	float salary;
	
	
	CGEmployee(String name,int empId,int age,float salary)
	{
		this.name=name;
		this.empId=empId;
		this.age=age;
		this.salary=salary;
		
	}
	//override
	public String toString()
	{
		return "Name: "+name+"EmpID: "+empId+"Age: "+age+"Salary: "+salary;
	}
	/*@Override
	public int compareTo(CGEmployee o) {
		
		return (int) (this.salary- o.salary) ;
	}*/
	public static Comparator<CGEmployee>
	  salcomp = new Comparator<CGEmployee>()
	  {
		public int compare(CGEmployee e1, CGEmployee e2)
		{
			return (int) (e2.salary-e1.salary);
			
		}
		
	  };
	  public static Comparator<CGEmployee>
	  idcomp = new Comparator<CGEmployee>()
	  {
		public int compare(CGEmployee e1, CGEmployee e2)
		{
			return (int) (e1.empId-e2.empId);
		}
		
	  };
	  public static Comparator<CGEmployee>
	  agecomp = new Comparator<CGEmployee>()
	  {
		public int compare(CGEmployee e1, CGEmployee e2)
		{
			return (int) (e1.age-e2.age);
		}
		
	  };
	  
}
			

	


