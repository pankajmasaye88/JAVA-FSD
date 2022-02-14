package PracticeProjectAssistedProject;
import java.util.Scanner;

public class LinearSearch {

    public static void main(String[] args){
    	
    	Scanner sc= new Scanner(System.in); 
    	System.out.println("Enter length of an array : ");
    	int len= sc.nextInt();
    	
    	int[] arr= new int[len]; 
    	
    	System.out.println(" Enter Elements : ");
    	for(int i=0; i<len;i++) {
         	arr[i] = sc.nextInt();
         }
    	
    	
 //       int[] arr = {10,20,30,40,50};
        int arrlength = arr.length;
        System.out.println("Elements : ");
        for(int i=0; i<arrlength;i++) {
        	System.out.println(arr[i]);
        }
        
        

        System.out.println("Enter the element to be searched");
        int searchValue = sc.nextInt();
            int result = (int) linearing(arr,searchValue);

            if(result==-1){

                System.out.println("Element not in the array");
            } else {

                System.out.println("Element found at "+result+" and the search key is "+arr[result]);
            }
            sc.close();
        }
public static int linearing(int arr[], int x) {

    int arrlength = arr.length;
    for (int i = 0; i < arrlength - 1; i++) {

        if (arr[i] == x) {

            return i;

         }
     }
            return -1;

   }
}