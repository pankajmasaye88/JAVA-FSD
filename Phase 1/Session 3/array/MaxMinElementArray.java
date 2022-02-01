package com.simplilearn.array;

import java.util.Scanner;

public class MaxMinElementArray {
//WAP to find out max and min number from an array of 10 elements.
	public static void main(String[] args) {
        int max=0;
       	Scanner sc= new Scanner(System.in);
		System.out.println("Enter elements of array : ");
		int[] a = new int[10];	
		for(int i=0;i<10;i++)
		{
			a[i]= sc.nextInt();
		}
		for(int i=0;i<10;i++)
		{
			if(a[i] > max)
			{
				max = a[i];
			}
		}
		int min = a[1];
		for(int i=0;i<10;i++)
		{
			if(a[i] < min)
			{
				min = a[i];
			}
		}
		System.out.println("Array elememt: ");
		for(int i=0;i<10;i++)
		{
			System.out.println(a[i]);
		}
		System.out.println("Max element : "+max);
		System.out.println("Min element : "+min);
		sc.close();
	}
}