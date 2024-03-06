package jpaRelation;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity(name="School")
public class School {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int sid;

		
	private String schname;
	
	
	//relation
	@OneToMany(cascade=CascadeType.ALL)
	//join column
	@JoinColumn(name="sid")
	private List<Person> Person;
	
	public School() {
		
	}

	public School( String schname,  List<Person> person) {
		
		this.schname = schname;
		Person = person;
	}

	

	public int getSid() {
		return sid;
	}

	public String getSchname() {
		return schname;
	}

	public void setSchname(String schname) {
		this.schname = schname;
	}


	public List<Person> getPerson() {
		return Person;
	}

	public void setPerson(List<Person> person) {
		Person = person;
	}



	
	@Override
	public String toString() {
		return "School [sid=" + sid +", schname=" + schname + ", Person=" + Person + "]";
	}
	
	

}
