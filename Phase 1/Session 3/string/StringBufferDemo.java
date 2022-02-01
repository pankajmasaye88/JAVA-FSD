package com.simplilearn.string;

public class StringBufferDemo {
	public static void main(String[] args) {
		
		 StringBuffer str = new StringBuffer("Hello world!");
		 
		 System.out.println("Character at index 4 : " +str.charAt(4) );
		 System.out.println("String length "+str.length());
		
		 System.out.println("Replace "+str.replace(0, 5, "Welcome"));
		 
		 System.out.println("Reverse string :  "+str.reverse());	
		 
		 //same code for string builder
	}	
}