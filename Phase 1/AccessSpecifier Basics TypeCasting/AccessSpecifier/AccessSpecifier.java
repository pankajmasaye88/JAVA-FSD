package com.simplilearn.AccessSpecifier;

public class AccessSpecifier {

	//within same class
	protected void display() {
		System.out.println("You are accessing protected method of this class");
	}
		
	private void test()
	{
		System.out.println("My private method");
	}
	
	public void hello()
	{
		System.out.println("Public method");
	}
	void world()
	{
		System.out.println("Default method");
	}


	
	
	public static void main(String[] args) {
		
	AccessSpecifier obj = new AccessSpecifier();
	
	obj.display();//able
	obj.test();//able
	obj.hello();//able
	obj.world();//able
	}
}