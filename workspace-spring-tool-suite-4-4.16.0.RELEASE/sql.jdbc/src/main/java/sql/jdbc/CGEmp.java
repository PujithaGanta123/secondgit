package sql.jdbc;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name="CGEmployee")

public class CGEmp {
	

	public CGEmp() {
		
	}

	public CGEmp(String empName, float salary) {
		
		this.empName = empName;
		this.salary = salary;
	}

	@Id//primary key
	@GeneratedValue(strategy = GenerationType.IDENTITY)//automated values
	private int empId;
	
	@Column(name="Name")
	private String empName;
	
	@Column
	private float salary;

	public int getEmpId() {
		return empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "CGEmp [empId=" + empId + ", empName=" + empName + ", salary=" + salary + "]";
	}

}
