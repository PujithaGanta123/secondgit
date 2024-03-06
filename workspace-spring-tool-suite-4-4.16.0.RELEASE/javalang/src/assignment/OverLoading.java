package assignment;

public class OverLoading {
public static void main(String[]arg) {
	salary1 e1=new salary1();
    e1.salary1(30000,2500);
	salary1 e2=new salary1();
	e2.Salary1(30000,250f,2500,3000);
	
	
	
}
}
class salary1
{
	int salary;
	int bonus;
	float pf;
	int OT;
	
	double salary11;
	double salary12;
	void salary1(int salary,int bonus)
	{
		salary11=salary+bonus;
		System.out.println("Employee Salary with bonus:"+salary11);
		
	}
	
	

	void Salary1(int salary,float pf,int bonus,int OT)
	{
		salary12=salary+bonus-pf+OT;
		//System.out.println("Employee salary with OT:"+salary11);
	     System.out.println("Employee Salary with OT :"+salary12);
	}
}