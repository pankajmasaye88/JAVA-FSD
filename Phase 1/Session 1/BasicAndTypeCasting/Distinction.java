package com.simplilearn.BasicAndTypeCasting;

import java.util.Scanner;

public class Distinction {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter percentages : ");
		int per = sc.nextInt();
		if(per<0 || per>100) {
			System.out.println("Kindly enter correct results !");
		}
		else {
			System.out.println("Calculating results ...");
		}
			
		if(per>=70 && per<=100) {
			System.out.println("Distinction");
		}
		if(per>=60 && per<69) {
			System.out.println("First class");
		}
		if(per>=50 && per<59) {
			System.out.println("Second class");
		}
		if(per>=35 && per<49) {
			System.out.println("Pass Class");
		}
		if(per>=0 && per<35) {
			System.out.println("Fail");
		}
			
		
		
	}

}
