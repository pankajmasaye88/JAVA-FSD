package com.simplilearn.inner;

public class LocalInnerClass {

	void validate(int age)
	{
		if (age>=18)
		{
			class Inner{
				void test()
				{
					System.out.println("Now authenticate User to addhar.");
				}	
			}
			Inner inner= new Inner();
			inner.test();	
		}
		else {
			System.out.println("Not authenticate to aadhar");
		}
	}
	
	public static void main(String[] args) {
	LocalInnerClass local = new LocalInnerClass();
	local.validate(45);
	local.validate(15);
	}
}
