package userInput;

//import java.io.BufferedReader;
//import java.io.InputStreamReader;
import java.io.*;

public class BufferReaderIn {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter first number");
		int a = Integer.parseInt(br.readLine());
//		int a = Integer.parseInt(br.readLine());
		System.out.println("Enter a String");
		String str = br.readLine();	
		
		System.out.println("You have entered "+ a +" and "+ str);
	
	}

}
