//2
/****Command Line Arguments means that you have to provide input during execution of program.***
 *They are stored as strings in the String array passed to the args parameter of main() method in Java.
 *
 * */
package javaPracticle;

public class VowelOrConst {

	public static void main(String[] args) {
		
		String var = args[0];
		char ch = var.charAt(0);
		
		if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
			System.out.println(ch +" is a vowel");
		else
			System.out.println(ch +" is a consonent");
			

	}

}
