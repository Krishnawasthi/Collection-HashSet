package com.collection.hashset.spreadhashexample;

import java.util.HashSet;

public class Driver {

	public static void main(String[] args) {
		HashSet<String> set = new HashSet<String>();
		
		set.add("lko");
		set.add("blr");
		set.add("knp");
		set.add("del");
		
		int hash = "lko".hashCode();
		System.out.println("Calculated Hash        : " + hash);
		
		int spreadHash = hash ^(hash >>> 16);
		System.out.println("Calculated spreadhash  : " + spreadHash);
		
		int bucketNumber = spreadHash & 15;
		
		System.out.println("LKO Stored at bucket   : " + bucketNumber );
		
		
		
		
		

	}

}
