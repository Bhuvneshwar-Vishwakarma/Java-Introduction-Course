package arrayIntro;

import java.util.Scanner;

public class AverageMarksOfStudent {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of student : ");
		int n = sc.nextInt();
		
		int marks[] = new int[n];
		
		System.out.println("Enter the Marks");
		
		for(int i = 0; i<n; i++) {
			marks[i] = sc.nextInt();
		}
		int averageMark = 0;
		
		for(int i = 0; i<n; i++) {
			averageMark += marks[i];
		}
		averageMark /= n;
		
	    System.out.println("the average marks is : " + averageMark);
	}
}

