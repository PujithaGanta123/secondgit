package jpaManytoOne;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import jpaRelation.Person;

public class CheckManytoOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManagerFactory fact=Persistence.createEntityManagerFactory("com.cg.jpaManytoOne");
		EntityManager entmnr= fact.createEntityManager();
		entmnr.getTransaction().begin();
		Manager mng = new Manager("meghana",21);
		
		
		
		Employees emp1 = new Employees("pujitha",mng);
		Employees emp2 = new Employees("bindupriya",mng);
		

		entmnr.persist(emp1);
		
		entmnr.persist(emp2);
		entmnr.getTransaction().commit();
		entmnr.close();
		fact.close();
		

	}

}
