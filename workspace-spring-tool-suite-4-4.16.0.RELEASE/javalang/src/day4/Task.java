package day4;

public class Task {
	 
	public static void main(String[] args) {
				
		Num n=new Num(10,20);
		
		Num n1=new Num(30,40);
		
		n.swap(n);
		//assigning one obj to another
		n1=n;
		n1.swap(n1);
		System.out.println("Inside Main"+"a:"+n.a+"b:"+n.b);
		//20 10
		System.out.println("Inside Main"+"a:"+n1.a+"b:"+n1.b);
		//40 30
		//10 20
	}
	
	
	

}
class Num
{
	int a,b;
	
	Num(int a,int b)
	{
		this.a=a;
		this.b=b;
	}
	
	void swap(Num n)
	{
		
		
		int t;
		t=n.a;
		n.a=n.b;
		n.b=t;
		System.out.println("Inside function"+"a:"+n.a+"b:"+n.b);
	}//20 10
	//30 40
	//20 10
	
}
}
