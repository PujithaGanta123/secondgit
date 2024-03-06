package com.cg.lifecycle;

public class StudentDetails {
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
	public void Start() {
		//name="pujitha";
		System.out.println("Initialized");
	}
	public void Destroy() {
		System.out.println("Destroyed");
	}

}
