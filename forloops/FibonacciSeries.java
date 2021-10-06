package forloops;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter No. for fibonacci series");
		int n = sc.nextInt();
		
		if(n==0) System.out.println(0);
		else {
			int a = 0;
			int b = 1;
			System.out.print(a + "  ");
			System.out.print(b + "  ");
			
			
			for(int i = 1; i <n-1; i++) {
				int c = a + b;
				System.out.print(c + "  ");
				a = b;
				b = c;
			}
		
		}
		
	}

}
