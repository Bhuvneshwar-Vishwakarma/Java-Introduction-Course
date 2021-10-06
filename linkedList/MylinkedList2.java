package linkedList;

class MylinkedList2 {
	
	Node head;
	
	public void add(int data) {
		Node toAdd = new Node(data);
		if(isEmpty()) {
			head = toAdd;
			return;
		}
		Node temp = head;
		while(temp.next != null) {
			temp = temp.next;
		}
		temp.next = toAdd;
	}
	public void print() {
		Node temp = head;
		while(temp != null) {
			System.out.println(temp.data + " ");
			temp = temp.next;
		}
		
	}
	
	public boolean isEmpty() {
		return head == null;
	}
	
	public static class Node{
		public int data;
		public Node next;
		
		public Node(int data) {
			this.data = data;
			next = null;
		}
	}
}
			
	
