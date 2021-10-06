package deque;

import java.util.ArrayDeque;

public class MainClass {

	public static void main(String[] args) {
		
		ArrayDeque<Integer> ad = new ArrayDeque<>();
		
		ad.push(78);
		ad.push(8);
		ad.push(18);
		System.out.println(ad.pop());
		
//		ad.addFirst(12);
//		ad.addFirst(13);
//		
//		ad.pop();
//		System.out.println(ad.peek());
//		
		
	}

}
