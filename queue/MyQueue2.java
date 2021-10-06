package queue;

public class MyQueue2<E> {
	
	Node head, rear;
	
	public void enqueue(E e) {
		Node<E> toAdd = new Node(e);
		
		if(head==null) {
			head = rear = toAdd;
			return;
		}
		
		rear.next = toAdd;
		rear = rear.next;
	}
	
	public E dequeue() {
		
		if(head == null) {
			return null;
		}
		Node<E> temp = head;
		head = head.next;
		
		if(head==null) {
			rear=null;
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
