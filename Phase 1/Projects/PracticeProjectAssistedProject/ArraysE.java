package PracticeProjectAssistedProject;

public class ArraysE {
	
		public static void main(String[] args) {

		//single-dimensional array
		int a[]= {10,20,30,40,50};
		for(int i=0;i<5;i++) {
		System.out.println("Elements of single dimensional array a: "+a[i]);
		}


		//multidimensional array
		int[][] b = {{2, 4, 6, 8},{3, 6, 9} };
		      
		      System.out.println("\nLength of row 1: " + b[0].length);
		      System.out.println("Length of row 1: " + b[1].length);
		      
		    for(int i=0;i<2;i++)
		    {
		    	for(int j=0;j<4;j++)
		    	{
		    		try {
		    			System.out.println("Elements of Multi Dimensional array : "+b[i][j]);
					} catch (ArrayIndexOutOfBoundsException e) {
					 System.out.println(e);
					}		
		    	}
		    }
		    }
		}