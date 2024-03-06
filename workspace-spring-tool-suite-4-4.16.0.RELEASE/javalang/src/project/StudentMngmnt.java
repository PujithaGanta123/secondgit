package project;
import java.util.Date;
import java.util.Scanner;

	 
	public class StudentMngmnt {
		public static void main(String args[])
		{
			int id,sz;
			String name,email,password,dob,course,city,state;
			double gpa;
			long phone; 
			
			Scanner sc = new Scanner(System.in);
			System.out.println("\t\t\t\t\tWelcome to Student Management System");
			System.out.println("\t\t\t\t\t*************************************");
			System.out.println("Courses available: DBT, REACT, ANGULAR, RUST, SPRING, HIBERNATE");
			System.out.println("\nFor how many students do you want to enter data:");
			sz = sc.nextInt();
			Student s[] = new Student[sz];
			label1:
			for(int i=0;i<sz;i++)
			{
				System.out.println("Enter Student UniqueId:");
				id = sc.nextInt();
				System.out.println("Enter name of the Student:");
				sc.nextLine();
				name = sc.nextLine();
				System.out.println("Enter emailId:");
				email = sc.nextLine();
				System.out.println("Enter password:");
				password = sc.nextLine();
				System.out.println("Enter gpa:");
				gpa = sc.nextDouble();
				System.out.println("Enter DateOfBirth(Format:yyyy-mm-dd):");
				sc.nextLine();
				dob = sc.nextLine();
				System.out.println("Enter MobileNo:");
				phone = sc.nextLong();
				System.out.println("Enter State:");
				sc.nextLine();
				state = sc.nextLine();
				System.out.println("Enter City:");
				city = sc.nextLine();
				System.out.println("Enter your Course:");
				course = sc.nextLine();
				for(int j=0;j<=i-1;j++)
				{
					if(s[j].equals(id))
					{
						System.out.println("Student id already exists.");
						break label1;
					}
				}
				s[i] = new Student(id,name,email,password,gpa,dob,course,city,state,phone);
				System.out.println(s[i]);

			}
			sc.close();
		
		}
	} 
	

	

	

	  
	   
   

