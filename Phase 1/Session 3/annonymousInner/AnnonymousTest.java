package com.simplilearn.annonymousInner;

import com.simplilearn.inner.Car;

public class AnnonymousTest {

	 public static void main(String[] args) {
	        
	     //class interface implementation without class name is called as anonymous inner class
		 Car c=new Car() {           
	            @Override
	            public void stop() {
	                System.out.println("car started from anonymous class");   
	            } 
	            @Override
	            public void start() {
	                System.out.println("Car stopped from anonymous class");          
	            }
	        }; 
	        c.start();
	        c.stop();
	    }
}
