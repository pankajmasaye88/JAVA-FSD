package com.simplilearn.method;

import java.util.Scanner;

public class MethodOverload {
	public int add(int a, int b) {
		return a+b;
	}
	public int add(int a, int b, int c) {
		return a+b+c;
	}
	public float add(float a, float b) {
		return a+b;
	}
	public float add(float a, float b, float c) {
		return a+b+c;
	}		
	public double add(double a, double b) {
		return a+b;
	}
	public static void main(String[] args) {
		MethodOverload m= new MethodOverload();
		System.out.println("Add 2 int "+m.add(3, 6));
		System.out.println("Add 3 int "+m.add(3, 6, 22));
		System.out.println("Add 2 float "+m.add(3.4f, 6.8f));
		System.out.println("Add 3 float "+m.add(4.5f, 7.8f, 6.7f));
		System.out.println("Add 2 double "+m.add(4.5, 7.8));	

	Scanner sc= new Scanner(System.in);
	System.out.println();
	System.out.println("Enter your numbers : ");
	int x= sc.nextInt();
	int y = sc.nextInt();
	System.out.println("Add 2 int from users value : "+m.add(x, y));
	
	
	}
}