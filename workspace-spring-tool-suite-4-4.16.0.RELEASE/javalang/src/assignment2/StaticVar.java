package assignment2;

public class StaticVar {
		static int a=10;
		int b=30;
		void display() {
			System.out.println(a);
			System.out.println(b);
		}
		static void displaystatic() {
			System.out.println(a);
		}
		public static void main(String[]arg) {
			StaticVar obj2=new StaticVar();
			obj2.display();
			displaystatic();
		}

	}


