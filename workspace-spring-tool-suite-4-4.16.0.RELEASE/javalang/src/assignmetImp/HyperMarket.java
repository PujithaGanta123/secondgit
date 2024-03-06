package assignmetImp;

import java.util.HashMap;
import java.util.Map;

public class HyperMarket {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ElectrinicProducts ep=new ElectrinicProducts();
		ep.addProduct("HP Laptop",65000, 1);
		ep.addProduct("Mobile", 20000, 1);
		ep.addProduct("Headset",1000, 2);
		
		double Electronicsbill=ep.calculateBill();
		System.out.println("Electronics bill is:"+Electronicsbill);
		
		groceryProducts gp=new groceryProducts();
		gp.addProduct("Onion",150, 5);
		gp.addProduct("Tomato", 50, 3);
		gp.addProduct("Beetroot", 100, 1);
		gp.addProduct("Potato", 35, 2);
		double groceryBill=gp.calculateBill();
		System.out.println("Groceries bill is:"+groceryBill);

	}

}
class Product{
	String name;
	static double price;
	static int quantity;
	public Product(String name,double price,int quantity) {
		this .name=name;
		this.price=price;
		this.quantity=quantity;
	}
	public static double calculateCost() {
		return price*quantity;
	}
}
class ElectrinicProducts{
	private Map<String,Product> ep=new HashMap<>();
	public void addProduct(String name,double price,int quantity) {
		ep.put(name, new Product(name,price,quantity));
	}
		double calculateBill() {
			double sum=0;
			for(Product p:ep.values()) {
				sum+=Product.calculateCost();
			}
			double discount=sum>=10000&& sum<=20000?0.2:(sum>20000?0.3:0);
			return sum-(sum*discount);
		}
	}
class groceryProducts{
	private Map<String,Product> gp=new HashMap<>();
	
	public void addProduct(String name,double price,int quantity) {
		gp.put(name, new Product(name,price,quantity));
	}
	public double calculateBill() {
		double sum=0 ;
		for(Product p:gp.values()) {
			sum+=Product.calculateCost();
		}
		double discount=sum>=1000&& sum<=2000?0.2:(sum>2000?0.3:0);
		return sum-(sum*discount);
		
	}
}
 

















