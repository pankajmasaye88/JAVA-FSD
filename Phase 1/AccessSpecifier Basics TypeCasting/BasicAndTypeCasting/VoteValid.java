package com.simplilearn.BasicAndTypeCasting;

import java.util.Scanner;

public class VoteValid {
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the age : ");
		int age = sc.nextInt();
		
		if(age >= 18) {
			System.out.println("Valid for vote !");
		}
		else {
			System.out.println("Not Valid for vote ! ");
		}
	}

}
