/**
 *InOrder Traverse :- Left,Node,Right.:--LNR
 *PreOrder Traverse:- Node,Left,Right.:--NLR
 *PostOrder Traverse:-Left,Right,Node.:--LRN
 **/
package trees;

import java.util.*;

public class Traversal {
	
	static Scanner sc = null;
	public static void main(String[] args) {
		
		sc = new Scanner(System.in); 
			
		Node root = createTree(); //2,4,7,-1-1,-1,1,8,-1,-1,3,-1,-1
		
		inOrder(root);
		System.out.println();
		preOrder(root);
		System.out.println();
		postOrder(root);
		System.out.println();
	}
	
	static Node createTree() {
		
		Node root = null;

		System.out.println("Enter data: ");
		int data = sc.nextInt();
		
		if(data == -1) return null;
		
		root = new Node(data);
		
		System.out.println("Enter left for " + data);
		root.left = createTree();
		
		System.out.println("Enter right for " + data);
		root.right = createTree();
		
		return root;
		
	}
	
	static void inOrder(Node root) {
		if(root == null) return;
		
		inOrder(root.left);
		System.out.print(root.data + " ");    //***LNR***
		inOrder(root.right);
		
	}
	static void preOrder(Node root) {
		if(root == null) return;
		
		System.out.print(root.data + " ");   //***NLR***
		preOrder(root.left);
		preOrder(root.right);
		
	}
	static void postOrder(Node root) {
		if(root == null) return;
		
		postOrder(root.left);                 //***LRN***
		postOrder(root.right);
		System.out.print(root.data + " ");
		
	}

}

class Node {
	Node left, right;
	int data;
	
	public Node(int data) {
		this.data = data;
	}
}
		
		