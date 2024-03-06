package project;	 
import java.util.*;
import java.util.regex.*;

import miniProject.course1.contactDetails;

import java.time.LocalDate;
	 
	public class Student {
		private int prn;
		private String name;
		private String email;
		private String password;
		private double gpa;
		private String dob;
		Course c;
	    ContactDetails cd = new ContactDetails();
	    //Constructor
		Student(int prn,String name,String email,String password,double gpa,String dob,String course,String city,String state,long phone)
		{
			if(validation(email,password,course,gpa,dob))
			{
				this.prn = prn;
				this.name = name;
				this.email=email;
				this.password=password;
				this.gpa = gpa;
				this.dob = dob;
				cd.setDetails(city, state, phone);
				c = new Course(course);
				c.updateCapacity();		
			}
		}



		//Validation
		public boolean validation(String email,String password,String course,double gpa,String dob) 
		{
			LocalDate d = LocalDate.parse("1999-01-01");
			LocalDate d1 = LocalDate.parse(dob);
			String emailregex = "^[A-Za-z0-9]+@[A-Za-z0-9-]+\\.[A-Za-z]{2,6}$";
			Pattern p = Pattern.compile(emailregex);
			Matcher m = p.matcher(email);
			String passregex = "^[A-Z][a-zA-Z0-9/@$%&]{7}";
			Pattern p1 = Pattern.compile(passregex);
			Matcher m1 = p1.matcher(password);
			if(m.matches()==true)
			{
				if(m1.matches()==true)
				{
					if(gpa>=7.0 && gpa<=10.0)
					{
						if(d1.compareTo(d)>0 )
							return true;
						else
						{
							System.out.println("DOB must exceed 1999-01-01.");
							return false;
						}
					}
					else
					{
						System.out.println("GPA should be greater than 7.0 and less than 10.0");
						return false;
					}
				}
				else
				{
					System.out.println("Password is incorrect.");
					return false;	
				}	
			}
			else
			{
				System.out.println("Email is incorrect.");
				return false;
			}
		}

		//toString()
		public String toString()
		{
			return "Student ID: "+prn+"\nStudent name: "+name+"\nStudent email: "+email;
		}
		//equals()
		public boolean equals(int id)
		{
			if(this.prn==id)
				return true;
			return false;
		}

		public boolean validationEmail() {
			// TODO Auto-generated method stub
			return false;
		}
	}
	 
	 
	class Course
	{
		private static int arr[] = {2,2,2,2,2,2};
		private String course;
		Course(String course)
		{
			this.course = course;
		}
		public void updateCapacity()
		{
			if(course.equals("DBT") && arr[0]>0)
				arr[0]-=1;
			else if(course.equals("REACT") && arr[1]>0)
				arr[1]-=1;
			else if(course.equals("ANGULAR") && arr[2]>0)
				arr[2]-=1;
			else if(course.equals("REST") && arr[3]>0)
				arr[3]-=1;
			else if(course.equals("SPRING") && arr[4]>0)
				arr[4]-=1;
			else if(course.equals("HIBERNATE") && arr[5]>0)
				arr[5]-=1;
			else
				System.out.println("Course is not available");
		}
	}
	 
	 
	class ContactDetails 
	{
		private String city;
		private String state;
		private long phone;
		public void setDetails(String city,String state,long phone)
		{
			this.city=city;
			this.state=state;
			this.phone=phone;
		}
	}

