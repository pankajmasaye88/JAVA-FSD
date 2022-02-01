package com.simplilearn.inner;

public class RegularInnerClass {

	private int a=10;
	private float b=5/2;
	class Inner
	{
		void display() {
			System.out.println("Welcome to Inner class");
			System.out.println("Value of a : "+a);
			System.out.println("Value of b : "+b);
		}
	}
	
	public static void main(String[] args) {
	
		RegularInnerClass outer= new RegularInnerClass();
		RegularInnerClass.Inner inner= outer.new Inner();
		
		inner.display();
	}
}