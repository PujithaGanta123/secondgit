package autowiringAnnotation;

public class Apple {
	public Apple() {
		
	}

	public Apple(int numoapp) {
		
		this.numoapp = numoapp;
	}

	private int numoapp;

	public int getNumoapp() {
		return numoapp;
	}

	public void setNumoapp(int numoapp) {
		this.numoapp = numoapp;
	}

	@Override
	public String toString() {
		return "Apple [numoapp=" + numoapp + "]";
	}
	

}
