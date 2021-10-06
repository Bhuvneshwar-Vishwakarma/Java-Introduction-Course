package lists;

import java.util.ArrayList;
//import java.util.LinkedList;

public class MyArrayList {

	public static void main(String[] args) {
		
		ArrayList<String> fruits = new ArrayList<>();
		ArrayList<String> veg = new ArrayList<>();
		
		fruits.add("Apple");
		fruits.add("orange");
		fruits.add("hii");
		System.out.println(fruits.size());
		System.out.println(fruits.contains("Guava"));
		System.out.println(fruits.isEmpty());
		
		String temp[] = new String[fruits.size()];
		fruits.toArray(temp);
		for(String e: temp) {
			System.out.println(e);
		}
		
		ArrayList<String> toRemove = new ArrayList<>();
		toRemove.add("Apple");
		toRemove.add("hii");
		fruits.removeAll(toRemove);
		
//		fruits.clear();
//		fruits.remove(2);
//		fruits.set(1, "Banana");
//		System.out.println(fruits);  
		
		veg.add("potato");
		veg.add("tomato");
		veg.add("onian");
		
		fruits.addAll(veg);
		System.out.println(fruits);  
		System.out.println(fruits.get(1));  
		
		
		
		Pair<String, Integer> p1 = new Pair("Bhanu", 18);
		Pair<Boolean, String> p2 = new Pair(true, "Bhanu");
		
		p1.getDescription();
		p2.getDescription();
		
		
	}

}
