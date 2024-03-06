package com.cg.lifecycle;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import springRef.Customer;
import springsetters.Student;

public class Testlifecycle {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("com/cg/lifecycle/config.xml");
		StudentDetails std=(StudentDetails)ctx.getBean("Student");
		System.out.println("student details: "+std);
		ctx.registerShutdownHook();

	}

}
