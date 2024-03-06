package jpaManytoOne;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import jpaRelation.Person;

@Entity(name="Empl")
public class Employees {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int eId;
	private String ename;
	
	@ManyToOne(cascade=CascadeType.ALL)
	//join column
	@JoinColumn(name="eId")
	private Manager manager;
	
	public Employees() {
		
	}
	
	
	public Employees(String ename, Manager manager) {
		
		this.ename = ename;
		this.manager = manager;
	}
	
	


	public int geteId() {
		return eId;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public  Manager getManager() {
		return manager;
	}
	public void setManager(Manager manager) {
		this.manager = manager;
	}
	@Override
	public String toString() {
		return "Employees [eId=" + eId + ", ename=" + ename + ", manager=" + manager + "]";
	}

}
