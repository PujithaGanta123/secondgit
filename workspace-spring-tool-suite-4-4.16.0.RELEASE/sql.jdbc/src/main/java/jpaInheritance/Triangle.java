package jpaInheritance;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@DiscriminatorValue(value="Triangle")
public class Triangle extends Shapes{
	public Triangle() {
		
	}

	public Triangle(int id,int height,int base, int areaOfTriangle,String colour) {
		
		Id = id;
		this.height=height;
		this.base=base;
		this.areaOfTriangle = areaOfTriangle;
		this.colour=colour;
				
	}
	@Id//primary key
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int Id;
	@Column
	
	private int height;
	private int base;
	private int areaOfTriangle;
	private String colour;
	public int getId() {
		return Id;
	}

	
	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getBase() {
		return base;
	}

	public void setBase(int base) {
		this.base = base;
	}
	public int getAreaOfTriangle() {
		return areaOfTriangle;
	}
	public void setAreaOfTriangle(int areaOfTriangle) {
		this.areaOfTriangle = areaOfTriangle;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	@Override
	public String toString() {
		return "Triangle [Id=" + Id + ", areaOfTriangle=" + areaOfTriangle + ", height=" + height + ", base=" + base
				+ ", colour=" + colour + "]";
	}

	

	
}

