package priorityQueues;

import java.util.*;

public class MainClass {

	public static void main(String[] args) {
		
		PriorityQueue<String> pq = new PriorityQueue<>();
		
		pq.add("apple");
		pq.add("mango");
		pq.add("banana");
		pq.add("kiwi");
		
		System.out.println(pq);
		
		System.out.println(pq.remove());
		System.out.println(pq.remove());
		System.out.println(pq.remove());
		System.out.println(pq.remove());
	}

}
