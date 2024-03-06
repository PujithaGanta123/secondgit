package lab4;
import java.security.Provider;
import java.security.Provider.Service;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
public class InputDetails extends Service{

		public static void main(String args[])
		{
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter Employee id:");
			int empid = sc.nextInt();
			System.out.println("Enter Employee name:");
			String empName=sc.next();
			System.out.println("Enter Salary:");
			double sal = sc.nextDouble();
			System.out.println("Enter Designation:");
			String designation = sc.next();
			InputDetails obj = new InputDetails();
			obj.setDetails(empid,empName,sal,designation);
			obj.display();
		}
	}

