package maps;

import java.util.*;
//import java.util.HashMap;                 *** methods of HashMap***
//import java.util.Map;
//import java.util.Set;
import java.util.Map.Entry;

public class MainClass {

	public static void main(String[] args) {
		
		Map<String, Integer> numbers = new HashMap<>();
		
		numbers.put("one", 1);
		numbers.put("two", 2);
		numbers.put("three",3);
		
//		numbers.remove("two");
		numbers.remove("two", 4);
		
//		numbers.putIfAbsent("one", 10);
//		numbers.put("one", 5);
		
		System.out.println(numbers);
		System.out.println(numbers.get("one"));
		System.out.println(numbers.get("five"));
		System.out.println(numbers.containsKey("one"));
		System.out.println(numbers.containsValue(3));
		
		System.out.println(numbers.keySet());       // for keySet
		System.out.println(numbers.entrySet());      		
		System.out.println(numbers.values());       
		
		Set<Entry<String, Integer>> entries = numbers.entrySet();
		for(Entry<String, Integer> entry: entries) {
			entry.setValue(entry.getValue() * 100);
		}
		System.out.println(numbers);
		 

	}

}
