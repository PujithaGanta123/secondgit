package autowiringAnnotation;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Mango {
	private int num;

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public Mango(int num) {
		
		this.num = num;
	}

	public Mango() {
		
	}

	@Override
	public String toString() {
		return "Mango [num=" + num + "]";
	}
	@PostConstruct
	public void start() {
		System.out.println("Bean Initialized");
	}
	@PreDestroy
	public void stop() {
		System.out.println("Bean destroyed");
	}
	

}
