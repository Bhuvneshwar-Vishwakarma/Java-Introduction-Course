package linkedList;

import java.util.*;

public class MainLinkedList {

	public static void main(String[] args) {
		
		MyLinkedListByMe ll = new MyLinkedListByMe();
//		LinkedList<Integer> mll = new LinkedList<>();
//		List<Integer> al = new ArrayList<>();
	
		
		ll.add(12);
		ll.add(2);
		ll.add(1);
		ll.add(13);
//	    ll.set(2,45);
//		ll.search(2);
		if (ll.search(1)) 
            System.out.println("Yes"); 
        else
            System.out.println("No"); 
//		System.out.println(ll.get(1));
//		ll.toArray();
//		getTimeDiff(al);
//		getTimeDiff(ll);
//	}
//	static void getTimeDiff(List<Integer> list) {
//		
//		long start = System.currentTimeMillis();
//		for(int i = 0; i<10000; i++) {
//			list.add(0, i);
//		}
//		
//		long end = System.currentTimeMillis();
//		
//		System.out.println(list.getClass().getName() + "-->" + (end - start));
	}

}
