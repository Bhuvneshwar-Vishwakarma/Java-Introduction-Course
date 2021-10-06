package oops.inheritance;

public class Teacher extends Person {
	
	public Teacher(String name) {
		super(name);
		System.out.println("Inside teacher constructor");
	}
	
	public void teach() {
		System.out.println( name + " is teaching");
	}
	public void eat() {
		super.eat();
		System.out.println("person is laughing");
	}
	public static void laughing() {
		System.out.println("person is laughing");
	}

}
