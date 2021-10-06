package oops.abstraction;

public class WagonR extends Car {
	
	public void accelerate() {
		System.out.println("WagnoR is accelerating");           //Abstraction for reduce Complexity
	}                                                           //Incapsulation for Security reason

	@Override
	public void breaking() {
		System.out.println("WagnoR is breaking");
	}
	
	public void honk() {
		System.out.println("WagonR is honking");
	}
	
	
}
