package day2;

public class Employee {

	public static void main(String[] args) {
		Sub s1=new Sub(0, 0);
		s1.bonus(30000,2500);
		
		
		

	}

}
class Super
{
	float sal;
	Super(float sal)
	{
		this.sal=sal;
	}
	Super display()
	{
		return new Super(sal);
	}
}
class Sub extends Super 
{
	float bonus;
	Sub (float sal,float bonus)
	{
		super(sal);
		this.bonus=bonus;
	}

	public void bonus(int i, int j) {
		
		
	}

	Sub display()
	{
		return new Sub(sal,bonus);
		
	}
}
class Sub2 extends Super 
{
	float pf;
	Sub2 (float sal,float pf)
	{
		super(sal);
		this.pf=pf;
	}

	Sub display()
	{
		return new Sub(sal,pf);
		
	}
}
	

