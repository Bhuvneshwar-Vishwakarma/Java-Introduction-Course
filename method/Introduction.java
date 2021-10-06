package method;

public class Introduction {

	public static void main(String[] args) {
		
		int first = 89;
		int second = 79;
		
		int result = maxOf(first, second);
		System.out.println(result);
		
/*	    Method overloading-->*****
		when a class has two or more method by the same name but different parameters, it is known as Method Overloading */
		
		maxOf(8);
		
		
		sayHi();
	}
	
	static int maxOf(int a, int b) {
//		return a>b? a: b;
		if(a>b) {
			return a;
		}else {
			return b;
		}
	}
	
	static int maxOf(int a, int b, int c) {
		return 0;
		
	}
	static int maxOf(float a) {
		System.out.println(a);
		return 0;
		
		
	}
	
	static void sayHi() {
		System.out.println("Hi");
		System.out.println("Good morning");
	}
	

}
