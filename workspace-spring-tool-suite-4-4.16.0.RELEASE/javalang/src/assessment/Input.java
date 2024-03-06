package assessment;
import java.util.Scanner;
public class Input {
	public static void main(String arg[]) {
		
	int empID;
	String name;
	int mark1=0,mark2=0, mark3=0,total=0;
	double percentage;
	Scanner sc=new Scanner(System.in);
    
    System.out.println("enter your empID");
	empID=sc.nextInt();
	System.out.println("empId:"+empID);
  
	System.out.println("Enter your name");
	name=sc.next();
	System.out.println("Name:"+name);

	System.out.println("Enter your marks:");
	mark1=sc.nextInt();
	System.out.println("mark1:" +mark1);
	
	System.out.println("enter your marks:");
	mark2=sc.nextInt();
	System.out.println("mark2:"+mark2);
	
	System.out.println("Enter your marks:");
	mark3=sc.nextInt();
	System.out.println("mark3:"+mark3);

	total =mark1+mark2+mark3;
	System.out.println("Total:"+total);
	percentage=(total*100)/300;
	System.out.println("percentage:"+percentage);
        
	}
	

	}

