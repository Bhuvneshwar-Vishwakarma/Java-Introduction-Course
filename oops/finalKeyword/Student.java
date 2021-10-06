package oops.finalKeyword;

public final class Student {
	
	int rollNo;
	String name;
/*	{
		rollNo = 3;
	}
	
	public Student() {
		name = "Anuj"; 
	} */
	public final void getDescription() {
		System.out.println("the Student name is "+ name);
	}

}
