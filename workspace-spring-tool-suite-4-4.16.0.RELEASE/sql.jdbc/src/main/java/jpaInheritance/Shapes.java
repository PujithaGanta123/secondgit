package jpaInheritance;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Entity
@Table(name="Shapes")
@Inheritance(strategy =InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="Type")
public class Shapes {
	public Shapes() {
		
	}


	public Shapes(int id, String colour) {
		Id = id;
		this.colour = colour;
	}


	@Id//primary key
	@GeneratedValue(strategy = GenerationType.IDENTITY)//automated values
	private int Id;
	@Column
	private String colour;

	public int getId() {
		return Id;
	}


	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}


	@Override
	public String toString() {
		return "Shapes [Id=" + Id + ", colour=" + colour + "]";
	}
	
	

}
