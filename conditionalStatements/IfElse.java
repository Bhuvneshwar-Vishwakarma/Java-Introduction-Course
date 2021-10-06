package conditionalStatements;

public class IfElse {

	public static void main(String[] args) {
		
		
		int a = 4;
		int b = 5; 
		int	result = 0;
		
//		if (a > b) {
//			result = a;
//		}
//		else {
//			result = b;
//		}
//		System.out.println(result);
		
		result = a > b ? a : b;
		System.out.println(result);

	}

}
