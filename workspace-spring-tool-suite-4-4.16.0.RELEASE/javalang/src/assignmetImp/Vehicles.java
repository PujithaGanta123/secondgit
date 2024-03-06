package assignmetImp;


class TypeException extends Exception {
    @Override
    public String toString() {
        return "Vehicle Type Not Set";
    }
}

public class Vehicles {
	
	//type, model_no, model_name, owner_name, owner_details
	protected String type;
	protected String model_no;
	protected String model_name;
	protected String owner_name;
	protected String owner_details;
	public Vehicles() {
		
		
    }
	public Vehicles(String type,String model_no,String model_name,String owner_name,String owner_details){
		this.type=type;
		this.model_no=model_no;
		this.model_name=model_name;
		this.owner_name=owner_name;
		this.owner_details=owner_details;
	}
	public String get_type() {
	    return type;
	}

	public String retrieve() {
	    return "null";
	}



}
class Car extends Vehicles{

	public Car(String type, String model_no, String model_name, String owner_name, String owner_details) {
		super(type, model_no, model_name, owner_name, owner_details);
		
		
	}
	public String Get_Type() {
		return  type;
		
	}
	public void set_type(String string) {
		this.type=type;
		
	}
	public String retrive() {
		 try {
	            if (type == null) {
	                throw new TypeException();
	            } 
	            else {
	                return model_no + ", " + model_name + ", " + owner_details + ", " + owner_name;
	            }
	        }
		 catch (TypeException e) {
	            return e.toString();
	        }
	    }
		
}
class Exception11{
	public static void main(String[]args) {
		Car car1 = new Car("SUV","123", "Toyota", "John", "123 Main St");
        car1.set_type("SUV");
        System.out.println(car1.retrieve());

        Car car2 = new Car("Sedan","456", "Honda", "Alice", "456 Elm St");
        System.out.println(car2.retrieve());
		
		        
		    }
		
	}


