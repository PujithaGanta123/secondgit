package lifecycleInterface;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import springRef.Customer;
import springsetters.Student;

public class Testlifecycle {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("lifecycleInterface/config.xml");
		StudentLogin std=(StudentLogin)ctx.getBean("Student");
		System.out.println("student details: "+std);
		ctx.registerShutdownHook();

	}

}
