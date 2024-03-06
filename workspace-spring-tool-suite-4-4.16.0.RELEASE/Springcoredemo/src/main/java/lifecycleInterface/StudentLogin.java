package lifecycleInterface;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class StudentLogin implements InitializingBean,DisposableBean{
	private int stdId;
	private String name;
	public int getStdId() {
		return stdId;
	}
	public void setStdId(int stdId) {
		this.stdId = stdId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Student [stdId=" + stdId + ", name=" + name + "]";
	}
	public void destroy() throws Exception {
		System.out.println("distroyed");
		
	}
	public void afterPropertiesSet() throws Exception {
		System.out.println("Bean Initialized");
		name="yashu";		
	}
	
}
