package javaPracticle;

//import java.util.Arrays;
//import java.util.LinkedList;
import java.util.*;
public class Student12
{
	public static void main(String[] args)
	{
		Student1 st1= new Student1();
		//st1.get();
		st1.show();
	}
}
class Student1
{
	String name;
	String enroll_no;
	int sem;
	String branch;

	void get()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Student name:- ");
		name = sc.nextLine();
		System.out.println("Enter Student Enroll_no:- ");
		enroll_no = sc.nextLine();
		System.out.println("Enter Student semester:- ");
		sem = Integer.parseInt(sc.nextLine());
		System.out.println("Enter Student branch:- ");
		branch = sc.nextLine();
	}
	void show()
	{
		System.out.println("Student name is "+name);
		System.out.println("Student enrollment number is "+enroll_no);
		System.out.println("Student semester is "+sem);
		System.out.println("Student branch is "+branch);
	}
}

