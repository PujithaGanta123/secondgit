import java.util.Scanner;
class Input
{
public static void main(String a[])
{
int empID;
String name;
int mark1,mark2, mark3,total;
 double percentage;
Scanner sc=new Scanner(System.in);

System.out.println("Enter your empID");
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

total =marks1+marks2+marks3;
System.out.println("Total:"+total);
percentage=(total*100)/300;
System.out.println("percentage:"+percentage);

}

}