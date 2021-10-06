package forloops;

import java.util.Scanner;

public class PrimeOrNot {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		boolean isPrime = true;
		
		for(int i = 2; i < n; i++) {
			if(n % 2 == 0) {
				isPrime = false;
				break;
			}
		}
		if(n < 2) {
			isPrime = false;
			System.out.println("is prime" + isPrime);
		}
	}
}

