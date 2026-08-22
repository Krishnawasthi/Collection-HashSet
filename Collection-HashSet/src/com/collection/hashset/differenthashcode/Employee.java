package com.collection.hashset.differenthashcode;

public class Employee {

	private String name;
	private int id;

	public Employee(String name , int id) 
	{
		this.name = name;
		this.id = id;
			
	}
	
	public int hashCode() 
	{
		
	 return this.name.hashCode() + Integer.hashCode(this.id);	
		
	}
	
	public boolean equals(Object obj) {
		
		
		Employee emp = (Employee) obj;
		return this.name.equals(emp.name) && this.id == emp.id;
	}
}
