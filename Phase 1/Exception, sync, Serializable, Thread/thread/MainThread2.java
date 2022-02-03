package com.simplilearn.thread;

public class MainThread2 implements Runnable {
	public static int count=0;
	
	public MainThread2() {
		
	}
	
	@Override
	public void run() {
		while(count<=10)
        {
            System.out.println("Exc Thread "+ (++count));
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
	}
	
	public static void main(String[] args) {
		System.out.println("Starting Main thread...");  
		
		MainThread2 t1= new MainThread2();
		Thread t= new Thread(t1);
		t.start();
		
		while(count<=10)
        {
            System.out.println("Main Thread "+ (++count));
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }	
	}
}