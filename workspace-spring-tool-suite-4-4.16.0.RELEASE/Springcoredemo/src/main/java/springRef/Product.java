package springRef;

public class Product {
	
	private int prodId;
	private String prodname;
	private float price;
	public int getProdId() {
		return prodId;
	}
	public void setProdId(int prodId) {
		this.prodId = prodId;
	}
	public String getProdname() {
		return prodname;
	}
	public void setProdname(String prodname) {
		this.prodname = prodname;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
//	public Product(int prodId, String prodname, float price) {
//		
//		this.prodId = prodId;
//		this.prodname = prodname;
//		this.price = price;
//	}
	@Override
	public String toString() {
		return "Product [prodId=" + prodId + ", prodname=" + prodname + ", price=" + price + "]";
	}

}
