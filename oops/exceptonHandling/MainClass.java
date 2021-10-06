package oops.exceptonHandling;

public class MainClass {

	public static void main(String[] args) {
	
	try  
		{
			int a = 2;     // try, catch , finally , throw ,throws
			int b = 0;
			int c = a/b;
			System.out.println(c);
			
		}  	catch(ArithmeticException e) {  
		    	System.out.println(e.getMessage() + " occured, please check your code.");
		    	
		}   catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("index should be in the range of 0 to size of array ");
			
		}   catch(IllegalArgumentException e ) {
			System.out.println("check your casting carefully");
		}   finally {
			System.out.println("Sorry for the inconvenience");
		}
	}
	
	
	
}
