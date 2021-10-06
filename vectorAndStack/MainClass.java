package vectorAndStack;

//import java.util.*;
//import java.util.Stack;

public class MainClass {

	public static void main(String[] args) throws Exception {
		
		MyStack<Integer> stack = new MyStack<>();
		                             
		stack.push(5);                   //**By my Stack Implementation**
		stack.push(2);
		stack.push(1);
		stack.push(8);
		
		System.out.println(stack.pop());
		System.out.println(stack.search(2));
		System.out.println(stack.peek());
		stack.printStack(); // print for stack
		
//		int popped = stack.pop();		
//		System.out.println(popped);
//		
//		int peeked = stack.peek();
//		System.out.println(peeked);
	}

}
