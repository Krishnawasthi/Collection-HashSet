package com.collection.hashset.example6.samehashcode;

import java.util.HashSet;

class AutoMobile {

	String carName;
	int   securityNumber;

	AutoMobile(String carName, int securityNumber) {

		this.carName = carName;
	    this.securityNumber = securityNumber;;
	}
	
	@Override    
	public int hashCode() {
		//this method will return the same HashCode for each same field
		return this.carName.hashCode() + this.securityNumber;
	}
	
	@Override
	public boolean equals(Object obj) {
		AutoMobile car = (AutoMobile) obj;
		return this.carName.equals(car.carName) & this.securityNumber == car.securityNumber;
				
				
		
	}
	
    public  void carDetails(){
    	
	   System.out.println("name of the car : "+ carName + " with car Security Number: " + securityNumber );
	   
    }
	
}

public class Example6 {

	public static void main(String[] args) {
  
		HashSet<AutoMobile> set = new HashSet<AutoMobile>();
		
		AutoMobile car1 = new AutoMobile("Audi", 453943);
		AutoMobile car2 = new AutoMobile("Audi", 453943);
		
		
		System.out.println(car1.equals(car2));
		System.out.println("car1 Hashcode: " +  car1.hashCode());
		System.out.println("car2 Hashcode: " +  car2.hashCode());
		
		set.add(car1);
		set.add(car2);
		
		System.out.println(set);
		
		//redblack tree
		
	}

}
