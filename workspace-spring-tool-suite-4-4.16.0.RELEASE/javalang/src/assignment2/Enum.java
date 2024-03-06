package assignment2;

public class Enum {
	
	
	public static void main(String[] arg) {
	EnumTest e1=new EnumTest(Month.APR);
	   e1.display();
	}
}

enum Month
	 {
		JAN,FEB,MAR,APR,MAY
		
	}
class EnumTest 
{
	Month m;
    EnumTest(Month m) 
	
   {
	  this.m=m;
   }
    public void display()
{
	switch(m)
	{
	case JAN:
		System.out.println("january");
		break;
	case FEB:
		System.out.println("feb");
		break;
	case MAR:
		System.out.println("march");
		break;
	case APR:
		System.out.println("exams");
		break;
	case MAY:
		System.out.println("holidays");
		break;
	default:
		System.out.println("enter the currect month");
		
	}
	
	
}
}

