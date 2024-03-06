package jpaManytoMany;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import jpaManytoOne.Manager;

@Entity
public class Orders {


	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int prodId;
	private String prodname;
	private int prodCost;
	private List<Customers> customer;
	public Orders() {
		
	}

	public Orders( String prodname, int prodCost,List<Customers> customer) {

		this.prodname = prodname;
		this.prodCost = prodCost;
		this.customer = customer;
	}
	
	public int getProdId() {
		return prodId;
	}

	public String getProdname() {
		return prodname;
	}
	public void setProdname(String prodname) {
		this.prodname = prodname;
	}
	public float getProdCost() {
		return prodCost;
	}
	public void setProdCost(int prodCost) {
		this.prodCost = prodCost;
	}
	public List<Customers> getCustomer() {
		return customer;
	}

	public void setCustomer(List<Customers> customer) {
		this.customer = customer;
	}

	@Override
	public String toString() {
		return "Orders [prodId=" + prodId + ", prodname=" + prodname + ", prodCost=" + prodCost + ", customer="
				+ customer + "]";
	}



	

}
