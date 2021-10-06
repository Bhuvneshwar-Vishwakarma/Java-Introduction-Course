package sets;

import java.util.*;

public class MainClass {

	public static void main(String[] args) {
		
		Set<String> fruits = new HashSet<>();
/*
 * 		Set<String> fruits = new LinkedHashSet<>();             **For Ordered Sequence**
 *		Set<String> fruits = new TreeSet<>();                    **For Sorted Form***
 */
		
		fruits.add("apple");
		fruits.add("kiwi");
		fruits.add("banana");
//		System.out.println(fruits.add("mango"));
//		System.out.println(fruits.add("banana"));
		System.out.println(fruits);
	}

}
