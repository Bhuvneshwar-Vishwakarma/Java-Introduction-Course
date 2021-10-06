package oops.exceptonHandling;

public class ThrowAndThrows {

	public static void main(String[] args) {
		
		fun1();
		
	}
	static void fun1() {
		int a = 5;
		int b = 2;
		int c = a/b;
		System.out.println(c);
		
	/*  try {
			fun2();
		} catch(Exception e) {
			System.out.println(e.getMessage() + "occured");
		}  */
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("after delay");
	}
	static void fun2() throws ArrayIndexOutOfBoundsException{
		
	
	boolean isDanger = true; 
	if(isDanger) {
		throw new ArrayIndexOutOfBoundsException("danger is comming ");
	}
	}
}
