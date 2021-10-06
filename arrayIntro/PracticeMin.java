package arrayIntro;

import java.util.Scanner;

public class PracticeMin {

	public static void main(String[] args) {

//			  int rows; 
//			  int columns;
//			  Scanner scanner = new Scanner (System.in);
			   
//			  System.out.println("Enter number of rows: ");
//			  rows = scanner.nextInt(); 
			  
//			  S/ystem.out.println("Enter number of columns: "); 
//			  columns = scanner.nextInt(); 
			  
//			  int[][] matrix = new int [rows][columns];
			  
//			  System.out.println("Enter matrix numbers: "); 
//			  for (int i = 0; i < rows; i++) {
//			   System.out.println("Enter numbers for row - " + (i+1) + " and press enter"); 
//			   for (int j = 0; j < columns; j++) {
//			    matrix[i][j] = scanner.nextInt();
//			   }
//			  }
//			  scanner.close();
//			  // Displaying entered matrix
//			  System.out.println("Matrix as entered");
//			  for (int i = 0; i < matrix .length; i++) {
//			    System.out.println();
//			    for (int j = 0; j < matrix[i].length; j++) {
//			     System.out.print(matrix[i][j] + " ");
//			    }
//			  }
//			  System.out.println();
//			  findMinMax(matrix);
//			 }
//			 
//			 // Method to find max and min
//			 private static void findMinMax(int[][] matrix){
//			  //  start by assigning the first matrix element
//			  // to both the variables
		
		
		
		
		
		int a[][] = { {2,3,4},{23,12,13},{12,34,56} };
		int maxNum = a[0][0];
		int minNum = a[0][0];
		
		
			  for (int i = 0; i < a.length; i++) {
				  	for (int j = 0; j < a[i].length; j++) {
				  		if(maxNum < a[i][j]){
				  			maxNum = a[i][j];
				  		}
				  		else if(minNum > a[i][j]){
				  			minNum = a[i][j];
				  		}
				  	}
			  	}
			  System.out.println("Largest number: "  + maxNum );
			  System.out.println("And Sortest is number: "  + minNum );
			 }
	
}

	


