package constructorRef;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.annotation.Order;

import springschema.Employee;

public class TestRef {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("constructorRef/config.xml");
		Customer cust=(Customer) ctx.getBean("Customer");
		System.out.println("Customer details"+cust);

	}

}
