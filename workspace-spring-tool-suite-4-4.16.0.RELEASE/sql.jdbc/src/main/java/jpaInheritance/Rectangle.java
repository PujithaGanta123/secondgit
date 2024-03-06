package jpaInheritance;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@DiscriminatorValue(value="Rectangle")
public class Rectangle extends Shapes{
	
	public Rectangle() {
		
	}

	public Rectangle(int id,int length,int width, int areaofrectangle,String colour) {
		
		Id = id;		
		this.length=length;
		this.width=width;
		this.areaofrectangle = areaofrectangle;
		this.colour=colour;
	}
	
	@Id//primary key
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int Id;
	@Column
	
	private int length;
	private int width;
	private int areaofrectangle;
	private String colour;
	public int getId() {
		return Id;
	}

	
	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}
	public int getAreaofrectangle() {
		return areaofrectangle;
	}
	public void setAreaofrectangle(int areaofrectangle) {
		this.areaofrectangle = areaofrectangle;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	

	@Override
	public String toString() {
		return "Rectangle [Id=" + Id + ", areaofrectangle=" + areaofrectangle + ", length=" + length + ", width="
				+ width + ", colour=" + colour + "]";
	}


	
	

}
