package PracticeProjectAssistedProject;

public class ThreadCreation_runnable implements Runnable {
	
	    public static int myCount = 0;
	    public ThreadCreation_runnable(){	         
	    }
	    
	    public void run() {
	        while(ThreadCreation_runnable.myCount <= 10){
	            try{
	                System.out.println("Expl Thread: "+(++ThreadCreation_runnable.myCount));
	                Thread.sleep(100);
	            } catch (InterruptedException iex) {
	                System.out.println("Exception in thread: "+iex.getMessage());
	            }
	        }
	    } 
	    public static void main(String a[]){
	        System.out.println("Starting Main Thread...");
	        ThreadCreation_runnable mrt = new ThreadCreation_runnable();
	        Thread t = new Thread(mrt);
	        t.start();
	        while(ThreadCreation_runnable.myCount <= 10){
	            try{
	                System.out.println("Main Thread: "+(++ThreadCreation_runnable.myCount));
	                Thread.sleep(100);
	            } catch (InterruptedException iex){
	                System.out.println("Exception in main thread: "+iex.getMessage());
	            }
	        }
	        System.out.println("End of Main Thread...");
	    }
}