package springsetters;

import java.util.*;

import org.springframework.core.convert.Property;

public class Student {
	private int ID;
	private String name;
	private List<String> branch;
	private Properties course;
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<String> getBranch() {
		return branch;
	}
	public void setBranch(List<String> branch) {
		this.branch = branch;
	}
	public Properties getCourse() {
		return course;
	}
	public void setCourse(Properties course) {
		this.course = course;
	}


	

}
