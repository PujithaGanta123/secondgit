package autowiringAnnotation;

public class Strawberry {
	private int numos;

	public int getNumos() {
		return numos;
	}

	public void setNumos(int numos) {
		this.numos = numos;
	}

	public Strawberry(int numos) {
		
		this.numos = numos;
	}

	public Strawberry() {
		
	}

	@Override
	public String toString() {
		return "Strawberry [numos=" + numos + "]";
	}

}
