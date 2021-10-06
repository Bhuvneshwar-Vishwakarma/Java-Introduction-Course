package conditionalStatements;

public class NestedIfElse {

	public static void main(String[] args) {
		
		
		int a = 47;
		int b = 50;
		int c = 60; 	
		int	result = 0;
		
//		if (a > b) {
//			if(a > c) {
//				result = a;
//			}else {
//				result = b;
//			}
//		}else {
//			result = c;
//		}
//		
//		System.out.println(result);
		
		result = a > b ? a > c ? a : c : b > c ? b : c;
		
		System.out.println(result);

	}

}
