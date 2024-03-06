package interFacedemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Streams {
	{
		Collection<String> coll=Arrays.asList("aa","bb");
 
		Stream<String> streamcoll=coll.stream();
	//	System.out.println(streamcoll.count());
		
		
		String[] arr=new String[]{"aa","bb","aa","cc"};
		Stream<String> strArray=Arrays.stream(arr);
		//System.out.println(strArray.distinct().count());
		
		
		Stream.iterate(1, a->a+1)//iteration
		.filter(a->a%2==0)//condition check
		.limit(10)
		.forEach(System.out::println);
		
		
		//Convert List to Set
		
		List<Product> prodlist=new ArrayList<>();
		prodlist.add(new Product(1,"HPLaptop",65000f));
		prodlist.add(new Product(2,"DELLLaptop",80000f));
		prodlist.add(new Product(3,"MacBook",150000f));
		
		// product price >70000 into Set
		Set<Float> prodset=prodlist.stream()
							.filter(prod->prod.price>70000)
							.map(prod->prod.price)
							.collect(Collectors.toSet());
		                    
		                    
		System.out.println("Laptop price:"+prodset);
		
		List<Integer> li=new ArrayList();
		li.add(12);
		li.add(20);
		li.add(12);
		li.add(45);
		Set<Integer> s=li.stream()
				.distinct()
				.collect(Collectors.toSet());
		Set<Integer> s1=li.stream()
				.collect(Collectors.toSet());
		System.out.println(s);	
		System.out.println(s1);
		
		Map<String,Float> m=prodlist.stream()
				.collect(Collectors.toMap(Product::getPname,Product::getPrice ));
		System.out.println(m);
		
		Map<String,Float> m1=prodlist.stream()
				.collect(Collectors.toMap(p->p.pname,p->p.price ));
		System.out.println(m1);
		
		Integer min=li.stream()
				.max(Comparator.reverseOrder()).get();
		System.out.println("Minimum value: "+min);
		
		Integer max=li.stream()
				.max(Integer::compare).get();
		System.out.println("Maximum value: "+max);
		
		Float max1=prodlist.stream()
				.map(p->p.price)
				.max(Float::compare).get();
		System.out.println("Maximum price: "+max1);
		
		Float min1=prodlist.stream()
				.map(p->p.price)
				.max(Comparator.reverseOrder()).get();
		System.out.println("Minimum price: "+min1);
		
		
		
							
					
		
	}
	
	
}
class Product
{
	float price;
	String pname;
	int serialId;
	Product(int serialId, String pname,float price)
	{
		this.serialId=serialId;
		this.pname=pname;
		this.price=price;
		
	}
	public void setPname(String pname)
	{
		this.pname=pname;
	}
	public void setPrice(float price)
	{
		this.price=price;
	}
	public String getPname()
	{
		return this.pname;
	}
	public float getPrice()
	{
		return this.price;
	}
	

}
