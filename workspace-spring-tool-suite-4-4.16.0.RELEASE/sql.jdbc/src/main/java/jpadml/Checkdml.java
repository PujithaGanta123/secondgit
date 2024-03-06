package jpadml;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class Checkdml {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("com.cg.jpadml");
		EntityManager entmgr= factory.createEntityManager();
		//start
		entmgr.getTransaction().begin();
		//Query q=entmgr.createQuery("select s from Student s where stuname like 's%'");
		//Query q1=entmgr.createQuery("select s from Student s where fees>27000");
		//Query q2=entmgr.createQuery("select s from Student s where fees<26000");
		//Query q3=entmgr.createNativeQuery("insert into Student(stuname,fees) values(?,?)");
		//q.setParameter(1, "abhi");
		//q.setParameter(2, 45000);
		//q.setParameter(1, 15);
		Query q4=entmgr.createNativeQuery("insert into Student values(12,'haritha',30000)");
		//Query q5=entmgr.createQuery("delete from Student where stuId=9");
		//Query q6=entmgr.createQuery("update Student set Student='puji' where stuid=11");
		q4.executeUpdate();
		entmgr.getTransaction().commit();
    	List<Sudent> rl=(List<Sudent>)q4.getResultList();
		entmgr.getTransaction().commit();
		for(Sudent i:rl)
		{
			System.out.println(i);
		}

	}

}
