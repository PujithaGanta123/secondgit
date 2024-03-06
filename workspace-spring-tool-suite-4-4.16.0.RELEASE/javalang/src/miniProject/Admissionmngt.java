package miniProject;
import java.time.LocalDate;
import java.util.ArrayList;

import project.Student;
 

public enum course1 {
	 DBA(10),REACT(15),ANGULAR(15),REST(12),SPRING(10),HIBERNATE(10);
	private int capacity;
	/*private String pnr;
	private String name;
	private String email;
	private String password;
	private course course;
	private double gpa;
	private LocalDate dob;
	private Object contactDetails;*/

	course1(int capacity) {
		this.capacity=capacity;
	}
	public int getCapacity() {
		return capacity;
		
	}

	class contactDetails {
	    private String city;
	    private String state;
	    private String phno;
	    
	    public contactDetails(String city,String state,String phno) {
	    	this.city=city;
	    	this.state=state;
	    	this.phno=phno;
	    }
	}
class student{
	private String pnr;
	private String name;
	private static String email;
	private String password;
	private course course;
	private static double gpa;
	private static contactDetails contactDetails;
	private LocalDate dob;
	public student(String pnr,String name,String email,String password,course course,double gpa,contactDetails conactDetails,LocalDate dob) {
		this.pnr=pnr;
		this.name=name;
		this.email=email;
		this.password=password;
		this.course=course;
		this.gpa=gpa;
		this.dob=dob;
		this.contactDetails=contactDetails;
	}
public boolean validationEmail() {
	return email.length()>=5 && email.length()<=10&& email.matches(".*[a-zA-Z0-9_&+*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[A-Za-z0-9-]+\\.)+[A-Za-z]{2,6}$]*.");
}
public boolean validationPassword() {
	return password.length()>=5 && password.matches(".*[@#$%].*");
}
public boolean validationcourse() {
	return course !=null && course.getCapacity()>0;
}
public boolean validationGPA() {
	return gpa>=7 && gpa<=10;
}
public boolean validatedob() {
	LocalDate d = LocalDate.parse("1999-01-01");
	return dob != null;
}

public class Admissionmngt {
	public static void main(String[]arg) {
		Student st = new Student("123","pujitha","puji@gmail.com","puji@123","REACT",9.0,contactDetails,"2000-06-23");
		contactDetails ctd=new contactDetails("kdkr","andra pradesh","8125347609");
		if(st.validationEmail()&& st.validationPassword()&&st.validationcourse()&&st.validationGPA()) {
			System.out.println("student admitted successfully");
		}
		else {
				System.out.println("admission failed. please chech validation rules.");
			}
	    }	
	
    }

}
