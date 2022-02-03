package com.simplilearn.BasicAndTypeCasting;

public class TypeCasting {

	public static void main(String[] args) {
		
		
		System.out.println("Implicit Type Casting");
		char a='A';
		System.out.println("Value of char a "+a);
		
		int b=a;
		System.out.println("Value of int b "+b);
		
		float c=b;
		System.out.println("Vlaue of float c "+c);
		
		long d=b;
		System.out.println("Vlaue of long d "+c);
		
		double e=b;
		System.out.println("Vlaue of double e "+c);
		

		System.out.println("       Explicit Type Casting");
		double x=89.90;
		int y= (int) x;
		System.out.println("Value of double x "+x);
		System.out.println("Value of int y "+y);
		
		float result = 45.0f/7;
		int result1 = 45/7;
		System.out.println("Value of result : "+result);
		System.out.println("Value of result : "+result1);

	}
}
