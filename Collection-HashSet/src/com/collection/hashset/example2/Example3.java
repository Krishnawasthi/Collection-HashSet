package com.collection.hashset.example2;

import java.util.HashSet;

public class Example3 {

	public static void main(String[] args) {
		
		HashSet<String> cities = new HashSet<>();
		
		cities.add("bengaluru");
		cities.add("hyderabad");
		cities.add("delhi");
		cities.add("kanpur");
		cities.add("lucknow");
		
		System.out.println("lucknow".hashCode());
		

	}

}
