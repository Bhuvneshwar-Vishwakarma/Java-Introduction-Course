package userInput;
import java.util.Scanner;

public class ScannerUserInput {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int principal = sc.nextInt();
		float rate = sc.nextFloat();
		int time = sc.nextInt();
		
		float simpalInterest = principal*rate*time/100;
		
		System.out.println( "The simple interest is "  +  simpalInterest);
		

	}

}
