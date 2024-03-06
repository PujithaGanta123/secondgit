package lab4;


public class Services extends EmployeeDetails{
			public void setDetails(int id,String name,double sal,String designation)
			{
				this.id=id;
				this.name=name;
				salary=sal;
				this.designation=designation;
				if(salary>=50000.0 && designation.compareTo("developer")==0)
					insuranceScheme="Life Insurance";
				else if(salary>=30000.0 && designation.compareTo("tester")==0)
					insuranceScheme="Health Insurance";
				else if(salary>=20000.0 && designation.compareTo("trainee")==0)
					insuranceScheme="Travel Insurance";	
			}
			public void display()
			{
				System.out.println("Employee id:"+id+"\nEmployee name:"+name+"\nEmployee salary:"+salary+"\nDesignation:"+designation);
				System.out.println("Services offered: "+insuranceScheme);
			}


	}


