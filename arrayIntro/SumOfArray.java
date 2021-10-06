package arrayIntro;

import java.util.Scanner;

public class SumOfArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array : ");
		
		int n = sc.nextInt();
		
		int a[] = new int[n];
		
		
		int sumOf = 0;
		
		for(int i = 0; i<n; i++) {
			sumOf +=a[i];
		}
		
	    System.out.println("the sum of array : " + sumOf);
	    {
		
		

	}

	}
}