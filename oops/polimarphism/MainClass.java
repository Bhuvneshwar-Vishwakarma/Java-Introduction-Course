package oops.polimarphism;
                                                     
public class MainClass {                        // ***Variable can't override only Function(Method)*** 

	public static void main(String[] args) {
		
       		
	/*	Dog d = new Dog();
		                                **** RUN TIME POLIMARPHISM or  DYNAMIC BINDING or LATE BINDING or OVERRIDING ****           
		Pet p = d; 
		System.out.println(d.name);
		System.out.println(p.name); **VARIABLE CAN'T**
		Animal a = d;
		                   ****SLOWER EXICUTION****
		d.walk();            Same method with same parameters
		p.walk();  */
	
		greeting();
		greeting("Good Morning");
		greeting("Good Morning", 5);
	}
	public static void greeting() {
		System.out.println("Hi, there");     /* COMPILE TIME POLIMARPHISM or its METHODE OVERRIDING 
		                                        STATIC BINDING or OVERRIDING*/
	}
	public static void greeting(String s) {   // ***Same method and different parameter*** 
		System.out.println(s);                //**** FAST EXICUTION******
	}
	public static void greeting(String s, int count) {
		for(int i = 0; i < count; i++) {
			System.out.println("s");
		}
	}

}
