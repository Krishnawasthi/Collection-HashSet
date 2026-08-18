package com.collection.hashset.example3;

import java.util.HashSet;

public class Example3 {

	public static void main(String[] args) {
		
		HashSet<String> product = new HashSet<String>();
		
		product.add("iphone17");
		product.add("samsung s24");
		product.add("micromax");
		product.add("gioni");
		product.add("motorola");
		product.add("realme");
		
		int hash =  "iphone17".hashCode();
		    hash =  "samsung s24".hashCode();
		    hash =  "micromax".hashCode();
		    hash =  "gioni".hashCode();
		    hash =  "motorola".hashCode();
		    hash =  "realme".hashCode();
		    
		int spreadHash = hash^(hash >>> 16);
		
		int bucketNumber = spreadHash & 15;
		
		System.out.println(spreadHash);
		System.out.println("bucketNumber index : " + bucketNumber);

	}

}
