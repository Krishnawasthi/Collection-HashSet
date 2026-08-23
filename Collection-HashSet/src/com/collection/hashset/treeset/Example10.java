package com.collection.hashset.treeset;

import java.util.HashSet;

class EmployeeDatabse
{
	String empName;
	double salary;
	
	
	public EmployeeDatabse(String empName, double salary) {
		super();
		this.empName = empName;
		this.salary = salary;
	}
	
	public int hashCode() 
	{
		
		return 1002;
		
	}
	
	public boolean equals(Object obj)
	{
		EmployeeDatabse empData = (EmployeeDatabse) obj;
		return this.empName.equals(empData.empName) && this.salary == salary;
	}
	
}



public class Example10 {

	public static void main(String[] args) {
		
	
		HashSet<EmployeeDatabse> database = new HashSet<EmployeeDatabse>();
		
		EmployeeDatabse employee1 = new EmployeeDatabse("ranveer singh", 23203.00);
		EmployeeDatabse employee2 = new EmployeeDatabse("ranveer singh", 23203.00);
		EmployeeDatabse employee3 = new EmployeeDatabse("ranveer singh", 23203.00);
		EmployeeDatabse employee4 = new EmployeeDatabse("ranveer singh", 23203.00);
		EmployeeDatabse employee5 = new EmployeeDatabse("ranveer singh", 23203.00);
		EmployeeDatabse employee6 = new EmployeeDatabse("ranveer singh", 23203.00);
		EmployeeDatabse employee7 = new EmployeeDatabse("ranveer singh", 23203.00);
		EmployeeDatabse employee8 = new EmployeeDatabse("ranveer singh", 23203.00);
		EmployeeDatabse employee9 = new EmployeeDatabse("ranveer singh", 23203.00);
		EmployeeDatabse employee10 = new EmployeeDatabse("ranveer singh", 23203.00);
		
		database.add(employee1);
		database.add(employee2);
		database.add(employee3);
		database.add(employee4);
		database.add(employee5);
		database.add(employee6);
		database.add(employee7);
		database.add(employee8);
		database.add(employee9);
		database.add(employee10);
		
		System.out.println(database);
		
	}

}
