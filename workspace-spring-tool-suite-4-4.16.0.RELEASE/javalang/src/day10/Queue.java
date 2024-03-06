package day10;

import java.util.LinkedList;
import java.util.PriorityQueue;


public class Queue {

	public static void main(String[] args) {
		PriorityQueue q1=new PriorityQueue();
		q1.offer(5);
		System.out.println(q1);
		q1.offer(7);
		System.out.println(q1);
		q1.offer(1);
		System.out.println(q1);
		q1.offer(3);
		System.out.println(q1);
		q1.offer(1);
		System.out.println(q1);
		q1.offer(3);
		System.out.println(q1);
		
		
		
		LinkedList q2=new LinkedList();
		q2.offer(12);
		q2.offer(13);
		q2.add("CHENNAI");
		q2.add("ONGOLE");
		System.out.println(q2);
		q2.offer("");
		System.out.println(q2.poll());

	}

}
