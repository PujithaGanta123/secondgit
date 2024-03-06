package stereotypeAnnotation;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import springRef.Customer;

public class Teststereotype {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("stereotypeAnnotation/config.xml");
		SuperMarket si=(SuperMarket) ctx.getBean("SuperMarket");
		System.out.println("Products "+si);

	}

}
