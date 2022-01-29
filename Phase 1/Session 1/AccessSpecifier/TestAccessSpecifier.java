package com.simplilearn.AccessSpecifier;

public class TestAccessSpecifier {

	public static void main(String[] args) {
		
		//Default accessible in same package
		DefAccessSpecifier def =  new DefAccessSpecifier();
		def.display();
		
		//access private variable to another class - not accessible
		
	/*	PrivateAccessSpecifier obj = new PrivateAccessSpecifier();
		System.out.println("Value of a "+obj.a);
		*/
		//access protected class in same package
		AccessSpecifier obj2 = new AccessSpecifier();
		obj2.display();	
	}
}