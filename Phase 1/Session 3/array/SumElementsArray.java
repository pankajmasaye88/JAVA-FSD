package com.simplilearn.array;

import java.util.Scanner;

public class SumElementsArray {
//WAP to calculate sum of elements available in an array.
	public static void main(String[] args) {
		int sum=0;
		int[] a= new int[10];
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter length of array : ");
		int n= sc.nextInt();
		System.out.println("Enter elements : ");
		for(int i=0;i<n;i++)
		{
			a[i]= sc.nextInt();
		}
		for(int i=0;i<n;i++)
		{
			sum = sum + a[i];
		}
		System.out.println("Elements of array : ");
		for(int i=0;i<n;i++)
		{
			System.out.println(a[i]);
		}
		System.out.println("Sum of elements : "+sum);
	sc.close();	
	}
}