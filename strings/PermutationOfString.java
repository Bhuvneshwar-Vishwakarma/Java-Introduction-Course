package strings;

//import java.util.*;
//import java.io.*;
public class PermutationOfString {
	
	public static void solution(String st) {
		int n = st.length();
		int f = factorial(n);
		
		for(int i = 0; i<f; i++) {
			StringBuilder sb = new StringBuilder(st);
			int temp = i;
			for(int div = n; div>=1; div--) {
				int q = temp/div;
				int r = temp%div;
				
				System.out.print(sb.charAt(r));
				sb.deleteCharAt(r);
				
				temp = q;
			}
			System.out.println();
			
			
		}
	}
	
	public static int factorial(int n) {
		int val = 1;
		for(int i = 2; i<=n; i++) {
			val *= i;
		}
		return val;
		
	}
	
	public static int compare(String st1, String st2) {
		return 0;
		
	}

	public static void main(String[] args) {
		String st1 = "123";
		solution(st1);
		String st2 = "456";
		solution(st2);
	}

}
