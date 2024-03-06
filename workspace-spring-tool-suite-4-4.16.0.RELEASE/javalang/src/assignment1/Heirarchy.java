package assignment1;

public class Heirarchy {
    public static void main(String arg[]) {
    	Customer1 c1=new Customer1(101,"jj",12345);
    	c1.display();
    	Customer2 c2=new Customer2(102,"jj",30000);
    	c2.display();
    	
    }
}
class Employee1
{
	int id;
	String name;
	
	Employee1(int id, String name)
	{
		this.name=name;
		this.id=id;
	}
	void display()
	{
		System.out.println("name:"+name);
	}
}
class Customer1 extends Employee1{
	int phno;
	Customer1(int id,String name,int phno){
		super (id,name);
		this.phno=phno;
		
	}
	void display()
	{
		System.out.println("name:"+name+"phno"+phno);
		
	}
}
class Customer2 extends Employee1
{
	int sal;
	Customer2(int id,String name,int sal){
		super(id,name);
		this.sal=sal;
	}
	void display() {
		System.out.println("name:"+name+"sal:"+sal);
	}
}











