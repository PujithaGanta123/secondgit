package jpaManytoOne;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Manager {

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int Id;
	
	private String name;
	private int noemp;
	
	public int getId() {
		return Id;
	}
	public Manager() {
		
	}
	
	public Manager( String name, int noemp) {
		this.name = name;
		this.noemp = noemp;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getNoemp() {
		return noemp;
	}
	public void setNoemp(int noemp) {
		this.noemp = noemp;
	}
	@Override
	public String toString() {
		return "Manager [Id=" + Id + ", name=" + name + ", noemp=" + noemp + "]";
	}
	
	

}
