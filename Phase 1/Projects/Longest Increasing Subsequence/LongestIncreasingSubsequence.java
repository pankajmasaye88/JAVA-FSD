package LongestSubsequence;

import java.util.Scanner;

public class LongestIncreasingSubsequence {

		static int incre_subseq(int my_arr[], int arr_len)
	{
		      int seq_arr[] = new int[arr_len];
		      int i, j, max = 0;
		      for (i = 0; i < arr_len; i++)
		         seq_arr[i] = 1;
		      for (i = 1; i < arr_len; i++)
		      for (j = 0; j < i; j++)
		      if (my_arr[i] > my_arr[j] && seq_arr[i] < seq_arr[j] + 1)
		      seq_arr[i] = seq_arr[j] + 1;
		      for (i = 0; i < arr_len; i++)
		      if (max < seq_arr[i])
		      max = seq_arr[i];
		      return max;
		   }
		 
	  public static void main(String args[]){
//		      int my_arr[] = { 20, 15, 58, 89, 45, 86, 98 , 48, 78, 82};
		      int a[]= new int[10];
		      System.out.println("Enter 10 numbers : ");
		      Scanner sc=new Scanner(System.in);
		      for(int i=0;i<10;i++)
		      {
		    	  a[i] = sc.nextInt();
		      }
		      sc.close();
		      int arr_len= a.length;
		      System.out.println("Elements : ");
		      for(int i=0;i<10;i++)
		      {
		    	  System.out.println(a[i]);
		      }
		      System.out.println("The length of the longest increasing subsequence is " +  incre_subseq(a, arr_len));
		  
	 }
		}