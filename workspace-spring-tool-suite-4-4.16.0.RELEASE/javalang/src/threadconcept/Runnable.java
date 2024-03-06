package threadconcept;

import java.util.Scanner;

public class Runnable {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int n=sc.nextInt();
		OddMultiple o=new OddMultiple(n);
		Thread t1=new Thread(o);
		EvenMultiple e=new EvenMultiple(n);
		Thread t2=new Thread(e);
		t1.setPriority(10);
		t2.setPriority(1);
		t1.start();
		t2.start();

	}

}
class OddMultiple implements Runnable
{
	int n;
	public OddMultiple(int n) {
		this.n=n;
	}

	public void run() {
		for (int i=1;i<=9;i++) {
			System.out.println(n+"X"+n*i);
		}
	}
}
class EvenMultiple implements Runnable{
	int n;
	public EvenMultiple(int n) {
		this.n=n;
	}
	public void run() {
		for (int i=1;i<=9;i++) {
			System.out.println(n+"X"+n*i);
		}
	}
}