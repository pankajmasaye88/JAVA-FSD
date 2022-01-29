package com.simplilearn.BasicAndTypeCasting;

import java.util.Scanner;

public class Interest {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter principle amount : ");
		int p = sc.nextInt();
		System.out.println("Enter rate of interest : ");
		int r = sc.nextInt();
		System.out.println("Enter number of years : ");
		int t = sc.nextInt();
		
		float interest = p * r * t / 100;
		System.out.println("Interest amount is: "+interest);
		
		
	}

}
