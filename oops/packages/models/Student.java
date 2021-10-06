package oops.packages.models;

public class Student {
	
	private String name;
	
	public Student(String name) {
		this.name = name;
	}
	
	public String getName() {
		getPassWord();
		return name;
	}
	
	String getPassWord() {    //default but only package,private only its class.
		return "PassWord@123";
		
		
	}
//	private String getPassWord() {
//		return "PassWord@123";
//		
//		
//	}

}
