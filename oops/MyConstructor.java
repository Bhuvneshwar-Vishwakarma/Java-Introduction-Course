package oops;

class Vehicle {
	
	int wheels;
	int headlights;
	String color;
 	
	Vehicle( int noOfWheels) {
		wheels = noOfWheels;
		headlights = 2;
	}
	
//  Constructor Overloading
	Vehicle(int noOfWheels, String color){
		wheels = noOfWheels;
		this.color = color;
		headlights = 2;
		
	}
	
//	Vehicle( int Wheels) {
//		this.wheels = Wheels;  ***/ Same as upper line 8 to 11 of code /***
//		headlights = 2;
//	}
//	Vehicle() {
//		wheels = 0;   **Default Construction**
//	}
	
	
}

public class MyConstructor {
	
	MyConstructor() {
		System.out.println("Object is now created");
	}

	public static void main(String[] args) {
		
//		MyConstructor obj = new MyConstructor();
		Vehicle car = new Vehicle(4); 
		Vehicle scooty = new Vehicle(2); 
		
		Vehicle eRikshaw = new Vehicle(3,"Yellow"); 

		
		System.out.println(car.wheels + " wheels");
		System.out.println(scooty.wheels + " wheels");
		System.out.println(eRikshaw.wheels + " wheels and color "+ eRikshaw.color);
		
		
		}

}
