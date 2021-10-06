/**
 * Every Number classes such as Integer, Float, Double and so on have parseXXX methods that convert String into the respective object of their type.
 * int x = Integer.parseInt(args[0]);
 * int y = Integer.parseInt(args[1]);
 * 
 */		
package javaPracticle;

public class SumByCom {

	public static void main(String[] args) {
		
		 String a = args[0];
		 int x = a.charAt(0);
         String b = args[1];
         int y = b.charAt(1);

         int s=x+y;
         System.out.println("sum of " + x + " and " + y +" is " +s);
	}

}
