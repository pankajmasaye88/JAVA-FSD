package arithmeticCalculator;

import java.util.Scanner;

public class ArithmeticCalculator {

	//addition 
	public int add(int a, int b) {
	int c = a+b;
	return c;
	}
	//subtraction
	public int sub(int a, int b) {
	int d= a-b;
	return d;
	}
	//multiplication
	public int multi(int a, int b) {
		int f = a*b;
		return f;
	}
	//division
	public float divide(int a, int b) {
		float e = (float) a/b;
		return e;
	}
	
	public static void main(String[] args) {
		int p = 0;
		System.out.println("Enter first number : ");
		Scanner sa= new Scanner(System.in);
		int a = sa.nextInt();
		System.out.println("Enter second number : ");
		int b = sa.nextInt();
		
	ArithmeticCalculator s= new ArithmeticCalculator();
	System.out.println("Enter your choice: 1.Addition 2.Subtraction 3.Multiplication 4.Division. "); 
	int op = sa.nextInt(); 
	while(op!=0) {
		if(op<1 || op>4) {
			System.out.println("Enter correct choice !");
			break;
		}
		else if(op==1) {
			int c=s.add(a,b);
			System.out.println("Addition of numbers is : "+c);
			break;
		}
		else if(op==2) {
			int d= s.sub(a,b);
			System.out.println("Subtraction of numbers is : "+d);
			break;
		}
		else if(op==3) {
			int f= s.multi(a,b);
			System.out.println("Multiplication of numbers is : "+f);
			break;
		}
		else if(op==4) {
			float e= s.divide(a,b);
			System.out.println("Division of numbers is : "+e);
			break;
		}	
	
	}	
	}
}