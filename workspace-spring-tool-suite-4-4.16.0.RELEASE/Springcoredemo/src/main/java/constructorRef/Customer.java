package constructorRef;

public class Customer {
	
	
	private Product p;
	

	public Customer( Product p) {
		
		
		this.p = p;
	}
	@Override
	public String toString() {
		return "Customer [  p=" + p + "]";
	}
	public Customer() {
		
	}

	
	

}
