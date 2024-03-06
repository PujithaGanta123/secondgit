package springschema;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import springsetters.Student;

public class Testschema {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("springschema/config.xml");
		Employee emp=(Employee) ctx.getBean("Employee");
		System.out.println("Employee details: "+emp);

	}

}
