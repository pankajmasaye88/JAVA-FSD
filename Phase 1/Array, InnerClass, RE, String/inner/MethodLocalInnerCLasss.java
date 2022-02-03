package com.simplilearn.inner;

public class MethodLocalInnerCLasss {

	public void display() 
	{
		class Inner
		{
			void myMethod()
			{			
				System.out.println("Method from Inner Class");
			}
		}
		Inner inner= new Inner();
		inner.myMethod();	
	}
	
	public static void main(String[] args) {
		MethodLocalInnerCLasss mlic= new MethodLocalInnerCLasss();
		mlic.display();	
	}
}