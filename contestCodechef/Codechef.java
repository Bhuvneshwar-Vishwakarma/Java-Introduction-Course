package contestCodechef;

import java.io.IOException;
import java.util.Scanner;


// Driver Class 
public class Codechef { 
  
    // A utility function to check 
    // whether a password is valid or not 
    public static boolean isValid(String password) 
       
    { 
  
        // for checking if password length 
        // is between 8 and 15 
        if (!((password.length() >= 10))) { 
            return false;
        } 
  
        // to check space 
        if (password.contains(" ")) { 
            return false;
        } 
        if (true) { 
            int count = 0; 
  
            // check digits from 0 to 9 
            for (int i = 0; i <= 9; i++) { 
  
                // to convert int to string 
                String str1 = Integer.toString(i); 
  
                if (password.contains(str1)) { 
                    count = 1; 
                } 
            } 
            if (count == 0) { 
                return false;
            } 
        } 
  
        // for special characters 
        if (!(password.contains("@") || password.contains("#") 
              || password.contains("!") || password.contains("~") 
              || password.contains("$") || password.contains("%") 
              || password.contains("^") || password.contains("&") 
              || password.contains("*") || password.contains("(") 
              || password.contains(")") || password.contains("-") 
              || password.contains("+") || password.contains("/") 
              || password.contains(":") || password.contains(".") 
              || password.contains(", ") || password.contains("<") 
              || password.contains(">") || password.contains("?") 
              || password.contains("|"))) { 
            return false;
        } 
  
        if (true) { 
            int count = 0; 
  
            // checking capital letters 
            for (int i = 65; i <= 90; i++) { 
  
                // type casting 
                char c = (char)i; 
  
                String str1 = Character.toString(c); 
                if (password.contains(str1)) { 
                    count = 1; 
                } 
            } 
            if (count == 0) { 
                return false;
            } 
        } 
  
        if (true) { 
            int count = 0; 
  
            // checking small letters 
            for (int i = 90; i <= 122; i++) { 
  
                // type casting 
                char c = (char)i; 
                String str1 = Character.toString(c); 
  
                if (password.contains(str1)) { 
                    count = 1; 
                } 
            } 
            if (count == 0) { 
                return false;
            } 
        } 
        
        return true;
        
    } 
  
    // Driver code 
    public static void main(String[] args) throws IOException
    { 	
    	try{
			Scanner sc = new Scanner(System.in);
	    	int t = sc.nextInt();
	    	while(t > 0) {
	    		String password1 = sc.next(); 
	    		  
	            if(isValid(password1) == true) {
	            	System.out.println("YES");
	            }else {
	            	System.out.println("NO");
	            }
	            t--;
	    	}
		}catch(Exception e){
			return;
		}
    	
    	
    	
    } 
} 