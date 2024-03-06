package day6;

public class LambdaDemo {

	public static void main(String[] args) {
		Sum s1=(a,b)->a>b?a:b;
		
		System.out.println("Sum:"+s1.Sum(30,50));
		

	}
	interface Sum{
		int Sum (int a ,int b);
	}
	

}
