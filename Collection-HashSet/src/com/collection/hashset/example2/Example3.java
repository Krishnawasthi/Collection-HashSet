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
		cities.add("Lucknow");
		
		int hash = "lucknow".hashCode();
		
		System.out.println(hash);
		
		
	     int spreadhash = hash^(hash >>> 16);
	     int index = spreadhash & (16-1);
	     System.out.println("index of lucknow " + index);
		

	}

	

}
