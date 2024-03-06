package jpaManytoMany;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Entity(name="Customers")
public class Customers {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int custId;
	@ManyToOne(cascade=CascadeType.ALL)
	//join column
	@JoinColumn(name="custId")
	private String custname;
	private String address;
	public Customers() {
		
	}
	public Customers(int custId, String custname, String address) {
		
		this.custId = custId;
		this.custname = custname;
		this.address = address;
	}
	
	public int getCustId() {
		return custId;
	}
	public String getCustname() {
		return custname;
	}
	public void setCustname(String custname) {
		this.custname = custname;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Customers [custId=" + custId + ", custname=" + custname + ", address=" + address + "]";
	}

}
