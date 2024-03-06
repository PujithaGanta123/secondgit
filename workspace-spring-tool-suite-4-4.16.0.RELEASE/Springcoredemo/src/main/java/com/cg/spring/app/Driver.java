package com.cg.spring.app;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Driver {
	public static Department loadStaffDetails()
	{
		ClassPathXmlApplicationContext cp=new ClassPathXmlApplicationContext("com/cg/spring/app/config.xml");
		return (Department)cp.getBean("departmentObj");
	}
 
	public static void main(String[] args) {
		Department obj=loadStaffDetails();
		obj.displayStaffDetails();

}
}