package com.simplilearn.BasicAndTypeCasting;

public class First50UsingLoop {
	public static void main(String[] args) {
		System.out.println("Printing first 50 natural numbers :");
		System.out.println("Using WHILE loop");
		int i=1;
		while(i<=50) {
			System.out.println(+i);
			i++;
		}
		System.out.println("Using DO WHILE loop");
		int j=1;
		do{
			System.out.println(+j);
			j++;
		}while(j<=50);
	
		System.out.println("Using FOR loop");
		for(int k=1;k<=50;k++) {
			System.out.println(+k);
		}
		
		
	}
}
