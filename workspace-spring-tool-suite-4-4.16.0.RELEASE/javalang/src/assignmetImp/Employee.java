package assignmetImp;
public class Employee{
	String name;
    String designation;
	double salary;
	int bonus;
	double commision;
    int target;
	
	
Employee (String name,String designation,int target ){
		this.name=name;
		this.designation=designation;
		this.target=target;

	

abstract class employee1{
	double salary;
	int bonus;
	double commision;
		
		
	}
}
void display() {
	System.out.println("name:"+name);
}
class softwareEmployee extends Employee {
	double salary;
	//int bonus;
	//int commission;

	softwareEmployee(String name,String designation,int target) {
       super(name,designation,target);
       this.salary=salary;
       this.bonus=bonus;
       this.commision=commision;
	
    }
	void display() {
		//salary=salary+bonus+commission;
		System.out.println(salary);
	}
}
class marketingEmployee extends Employee{
	int salary;
	int bonus;
	int commision;
	marketingEmployee(String name,String designation,int target){
		super (name,designation,target);
		this.salary=salary;
	    this.bonus=bonus;
	    this.commision=commision;
	}
	void display() {
		//salary=salary+bonus+commission;
		System.out.println(salary);
	}
}
public void displayDetails() {
	// TODO Auto-generated method stub
	System.out.println("Employee name:"+name);
	System.out.println("Designation:"+designation);
	System.out.println("targets:"+target);
	System.out.println("Salary:"+salary);
	System.out.println("Bonus:"+bonus);
	System.out.println("commision:"+commision);
	
}
public static void main(String []arg) {
	 softwareEmployee s=new softwareEmployee("Pujitha","softwareEmployee",30);
	  s.displayDetails();
	 marketingEmployee m=new marketingEmployee("bindu","marketingEngineer",80);
	  m.displayDetails();
	
}

	}


















	/*private void calculatesalary() {
		switch(designation) {
		case "softwareEmployee":
			salary=50000+Bonus+Commision;
			break;
		case "MarketingEmployee":
			salary=40000+Bonus+Commision;
			break;
		}
		
		
	}
	private void calculateBonus() {
		if(softwareEmployee) {
			Bonus=salary*0.1;
		}else {
			Bonus=salary*0.08;
		}
	

}
	private void calculatecomission() {
		if(target>25 && target<50) 
			Commision=salary+1000;
			else if(target>50&&target<75) 
				Commision=salary+2000;
			else
				Commision=salary+3000;
			
		}
	public void displayDetails() {
		System.out.println("Employee name:"+name);
		System.out.println("Designation:"+designation);
		System.out.println("targets:"+target);
		System.out.println("Salary:"+salary);
		System.out.println("Bonus:"+Bonus);
		System.out.println("commision:"+Commision);
	}
	public static void main(String []arg) {
		Employee e=new Employee("Pujitha","softwareEmployee",30);
		 e.displayDetails();
	}
	}
}*/

