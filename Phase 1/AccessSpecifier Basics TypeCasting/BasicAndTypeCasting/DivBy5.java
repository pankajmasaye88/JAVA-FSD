package com.simplilearn.BasicAndTypeCasting;

import java.util.Scanner;

public class DivBy5 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ? ");
		int num = sc.nextInt();
		
		if(num%5 == 0) {
			System.out.println("Number is divisible by 5.");
		}
		else {
			System.out.println("Number is not divisible by 5 !");

		}
		
	}

}
