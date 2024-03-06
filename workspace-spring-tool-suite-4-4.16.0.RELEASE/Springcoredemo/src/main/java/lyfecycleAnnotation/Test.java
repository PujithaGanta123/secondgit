package lyfecycleAnnotation;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import springsetters.Student;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("lyfecycleAnnotation/config.xml");
		Employee emp=(Employee) ctx.getBean("Employee");
		System.out.println("Employee details: "+emp);
		ctx.registerShutdownHook();

	}

}
