package springsetters;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("springsetters/config.xml");
		Student fc=(Student) ctx.getBean("Student");
		System.out.println("ID: "+fc.getID()+" Name: "+fc.getName());
		System.out.println("Branches: "+ fc.getBranch());
		System.out.println("Course: "+fc.getCourse());

	}

}
