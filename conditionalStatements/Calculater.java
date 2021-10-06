package conditionalStatements;

import java.util.Scanner;

public class Calculater {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter First Number");
		int a = sc.nextInt();
		
		System.out.println("Enter second Number");
		int b = sc.nextInt();
		
		System.out.println("Enter Operation");
		sc.nextLine();
		char operation = sc.nextLine().charAt(0);
		
		int result = 0;
		
		switch (operation) {
	        case '+':
	        	result = a + b;
	        	break;
	        case '-':
	        	result = a - b;
	        	break;
	        case '*':
	        	result = a * b;
	        	break;
	        case '/':
	        	result = a / b;
	        	break;
	        default:
	        	System.out.println(" Invalid operation");
	       
	        }
		    
		    System.out.println(" The Result is " + result);
            }
	}
	
		
		
