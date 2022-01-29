package com.simplilearn.BasicAndTypeCasting;

public class FisrtOdd50 {
	public static void main(String[] args) {
		
		System.out.println("Printing first 50 Odd numbers :");
		System.out.println("Using WHILE loop");
		int i=1;
		while(i<=100) {
			if(i%2 != 0) {
				System.out.println(+i);
			}
			i++;
		}
		
	
		System.out.println("Using DO WHILE loop");
		int j=1;
		do{
			if(j%2 != 0) {
				System.out.println(+j);
			}
			j++;
		}while(j<=100);
	
		System.out.println("Using FOR loop");
		for(int k=1;k<=100;k++) {
			if(k%2 != 0) {
				System.out.println(+k);
			}
		}
			
		
	}

}
