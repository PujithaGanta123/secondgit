package assignment1;

public class PackageDemo {

	
		protected int a;
		protected int b;
		int sum;
		void sum(int a,int b) {
			sum=a+b;
			System.out.println("sum:"+sum);
		}
		public static void main(String[]arg) {
			PackageDemo obj =new PackageDemo();
			obj.sum(2,3);
		}
	

}
