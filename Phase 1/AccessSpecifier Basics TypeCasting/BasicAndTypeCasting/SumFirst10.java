package com.simplilearn.BasicAndTypeCasting;

public class SumFirst10 {
	public static void main(String[] args) {
		
		System.out.println("Sum of first 10, 11, 12 numbers");
		int i=1;
		int sum=0;
		while(i<=10) {
			sum = sum + i;
			i++;
		}
		System.out.println("Sum using WHILE : "+sum);
		int j=1; int sum1=0;
		do {
			sum1 = sum1 + j;
			j++;
		}while(j<=11);
		System.out.println("Sum using DO WHILE : "+sum1);
		int sum2=0;
		for(int k=0;k<=12;k++) {
			sum2 = sum2 + k;
		}
		System.out.println("Sum using FOR : "+sum2);	
	}
}
