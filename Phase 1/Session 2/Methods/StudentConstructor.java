package com.simplilearn.method;

public class StudentConstructor {
	
	//class level variables
	int id;
	String name;
	
	//default constructor
	public StudentConstructor() {
		id=23;
		name="Pankaj";
	}
	public StudentConstructor(int id, String name){
		this.id = id;
		this.name = name;
	}
	
	public static void main(String[] args) { 
	        
		//when you create object automatically it calls default constructor
	    //if no default constructor then compiler create that
		StudentConstructor obj= new StudentConstructor();
		System.out.println("User 1");
		System.out.println("Id : "+obj.id);
		System.out.println("Name : "+obj.name);
		
		StudentConstructor obj2=new StudentConstructor(45,"Masaye");
		System.out.println("User 2");
		System.out.println("Id : "+obj2.id);
		System.out.println("Name : "+obj2.name);
	}
}