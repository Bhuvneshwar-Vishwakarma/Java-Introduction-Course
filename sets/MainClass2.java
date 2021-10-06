package sets;

import java.util.*;

public class MainClass2 {

	public static void main(String[] args) {
		
		Set<Integer> x = new HashSet<>();
		x.add(45);
		x.add(5);
		x.add(4);
		
		Set<Integer> y = new HashSet<>();
//		y.add(78);
//		y.add(7);
		y.add(5);
		
		System.out.println(x.containsAll(y));
		
//		x.addAll(y);         //for Union of set
//		x.retainAll(y);      // for common of set "Intersect"
		System.out.println(x);
	}

}
