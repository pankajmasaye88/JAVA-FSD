package com.simplilearn.thread;

public class ThreadDemo extends Thread {
	
	public void run() {
		
		System.out.println(Thread.currentThread().getName()+" : My thread is started");
	}
	public static void main(String[] args) {
		ThreadDemo t1 = new ThreadDemo();
		t1.start();
		ThreadDemo t2 = new ThreadDemo();
		t2.start();	
	}
}