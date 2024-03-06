package assignmetImp;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;



class Employee1 {
	
	 private List<EmployeeDetails> employeeList;
	 public Employee1() {
		 this.employeeList=new ArrayList<>();
	 }
	 //add method
	 public void addEmployee(EmployeeDetails emp)
	 {
		 employeeList.add(emp);
	 }
	 //remove method
	 public void removeEmployee(int empid) {
		 employeeList.removeIf(e->e.getEmpID()==empid);
	 }
	 public EmployeeDetails searchEmployee(int empid) {
		 for(EmployeeDetails ed:employeeList) {
			 if(ed.getEmpID()==empid) {
				 return ed;
			 }
		 }
		 return null;//emp not found
	 }
	 public void updateEmployee(EmployeeDetails updatedEmployee) {
		 int index=employeeList.indexOf(searchEmployee(updatedEmployee.getEmpID()));
		 if(index!=-1) {
			 employeeList.set(index, updatedEmployee);
		 }
	 }
 
}
public class NGT{
	public static void main(String[] args) {
		Employee1 e1=new Employee1();
		EmployeeDetails employee1=new EmployeeDetails("pujitha","ganta","Developer",1);
		e1.addEmployee(employee1);
		System.out.println("Employee added:"+employee1.getFirstame()+" "+employee1.getSecondname());
		EmployeeDetails searchEmployee=e1.searchEmployee(1);
		if (searchEmployee!=null) {
			System.out.println("employee found:"+searchEmployee.getFirstame()+" "+searchEmployee.getSecondname());
		}
		else {
			System.out.println("employee not found");
		}
		EmployeeDetails updatedEmployee=new EmployeeDetails("Bindu","ganta","Developer",1);
		e1.updateEmployee(updatedEmployee);
		System.out.println("Employee updated:"+updatedEmployee.getFirstame()+" "+updatedEmployee.getSecondname());
		e1.removeEmployee(1);
		System.out.println("Employee removed with ID 1");
	}
}


