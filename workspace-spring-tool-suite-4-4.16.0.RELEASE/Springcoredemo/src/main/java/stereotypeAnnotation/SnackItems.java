package stereotypeAnnotation;

import java.util.List;
import java.util.Map;
import java.util.Properties;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("SnackItems")
public class SnackItems {
	@Value("101")
	private int id;
	@Value("kitkat")
	private String name;
	@Value("#{item}")
	private List<String> item;
	@Value("#{numoitems}")
	private Map<String,Integer> numoitems;
	@Value("#{price}")
	private Properties price; 

	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}	
	
	public List<String> getItem() {
		return item;
	}
	public void setItem(List<String> item) {
		this.item = item;
	}
	public Map<String, Integer> getNumoitems() {
		return numoitems;
	}
	public void setNumoitems(Map<String, Integer> numoitems) {
		this.numoitems = numoitems;
	}
	
	public Properties getPrice() {
		return price;
	}
	public void setPrice(Properties price) {
		this.price = price;
	}
	public SnackItems() {
		
	}
	public SnackItems(int id, String name, List<String> item, Map<String, Integer> numoitems, Properties price) {
		
		this.id = id;
		this.name = name;
		this.item = item;
		this.numoitems = numoitems;
		this.price = price;
	}
	@Override
	public String toString() {
		return "SnackItems [id=" + id + ", name=" + name + ", item=" + item + ", numoitems=" + numoitems + ", price="
				+ price + "]";
	}


	



	

}
