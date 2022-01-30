package com.simplilearn.method;

import java.util.Scanner;

public class EmployeeConstructor {
	//class level variables
	int eID;
	String eName;
	String eDepartment;
	
	//default constructor
	public EmployeeConstructor() {
		eID=10;
		eName= "Pankaj";
		eDepartment= "Data Base";
	}
	public EmployeeConstructor(int eID, String eName, String eDepartment) {
		this.eID= eID;
		this.eName= eName;
		this.eDepartment= eDepartment;
	}
	public static void main(String[] args) {
		EmployeeConstructor obj= new EmployeeConstructor();
	//First employee details from default constrcuctor
		System.out.println("Employee 1");
		System.out.println("Employee ID : "+obj.eID);
		System.out.println("Employee Name : "+obj.eName);
		System.out.println("Employee Department Name : "+obj.eDepartment);
		
	//taking second employee details from user
		System.out.println("Enter Employee 2 Details : ");
		Scanner sc= new Scanner(System.in);
		int a= sc.nextInt();
		String b= sc.next();
		String c= sc.next();
		
		EmployeeConstructor obj1= new EmployeeConstructor(a,b,c);
		System.out.println("Employee 2");
		System.out.println("Employee ID : "+obj1.eID);
		System.out.println("Employee Name : "+obj1.eName);
		System.out.println("Employee Department Name : "+obj1.eDepartment);		
	}
}