package com.collection.hashset.equals;

import java.util.HashSet;

class Employee
{
	int id ;
	Employee(int id){
		
		this.id = id;
	}
	
	@Override
	public boolean equals(Object obj) {
		
		Employee e = (Employee) obj;
		
		return this.id == e.id;
		
		
	}
	
}

public class Driver {

	public static void main(String[] args) {
	
		Employee e1 = new Employee(101);
		Employee e2 = new Employee(101);
		
	   HashSet<Employee> set = new HashSet<>();
	   
	   set.add(e1);
	   set.add(e2);
	   
	   System.out.println(set.size());
	   
	   
	}
	   
	   
	   
	}