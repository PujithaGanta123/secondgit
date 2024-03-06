package autowiringAnnotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Fruits {
	@Autowired
	@Qualifier("m")
	
	private Mango m;
	@Autowired
	@Qualifier("a")
	private Apple a;
	@Autowired
	@Qualifier("b")
	private Banana b;
	@Autowired
	@Qualifier("s")
	private Strawberry s;
	public Mango getM() {
		return m;
	}
	public void setM(Mango m) {
		this.m = m;
	}
	public Apple getA() {
		return a;
	}
	public void setA(Apple a) {
		this.a = a;
	}
	public Banana getB() {
		return b;
	}
	public void setB(Banana b) {
		this.b = b;
	}
	public Strawberry getS() {
		return s;
	}
	public void setS(Strawberry s) {
		this.s = s;
	}
	public Fruits(Mango m, Apple a, Banana b, Strawberry s) {
		super();
		this.m = m;
		this.a = a;
		this.b = b;
		this.s = s;
	}
	public Fruits() {
		
	}
	@Override
	public String toString() {
		return "Fruits [m=" + m + ", a=" + a + ", b=" + b + ", s=" + s + "]";
	}
	


}
