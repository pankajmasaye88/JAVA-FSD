package com.simplilearn.array;

import java.util.Scanner;

public class ArrayAddition {

    public static void main(String[] args) {
//WAP and create 2 (2*2) matrix and do matrix addition AND print the result.   
//    	int a[][]= {{2,6},{4,9}};
//    	int b[][] = {{4,0},{3,1}};
    	int[][] a = new int[2][2];  
    	int[][] b = new int[2][2];  
    	int[][] c = new int[2][2];  
    	Scanner sc= new Scanner(System.in);
    	System.out.println("Enter elements of 1st array : ");
    	for(int i=0;i<2;i++)
    	{
    		for(int j=0;j<2;j++)
    		{
    			a[i][j] = sc.nextInt();
    		}
    	}
    	System.out.println("Enter elements of 2nd array : ");
    	for(int i=0;i<2;i++)
    	{
    		for(int j=0;j<2;j++) 
    		{
    		b[i][j] = sc.nextInt();
    		}
    	}
    	for(int i=0;i<2;i++)
    	{
    		for(int j=0;j<2;j++)
    		{
    			c[i][j] = a[i][j] + b[i][j] ;
    		}  		
    	}            
		System.out.println("Print elements:");
			for(int i=0;i<2;i++)
			{
				for(int j=0;j<2;j++)
				{
					System.out.println(c[i][j]+"\t");	      		
				}
				System.out.println();
			}	
    }
}