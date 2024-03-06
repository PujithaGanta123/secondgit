package jpaManytoMany;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import jpaRelation.Person;

public class ManytoMany {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManagerFactory fact=Persistence.createEntityManagerFactory("jpaManytoMany");
		EntityManager entmnr= fact.createEntityManager();
		entmnr.getTransaction().begin();
		Customers p1 = new Customers(21,"puji","ongole");
		Customers p2 = new Customers(22,"pravallika","RJY");
		List<Customers> cust= new ArrayList();
		cust.add(p1);
		cust.add(p2);
		entmnr.persist(cust);
		
		Orders o1=new Orders("mobile",25000,cust);
		Orders o2=new Orders("laptop",75000,cust);
		entmnr.persist(o1);
		entmnr.persist(o2);
		entmnr.getTransaction().commit();
		entmnr.getTransaction().commit();
		
		fact.close();
		entmnr.close();
		

	}

}
