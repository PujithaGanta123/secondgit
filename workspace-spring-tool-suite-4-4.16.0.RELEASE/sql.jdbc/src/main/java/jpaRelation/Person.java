package jpaRelation;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
//@Table(name="Person")
public class Person {
	

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int pid ;
	private String name;
	private int age ;
	
	public Person() {
		
	}

	public Person( String name, int age) {

		this.name = name;
		this.age = age;
	}


	public int getPid() {
		return pid;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Person [pid=" + pid + ", name=" + name + ", age=" + age + "]";
	}

}
