package assignmetImp;

import java.util.HashMap;
import java.util.Map;

public class Problem2 {
	public static void main(String []arg) {
		
	}

}
class courierServiceMain{
	private  Map<String,String> courierMap;
	
	public Map<String,String> getCourierMap(){
		return courierMap;
	}
	public void setCourierMap(Map<String,String> CourierMap){
		this.courierMap=courierMap;
	}
	courierServiceMain(Map<String,String>courierMap){
		this.courierMap=new HashMap<String,String>();
	}
	public void addData(String id,String type) {
		courierMap.put(id, type);
	}

	
}
