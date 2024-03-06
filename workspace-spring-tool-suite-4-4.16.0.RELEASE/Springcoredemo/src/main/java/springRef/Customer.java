package springRef;

public class Customer {
	
	private int custId;
	private String name;
	private Product p;
	public Product getP() {
		return p;
	}
	public void setP(Product p) {
		this.p = p;
	}
	public int getCustId() {
		return custId;
	}
	public void setCustId(int custId) {
		this.custId = custId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

//	public Customer(int custId, String name, Product p) {
//		
//		this.custId = custId;
//		this.name = name;
//		this.p = p;
//	}
	@Override
	public String toString() {
		return "Customer [custId=" + custId + ", name=" + name + ", p=" + p + "]";
	}

	
	

}
