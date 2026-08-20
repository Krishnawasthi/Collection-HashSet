package com.collection.treeSetet.example12;


import java.util.Set;
import java.util.TreeSet;
class Employee implements Comparable{
	
	String name ;

	public Employee(String name) {
		super();
		this.name = name;
	}
	
	

	@Override
	public int compareTo(Object o) {
		Employee emp = (Employee) o;
		return this.name.compareTo(emp.name);
		
	}



	@Override
	public String toString() {
		return name;
	}
	
}

public class TreeSetExample {

	public static void main(String[] args) {
   Set<Employee > set = new TreeSet<Employee>();
		
     Employee e1 = new Employee("krishna");
     Employee e2 = new Employee("mohan");
     Employee e3 = new Employee("rana");
     Employee e4 = new Employee("keshav");
     Employee e5 = new Employee("abhijit");
     
		
		set.add(e1);
		set.add(e2);
		set.add(e3);
		set.add(e4);
		set.add(e5);
		
		
		System.out.println(set);

	}

}
