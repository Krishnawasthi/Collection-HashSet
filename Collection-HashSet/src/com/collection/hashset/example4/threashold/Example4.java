package com.collection.hashset.example4.threashold;

import java.util.HashSet;

 class Employee 
{
	HashSet<String> prod = new HashSet<String>();
  
	 public void employee(){
		 
		 prod.add("krishna");
		 prod.add("awasthi");
		 prod.add("mohan");
		 prod.add("kartik");
		 
		 System.out.println(prod);
		 
		 System.out.println("-------------------------------------------------------------------");
	 }
	
}

class EmployeeSeen extends Employee
{ 
	HashSet<String> prod = new HashSet<String>();
	@Override
	public void employee(){
		 
		 prod.add("rohan");
		 prod.add("dixit");
		 prod.add("mohan");
		 prod.add("kartik");
		 
		 System.out.println(prod);
	 }
	
}

public class Example4 {

	public static void main(String[] args) {

		Employee es = new Employee();
		es.employee();
		

	}

}
