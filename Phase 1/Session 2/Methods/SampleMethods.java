package com.simplilearn.method;

import java.util.Scanner;

public class SampleMethods {
	
	//method with no return value, without parameter
	public void display() {
		System.out.println("Welcome to java");
	}
	//method which will calculate some value and return as a result
    //2 parameter
	public int add(int a, int b) {
		int num1=a+b;
		int num2=a*b;
		return num1+num2;
	}
	//method to check user validity and return true or false, one parameter
	public boolean valid(int age) {
		if(age>18)
			return true;
		else
			return false;
	}
	 //method to return fullname based on fname and lname, 2 parameterized
	public String fullName(String fname, String lname) {
		return fname+" "+lname;	
	}
	public static void main(String[] args) {
		SampleMethods s= new SampleMethods();
		s.display();
		int result = s.add(	2, 4);
		System.out.println("Result "+result);
		System.out.println(s.valid(67));
		System.out.println("My full name is "+s.fullName("Pankaj","Masaye"));
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter your age :");
		int input= sc.nextInt();
		if(s.valid(input))
			System.out.println("Valid for vote !");
		else
			System.out.println("Not valid !");
		
	}
}
