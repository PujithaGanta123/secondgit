package assignment1;

public class Jumpdemo {
public static void main(String []arg) {
	int i=0;
	a:
		while(i<10) {
			b:
				for(int j=1;j<=10;j++) {
					i++;
					if(i==8)
						break a;
					if(j==5)
						continue b;
					System.out.println(i);
					System.out.println(j);
				}
			System.out.println();
		}
}
}
