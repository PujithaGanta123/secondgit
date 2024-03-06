package jpaInheritance;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@DiscriminatorValue(value="Square")
public class Square extends Shapes{
	
	public Square() {
		
	}

	public Square(int id, int areaOfSquare,int a,String colour) {
		
		Id = id;
		this.areaOfSquare = areaOfSquare;
		this.a=a;
		this.colour=colour;
	}

	
	@Id//primary key
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int Id;
	@Column
	private int areaOfSquare;
	private int a;
	private String colour;
	
	public int getId() {
		return Id;
	}
	

	public int getAreaOfSquare() {
		return areaOfSquare;
	}
	public void setAreaOfSquare(int areaOfSquare) {
		this.areaOfSquare = areaOfSquare;
	}
	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	@Override
	public String toString() {
		return "Square [Id=" + Id + ", areaOfSquare=" + areaOfSquare + ", a=" + a + ", colour=" + colour + "]";
	}

	

	
	

}
