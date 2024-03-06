package assignment;

public class OverRide {
	public static void main(String []arg) {
	SalaryPer2 e1=new SalaryPer2();
	e1.salary1(30000,245f);
}
}
class Salaryper
{
	int salary;
	int bonus;
	float pf;
	float insurence;
	
	double Salary1;
	double Salary2;
	void Employeesal(int salary,int bonus,float pf)
	{
		Salary1=salary+bonus+pf;
		System.out.println("Employee Salary with bonus:"+Salary1);
		
	}
}
class SalaryPer2 extends Salaryper
{
	float insurence;
	void salary1(int salary,float insurence)
	{
		System.out.println("salary with insurence:"+(salary+ bonus-insurence));
	}
	
}

