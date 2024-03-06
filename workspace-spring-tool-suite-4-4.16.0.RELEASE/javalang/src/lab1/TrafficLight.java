package lab1;
import java.util.Scanner;
public class TrafficLight {

public static void main(String[] arg)
{
	Traffic t1=new Traffic(Color.RED);
	 t1.display();
	
}
}

enum Color
{
	RED, GREEN, YELLOW
	}
class Traffic

{
	Color c;
	Traffic(Color c)
	{
		this.c=c;
	}
  public void display() {
	  switch(c)
		{
		case RED:
		         System.out.println("stop");
		         break;
		case GREEN:
		         System.out.println("go");
		         break;
		case YELLOW:
			     System.out.println("slow");
			     break;
		default :
			     System.out.println(" ");
		
	}
		
}
}


