package strings;

public class StringIntro2 {

	public static void main(String[] args) {
		
//		String name = "Bhuvneshwar";
//		name = name + " Vishwakarma";
//		System.out.println(name); Bhuvneshwar Vishwakarma
//		System.out.println(name.replace('B', 'V')); vhuvneshwar Vishwakarma
		
//		String name2 = new String("Bhuvneshwar");
//		System.out.println(name == name2); false
//		System.out.println(name.equals(name2)); true
//		System.out.println(name2.isEmpty()); false
		
//		String name = "Bhuvneshwar";
//		name = name + " Kumar";
//		System.out.println(name.concat(" vishwakarma"));
		
		String cars = "Audi, Maruti, Swift, Farrari,Lamborghini";
		String allCars[] = cars.split(",");
		
//		for(String car: allCars) {
//			System.out.println(car);
//		}
//		
//		System.out.println(cars.indexOf('S'));  14
		
//		System.out.println(cars.toLowerCase()); for lowercase letter
//		System.out.println(cars.toUpperCase()); for uppercase letter
		
		String name = "    Bhanu    ";
		System.out.println(name.trim());
		
		
	}

}
