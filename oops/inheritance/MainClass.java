package oops.inheritance;

public class MainClass {

	public static void main(String[] args) {
		
	Teacher t1 = new Teacher("Mr.harry");
	Singer s1 = new Singer("Ram");
		
		Person p = t1;  //Upcasting
		
		Teacher t = (Teacher)p;  // Downcasing explicitely
		
		t1.eat();
		
		
		t.name = "Mr.Harry";
		t.eat();
		t.walk();
		t.teach();		
/*		Singer s = new Singer();
		s.name = "Bhuvi";
		s.sing();
		s.eat(); */		
		boolean y = t1 instanceof Teacher;
		
		System.out.println(t1 instanceof  Teacher);
		System.out.println(s1 instanceof  Singer);
		System.out.println(t1 instanceof  Person);
		System.out.println(t instanceof  Person);
		
		System.out.println(p instanceof  Singer);
		}

}