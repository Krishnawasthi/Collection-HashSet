package com.collection.hashset.example1;

import java.util.HashSet;
import java.util.Iterator;

public class Example2 {

	public static void main(String[] args) {
	HashSet<String> set = new HashSet<String>();  // default capacity = 16
    
	set.add("BLR"); //retrun?
	
	//calculate the hash code of the element
	int hash = "BLR".hashCode();
	int spreadHash = hash ^(hash >>> 16);
	// bucket is index
	int bucket = spreadHash & (16 - 1);
	System.out.println(hash);                
    System.out.println(bucket);  // in which index your element is.
    System.out.println(spreadHash);
	
	set.add("HYD");
	set.add("DEL");
	set.add("LKO");
	set.add("KNP");
	set.add("AHM");
	set.add("CHE");
	
	Iterator<String> itr = set.iterator();         // Iterator → tells Java HOW to move through the Set
		
		                                           //itr.hasNext()   Is there another element?
	                                               //itr.next()   Give me the next element
	while(itr.hasNext()) {
			
			System.out.println(itr.next());
		
	}
	}

}
