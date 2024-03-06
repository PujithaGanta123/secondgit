package autowiringAnnotation;

public class Banana {
	private int numob;

	public int getNumob() {
		return numob;
	}

	public void setNumob(int numob) {
		this.numob = numob;
	}

	public Banana(int numob) {
		
		this.numob = numob;
	}

	public Banana() {
		
	}

	@Override
	public String toString() {
		return "Banana [numob=" + numob + "]";
	}

}
