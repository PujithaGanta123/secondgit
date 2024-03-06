package jpaInheritance;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import sql.jdbc.CGEmp;

public class Areas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("com.cg.jpaInheritance");
		EntityManager entmgr= factory.createEntityManager();
		//start
		entmgr.getTransaction().begin();
		Rectangle aorec=new Rectangle();
		Square aos=new Square();
		Triangle aotr=new Triangle();
		
		aorec.setLength(5);
		aorec.setWidth(5);
		aorec.setAreaofrectangle(25);
		aorec.setColour("pink");
		entmgr.persist(aorec);
		
		aos.setA(15);
		aos.setAreaOfSquare(225);
		aos.setColour("red");
		entmgr.persist(aos);
		
		aotr.setHeight(10);
		aotr.setBase(10);
		aotr.setAreaOfTriangle(50);
		aotr.setColour("green");
		entmgr.persist(aotr);
				
		entmgr.getTransaction().commit();
		
		entmgr.getTransaction().begin();
		Rectangle r1=entmgr.find(Rectangle.class,1);
		System.out.println(r1);
		entmgr.getTransaction().commit();
		
		factory.close();
		entmgr.close();

	}

}
