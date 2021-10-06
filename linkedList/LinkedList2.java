package linkedList;

class LinkedList2 {

	public static void main(String[] args) {
		
		MyLinkedList<String> myLL = new MyLinkedList();
		
//		myLL.add(12);
//		myLL.add(52);
		for(int i = 0; i<10; i++) {
			myLL.add(i+"added");
		}
		myLL.print();
	}

}
