package com.simplilearn.BasicAndTypeCasting;

public class TableOf5 {
	public static void main(String[] args) {
		
		System.out.println("Table of 5 using WHILE : ");
		int i=0, j=0;
		while(i<=50) {
			if(i%5==0) {
				System.out.println(i);
			}
			i++;
		}
		
		System.out.println("Table of 5 using DO WHILE : ");
		do {
			if(j%5==0) {
				System.out.println(j);
			}
			j++;
		}while(j<=50);
		
		System.out.println("Table of 5 using FOR loop : ");
		for(int k=0;k<=50;k++) {
			if(k%5==0) {
				System.out.println(k);
			} 
		}

	
	
	}
}
