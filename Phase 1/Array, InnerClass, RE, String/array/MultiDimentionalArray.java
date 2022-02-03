package com.simplilearn.array;

import java.util.Scanner;
public class MultiDimentionalArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //lets store elements in matrix      
        int array[][] = new int[3][3];
        
//        int array[][]= {{1,2,4},{3,4,5},{9,7,4}};
// 		 entering values directly	      
        for(int i=0;i<3;i++)
        {
        	for(int j=0;j<3;j++)
        	{
        		System.out.println("Enter elements : "+i+" "+j);
        		array[i][j] = sc.nextInt();      		
        	}
        }
       
		System.out.println("Lets print elements:");
			for(int i=0;i<3;i++)
			{
				for(int j=0;j<3;j++)
				{
					System.out.println(array[i][j]+" \t ");	      		
				}
				System.out.println();
			}	
    }
}