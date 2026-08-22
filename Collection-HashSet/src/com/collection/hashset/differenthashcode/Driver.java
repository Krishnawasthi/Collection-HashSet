package com.collection.hashset.differenthashcode;

import java.util.HashSet;

public class Driver {

	public static void main(String[] args) {
		HashSet<Employee> set = new HashSet<Employee>();
		
		Employee e1 = new Employee("Mohan", 101);
		Employee e2 = new Employee("Mohan", 101);
		Employee e3 = new Employee("Mohan", 101);
		
		set.add(e1);
		set.add(e2);
		set.add(e3);
		
		System.out.println(set);

	}

}
