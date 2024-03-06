package jpadml;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity(name="Student")
public class Sudent {
private int stuId;
	
	@Column(name="Name")
	private String stuName;
	
	@Column
	private float fees;
public Sudent() {
		
	}

public Sudent(int stuId, String stuName, float fees) {
		
		this.stuId = stuId;
		this.stuName = stuName;
		this.fees = fees;
	}


	public int getStuId() {
		return stuId;
	}


	public String getStuName() {
		return stuName;
	}

	public void setStuName(String stuName) {
		this.stuName = stuName;
	}

	public float getFees() {
		return fees;
	}

	public void setFees(float fees) {
		this.fees = fees;
	}

	@Override
	public String toString() {
		return "Sudent [stuId=" + stuId + ", stuName=" + stuName + ", fees=" + fees + "]";
	}

}
