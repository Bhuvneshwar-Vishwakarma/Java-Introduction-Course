
//*********************operation on linkedList***************///
/*Traversal: To traverse all the nodes one after another.
 * Insertion: To add a node at the given position.
 * Searching: To search an element(s) by value.
 * Updating: To update a node.
 * Sorting: To arrange nodes in a linked list in a specific order.
 * Merging: To merge two linked lists into one.
 */

package linkedList;

public class MyLinkedListByMe<E> {
	
	Node<E> head;
	
	public void add(E data) {
		Node<E> toAdd = new Node<E>(data);
		
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
	public void print() {  //print function
		Node<E> temp = head;
		while(temp != null) {
			System.out.println(temp.data +" ");
			temp = temp.next;
		}
	}
	
//	 Checks whether the value x is present in linked list 
    public boolean search(E x) 
    { 
        Node<E> temp = head;    //Initialize temp 
        while (temp != null) 
        { 
            if (temp.data == x) 
//            	System.out.println(temp.data +" is available in linkedList "); //data found
                return true;
            temp = temp.next; 
        } 
        return false;    //data not found 
    } 
    
    public E removeLast() throws Exception { // Use for pop operation in stack
    	Node<E> temp = head;
    	
    	if(temp == null) { //means linkedList is empty
    		throw new Exception("Can't remove last element from empty LinkedList");
    	}
    	
    	if(temp.next == null) {  //means only one node
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
    
    public E getLast() throws Exception{
    	Node<E> temp = head;
    	
    	if(temp == null) { //means linkedList is empty
    		throw new Exception("Can't peek last element from empty LinkedList");
    	}
    		
		while(temp.next != null) {
			temp = temp.next;
		}
		return temp.data;
    }
   
	public boolean isEmpty() {
		return head == null;
	}
	
	public static class Node<E>{
		public E data;
		public Node<E> next;
		
		public Node(E data) {
			this.data = data;
			next = null;
		}
	}
	

}
