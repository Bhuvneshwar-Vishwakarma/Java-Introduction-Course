package linkedList;

public class MyLinkedList<E> {
	
	Node<E> head;
	
	public void add(E data) {  // Add function
		Node<E> toAdd = new Node<E>(data);     //***LinkedList*  Implementation**//
		
		if(isEmpty()) {
			head = toAdd;
			return;
		}
		
		Node<E> temp = head;
		while(temp.next != null) {
			temp = temp.next;
		}
		temp.next = toAdd;
	}
	
	void print() {  // Print Function
		Node<E> temp = head;
		while(temp != null) {
			System.out.print(temp.data +" ");
			temp = temp.next;
		}
		
	}
	
	public boolean isEmpty() {  // IsEmpty Function
		return head == null;
	}
	
	public E removeLast() throws Exception{
		Node<E> temp = head;
		
		if(temp == null) {
			throw new Exception("Can'nt remove last element from empty LinkedList ");
		}
		
		if(temp.next == null) {
			Node<E> toRemove = head;
			head = null;
			return toRemove.data;
		}
		
		while(temp.next.next != null) {
			temp = temp.next;
		}
		Node<E> toRemove = temp.next;
		temp.next = null;
		return toRemove.data;
	}
	
	public E getLast() throws Exception {
		
        Node<E> temp = head;
		
		if(temp == null) {
			throw new Exception("Can'nt peek last element from empty LinkedList ");
		}
		
		while(temp.next != null) {
			temp = temp.next;
		}
		return temp.data;
		
	}
	
	public static class Node<E> {  // Node Function
		public E data;
		public Node<E> next;
		
		public Node(E data) { // and it's constructor
			this.data = data;
			next = null;
		}
	}
	
}
		
			
