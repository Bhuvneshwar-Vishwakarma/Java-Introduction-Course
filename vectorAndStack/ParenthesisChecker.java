package vectorAndStack;

import java.util.Scanner;
import java.util.Stack;

public class ParenthesisChecker {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			String str = sc.nextLine();
			
			new Parenthesis();
			if(Parenthesis.ispar(str) == true) {
				System.out.println("Balanced");
			}else {
				System.out.println("Not Balanced");
			}
		}
	}
}
			




class Parenthesis
{
    static boolean cmp(char b, char c)
    {
        // compare to check if same pair of brackets exists
        if(b=='{' && c=='}')
            return true;
        else if(b=='[' && c==']')
            return true;
        else if(b=='(' && c==')')
            return true;
        return false;
    }
    
    // Function to check if string is having pair of brackets
    static boolean ispar(String x)
    {
        Stack<Character> s = new Stack<>();
        
        // iterating over the characters
        for(int i=0; i<x.length(); i++)
        {
            if(x.charAt(i)=='[' || x.charAt(i)=='{' || x.charAt(i)=='(') // push for all open brackets
                s.push(x.charAt(i));
            else if(x.charAt(i)==']' || x.charAt(i)=='}' || x.charAt(i)==')') // test for all closed brackets
            {
                if(s.isEmpty() == true || !cmp(s.peek(),x.charAt(i))) // if cmp returns false, brackets are not balanced
                    return false;
                else
                    s.pop();
            }
        }
        if(s.isEmpty() == true)
            return true;
        else
            return false;
    }
}

