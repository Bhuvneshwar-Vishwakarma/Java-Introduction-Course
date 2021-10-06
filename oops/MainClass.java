package oops;

class cat{
//	States
	boolean hasFur;
	String color, breed;
	int legs,eyes;
	
//	behaviar
	public void walk() {
		System.out.println("Cat is walking");
	}
	public void eat() {
		System.out.println("Cat is eating");
	}
	public void description() {
		System.out.println("my cat has " + legs + "legs and " + eyes + "eyes");
	}
}

class dog{
	String breed, name;
	
	public void jump() {
		System.out.println("my dog " + name + " jumped");
	}
	public void description() {
		System.out.println("my dog name is " + name + " and breed is " + breed);
	}
}

public class MainClass {

	public static void main(String[] args) {
//		one file contains only one public class
		
//		Class ClassName = new Class();
		cat cat1 = new cat();		
		cat cat2 = new cat();
		cat1.walk();
		cat2.eat();
		
		cat1.legs = 4;
		cat1.eyes = 2;
		
		cat2.legs = 3;
		cat2.eyes = 2;
		
		cat1.description();
		cat2.description();
		
		dog husky = new dog();
		dog toomy = new dog();
		
		husky.breed = "Husky";
		husky.name = "Browny";
		
		toomy.breed = "Poodle";
		toomy.name = "Toomy";
		
		husky.description();
		toomy.description();
		
	}

}
