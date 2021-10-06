package strings;

import java.util.*;
import java.io.*;

public class ReversString {

	public static void main(String[] args) {
		String str1 = "Bhuvneshwar";
		String str2 = "Vishwakarma";
		System.out.println(str1 +" <-Revers-> "+ ReversString(str1));
		System.out.println(str2 +" <-Revers-> "+ ReversString(str2));
	}
	
	public static String ReversString(String str) {
		char[] reversString = new char[str.length()];
		
		Stack<Character> stack = new Stack<Character>();
		
		for(int i = 0; i<str.length(); i++) {
			stack.push(str.charAt(i));
		}
		
		int i = 0;
		while(!stack.isEmpty()) {
			reversString[i++] = stack.pop();
		}
		return new String(reversString);
	}

}
/**
 * Time Complexity: O(n), where n is a number of characters in the stack.
 *	Auxiliary Space: O(n) for the stack. 
 */
