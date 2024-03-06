package sql.jdbc;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Client {

	public static void main(String[] args) {
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("com.cg.sql.jdbc");
		EntityManager entmgr= factory.createEntityManager();
		//start
		entmgr.getTransaction().begin();
		//object
		CGEmp cg=new CGEmp("Pravallika",40000);
		//insert
		entmgr.persist(cg);
		
		entmgr.getTransaction().commit();
		
		//read
		//start
		
		entmgr.getTransaction().begin();
		CGEmp cg1=entmgr.find(CGEmp.class,4);
		System.out.println(cg1);
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter EmpId to be removed");
		int id=sc.nextInt();
		
		
		CGEmp cg2=entmgr.find(CGEmp.class,id);
 
		entmgr.remove(cg2);
		entmgr.getTransaction().commit();
		
		System.out.println("Employee removed"+cg2);
		
		//update a row
		
		entmgr.getTransaction().begin();
		System.out.println("Enter EmpId to be updated");
		int uid=sc.nextInt();
		System.out.println("Enter the column to be updated");
		String colname=sc.next();
		
		CGEmp cg3=entmgr.find(CGEmp.class,uid);
		if(colname.equals("name"))
		{
		System.out.println("Enter the name to be updated");
		String uname=sc.next();
		cg3.setEmpName(uname);
		}
		else
		{
			System.out.println("Enter the salary to be updated");
			float sal=sc.nextFloat();
			cg3.setSalary(sal);
		}
			
		System.out.println("Employee updated"+cg3);
		entmgr.getTransaction().commit();
		
		
		factory.close();
		entmgr.close();
		
		
		
		
 

	}

}
