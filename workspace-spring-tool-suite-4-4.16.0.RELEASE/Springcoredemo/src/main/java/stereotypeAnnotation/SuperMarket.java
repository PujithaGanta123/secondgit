package stereotypeAnnotation;

import org.springframework.beans.factory.annotation.Autowired;

public class SuperMarket {
	@Autowired
	private SnackItems si;

	public SnackItems getSi() {
		return si;
	}

	public void setSi(SnackItems si) {
		this.si = si;
	}

	public SuperMarket(SnackItems si) {
		
		this.si = si;
	}

	public SuperMarket() {
		
	}

	@Override
	public String toString() {
		return "SuperMarket [si=" + si + "]";
	}

}
