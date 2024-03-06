package jpaRelation;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;


public class TestRelation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManagerFactory fact=Persistence.createEntityManagerFactory("com.cg.jpaRelation");
		EntityManager entmnr= fact.createEntityManager();
		
		entmnr.getTransaction().begin();
		Person p1 = new Person("meghana",21);
		Person p2 = new Person("poojitha",20);
		List<Person> p = new ArrayList();
		p.add(p1);
		p.add(p2);
		School s = new School("gvp",p);
		
		entmnr.persist(s);
		entmnr.getTransaction().commit();
		
		
		fact.close();
		entmnr.close();
		
		
		
		
		

	}

}
