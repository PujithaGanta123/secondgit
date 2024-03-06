package constructorRef;

public class Product {
	
	private int prodId;
	
	public Product(int prodId) {
		
		this.prodId = prodId;
		
	}
	public Product() {
		
	}
	@Override
	public String toString() {
		return "Product [prodId=" + prodId +  "]";
	}

}
