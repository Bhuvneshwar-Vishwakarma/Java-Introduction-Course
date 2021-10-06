package vectorAndStack;

import linkedList.*;

public class MyStack <E> {
	
//	private MyLinkedList<E> ll = new MyLinkedList();
//	
//	void push(E e) {
//		ll.add(e);
//	}
//	
//	E pop() throws Exception {
//		if(ll.isEmpty()) {
//			throw new Exception("Popping from empty stack is not allowd"); 
//		}
//		return ll.removeLast();
//	}
//		
//	E peek() throws Exception {
//		if(ll.isEmpty()) {
//			throw new Exception("Peeking from empty stack is not allowd"); 
//		}
//		return ll.getLast();
//		
//	}
	
	
	private MyLinkedListByMe<E> ll = new MyLinkedListByMe<>();
	
	void push(E e) {
		ll.add(e);
	}
	
	E pop() throws Exception{
		if(ll.isEmpty()) {
			throw new Exception("Popping from empty stack is not allowd");
		}
		return ll.removeLast();
	}
	
	E  peek() throws Exception {
		if(ll.isEmpty()) {
			throw new Exception("peeking from empty stack is not allowd");
		}
		return ll.getLast();
		
	}
	
	boolean search(E e) {
		return ll.search(e);
		
	}
	
	void printStack(){
		ll.print();
		
	}
}
		
			
		
		
		
	
