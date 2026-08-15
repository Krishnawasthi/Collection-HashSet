package com.collection.hashset.example;




class Example1
{
	
	
	
}

public class SecondExample {

	public static void main(String[] args) 
	{
		String s1 = "hello";
		
		String s2 = "hello";
		 
		System.out.println(s1.hashCode());  //99162322(same hashCode for same object)
		System.out.println(s2.hashCode());  //99162322(same hashCode for same objects)
		
		System.out.println(s1.equals(s2)); //true
		
		
		
		//two different objects 
		
		Example1 obj1 = new Example1();
		Example1 obj2 = new Example1();
		
		System.out.println(obj1.hashCode()); //1867750575 hashCode for obj1 object
		System.out.println(obj2.hashCode()); //2046562095 hashCode for obj2 object
		
		System.out.println(obj1.equals(obj2)); 
		
	}

}
