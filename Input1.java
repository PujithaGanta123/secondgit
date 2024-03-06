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

Syatem.out.println("Enter your name");
name=sc.next();
system.out.println("name:"+name);

syatem.out.println("Enter your marks:");
marks1=sc.nextInt();
system.out.println("marks1:" +marks1);

system.out.println("enter your marks:");
marks2=sc.nextInt();
system.out.println("marks2:"+marks2);

system.out.println("Enter your marks:");
marks3=sc.nextInt();
system.out.println("marks3:"+marks3);

total =marks1+marks2+marks3;
system.out.println("Total:"+total);
percentage=(total*100)/300;
system.out.println("percentage:"+percentage);

}

}