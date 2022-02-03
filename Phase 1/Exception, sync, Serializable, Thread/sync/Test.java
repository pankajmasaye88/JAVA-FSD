package com.simplilearn.sync;

public class Test {

	public static void main(String[] args) {
		
		Sender sender= new Sender();
		
		User user1= new User("Pankaj","Hiiii.....", sender);
		User user2= new User("Sam", "Bye......", sender);
		User user3= new User("Raja babau","Says hello", sender);
		
		user1.start();
		user2.start();
		user3.start();
	}	
}