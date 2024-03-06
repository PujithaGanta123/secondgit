package autowiringAnnotation;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import constructorRef.Customer;

public class Testwiring {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("autowiringAnnotation/config.xml");
		Fruits fr=(Fruits) ctx.getBean("Fruits");
		System.out.println(fr);
		ctx.registerShutdownHook();

	}

}
