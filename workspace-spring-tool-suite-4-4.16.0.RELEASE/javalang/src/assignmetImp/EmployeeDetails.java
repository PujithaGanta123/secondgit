package assignmetImp;

import java.util.ArrayList;

public class EmployeeDetails {
	
	private String Firstname;
	private String Lastname;
	private String Spetialization;
	private int empid;
	 public EmployeeDetails(String Firstname,String lastname,String specialization,int empid) {
		 this.Firstname=Firstname;
		 this.Lastname=Lastname;
		 this.Spetialization=specialization;
		 this.empid=empid;
	 }
	 public String getFirstame() {
			return Firstname;
		}
		public void setFirstame(String firstame) {
			this.Firstname = firstame;
		}
		public String getspecialization() {
			return Spetialization;
		}
		public void setspecialization(String specialization) {
			this.Spetialization = specialization;
		}
		public String getSecondname() {
			return Lastname;
		}
		public void setSecondname(String secondname) {
			this.Lastname = secondname;
		}
		public int getEmpID() {
			return empid;
		}
		public void setEmpID(int empID) {
			this.empid = empID;
		}
	
	

}
