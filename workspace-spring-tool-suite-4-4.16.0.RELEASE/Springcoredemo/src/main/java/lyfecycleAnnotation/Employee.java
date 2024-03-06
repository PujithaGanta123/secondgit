package lyfecycleAnnotation;
import javax.annotation.*;
public class Employee {
	private int EId;
	private String name;


	public int getEId() {
		return EId;
	}
	public void setEId(int eId) {
		EId = eId;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}



	@Override
	public String toString() {
		return "Employee [EId=" + EId + ", name=" + name +  "]";
	}
	
	@PostConstruct
	public void hi() {
		System.out.println("Bean initialized");
	}
	@PreDestroy
	public void bye() {
		System.out.println("Bean destroyed");
	}

}
