package com.collection.hashset.example6.linkedlist.toredblacktree;

import java.util.HashSet;

class ArmyPerson{
	
	String name;
	int   id;
	
	
	public ArmyPerson(String name, int id) {
		super();
		this.name = name;
		this.id = id;
	}
	
	@Override
	public int hashCode() {
		
		return 246636327;
	}
	
	
	
}

public class example7 {

	public static void main(String[] args) {
		
	HashSet<ArmyPerson> set = new HashSet<ArmyPerson>(64);
	
	 ArmyPerson cad1 = new  ArmyPerson("MAJOR DHURANDHAR", 254252);
	 ArmyPerson cad2 = new  ArmyPerson("MAJOR DHURANDHAR", 254252);
	 ArmyPerson cad3 = new  ArmyPerson("MAJOR DHURANDHAR", 254252);
	 ArmyPerson cad4 = new  ArmyPerson("MAJOR DHURANDHAR", 254252);
	 ArmyPerson cad5 = new  ArmyPerson("MAJOR DHURANDHAR", 254252);
	 ArmyPerson cad6 = new  ArmyPerson("MAJOR DHURANDHAR", 254252);
	 ArmyPerson cad7 = new  ArmyPerson("MAJOR DHURANDHAR", 254252);
	 ArmyPerson cad8 = new  ArmyPerson("MAJOR DHURANDHAR", 254252);
	 ArmyPerson cad9 = new  ArmyPerson("MAJOR DHURANDHAR", 254252);
	
	 set.add(cad1);
	 set.add(cad2);
	 set.add(cad3);
	 set.add(cad4);
	 set.add(cad5);
	 set.add(cad6);
	 set.add(cad7);
	 set.add(cad8);
	 set.add(cad9);
		 
   System.out.println(set);
	}

}
