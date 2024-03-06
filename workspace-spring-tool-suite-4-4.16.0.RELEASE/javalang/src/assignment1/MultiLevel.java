package assignment1;

public class MultiLevel {
	 public static void main(String arg[]) {
	    	Employee c1=new Employee(101,"jj");
	    	c1.display();
	    	CustomerSam c11=new CustomerSam(102,"jj",123456);
	    	c11.display();
	    	Customerjohn c2=new Customerjohn(102,"jj",123457);
	    	c2.display();
	    }
	}
	class Employee
	{
		int id;
		String name;
		
		Employee(int id, String name)
		{
			this.name=name;
			this.id=id;
		}
		void display()
		{
			System.out.println("name:"+name);
		}
	}
	class CustomerSam extends Employee{
		int phno;
		CustomerSam(int id,String name,int phno){
			super (id,name);
			this.phno=phno;
			
		}
		void display()
		{
			System.out.println("name:"+name+"phno"+phno);
			
		}
	}
	class Customerjohn extends Employee
	{
		int sal;
		Customerjohn(int id,String name,int sal){
			super(id,name);
			this.sal=sal;
		}
		void display() {
			System.out.println("name:"+name+"sal:"+sal);
		}
	}

