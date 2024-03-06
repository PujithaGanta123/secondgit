package springschema;

public class Employee {
	private int EId;
	private String name;
	private int age;
	private float salary;
	
	public Employee(int eId, String name, int age) {
		
		EId = eId;
		this.name = name;
		this.age = age;
	}

	public Employee(int age, float salary) {
		
		this.age = age;
		this.salary = salary;
	}

	public Employee(String name) {
		
		this.name = name;
	}

	public Employee(int eId) {
		
		EId = eId;
	}

	
	public Employee(int eId, String name, int age, float salary) {
		
		EId = eId;
		this.name = name;
		this.age = age;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [EId=" + EId + ", name=" + name + ", age=" + age + ", salary=" + salary + "]";
	}
	

}
