package day6;

public class InterImplDemo implements Atm {

	public static void main(String[] args) {

		InterImplDemo a=new InterImplDemo();
		 Atm.open();
		a.amount();
		a.password();
		Atm.close();
		
 
	}
 
	public void amount() {
		System.out.println("enter the amount");
		
	}
 
	public void password() {
		System.out.println("enter your password");
		
	}
 
}
//default and static methods
interface Atm
{
void amount();
void password();
static void open()
{
	System.out.println("open ");
}
static void close()
{
	System.out.println("close");
}


	}


