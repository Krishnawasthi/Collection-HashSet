package com.collection.hashset.example1;

import java.util.HashSet;

public class Example2 {

	public static void main(String[] args) {
	HashSet<String> set = new HashSet<String>();  // default capacity = 16
    
	set.add("BLR"); //retrun?
	
	//calculate the hash code of the element
	int hash = "BLR".hashCode();
	int spreadHash = hash ^(hash >>> 16);
	int bucket =spreadHash & (16 - 1);
	System.out.println(hash);
   System.out.println(bucket);
   System.out.println(spreadHash);
	
	set.add("HYD");
	set.add("DEL");
	set.add("LKO");
	set.add("KNP");
	set.add("AHM");
	set.add("CHE");
	
	System.out.println(set);
	}

}
