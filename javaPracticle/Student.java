package javaPracticle;

//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
import java.io.*;

public class Student {
	
	String Name;
	String Enroll_No;
	int Sem;
	String Branch;
	
	void get() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter a Name");
		Name = br.readLine();	
		
		System.out.println("Enter a Enrollment number");
		Enroll_No = br.readLine();
		
		System.out.println("Enter Sem");
		Sem = Integer.parseInt(br.readLine());
		
		System.out.println("Enter a Branch");
		Branch = br.readLine();	
		
	}
	void show() {
		System.out.println("Student name is "+ Name);
		System.out.println("Student Enrollment number is "+ Enroll_No);
		System.out.println("Student semester is "+ Sem);
		System.out.println("Student branch is "+ Branch);
	}

	public static void main(String[] args) throws IOException {
		
		Student ram = new Student();
		ram.get();
		ram.show();

	}

}
