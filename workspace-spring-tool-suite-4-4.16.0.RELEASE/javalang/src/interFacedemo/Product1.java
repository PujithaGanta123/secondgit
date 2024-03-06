package interFacedemo;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Stream;

public class Product1 {
	//int id;
	//String name;
	private float price;
	public Product1(int id,String name,float price) {
		//this.id=id;
		//this.name=name;
		this.price=price;
	}
	public float getPrice() {
		return price;
	}

	public static void main(String[] args) {
		List<Product> prodlist=new ArrayList<>();
		prodlist.add(new Product(1,"HPLaptop",65000f));
		prodlist.add(new Product(2,"DELLLaptop",80000f));
		prodlist.add(new Product(3,"MacBook",150000f));
		prodlist.add(new Product(2,"Lenovoaptop",45000f));
		prodlist.add(new Product(3,"asusBook",150000f));
		Set<Float> maxPrice=prodlist.stream();
		                                  
		                                 
				

	}

}
