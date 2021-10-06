package method;

public class PassByValue {

	public static void main(String[] args) {
		
//		JAVA is always is pass by value
//		int c = 89;
//		int d = 59;
//		
//		swap(c, d);
//		System.out.println(c + " "+ d);
		
//		Dog c = new Dog();
//		c.legs = 4;
//		Dog d = new Dog();
//		d.legs = 3;
//		
//		swap(c, d);
//		System.out.println(c.legs +"  "+ d.legs);
		Dog a = new Dog();
		a.legs = 4;
		changeDog(a);
		System.out.println(a.legs);

	}
//		By Primitive data type
        static void swap(int a, int b) {
		int temp = a;
		a = b;
		b = temp;
	}
//        By non primitive data type
        static void swap(Dog a, Dog b) {
        	Dog temp = a;
        	a = b;
        	b = temp;
        }
        
        static void changeDog(Dog dog) {
        	dog.legs = 2;
        }
}

class Dog{
	int legs;
}
