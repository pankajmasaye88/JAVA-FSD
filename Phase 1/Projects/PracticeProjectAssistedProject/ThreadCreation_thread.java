package PracticeProjectAssistedProject;

public class ThreadCreation_thread extends Thread{

	public void run()
	 	{
	  		System.out.println("concurrent thread started running.."+getName());
	}



	public static void main( String args[] )
	 	{
			ThreadCreation_thread mt= new ThreadCreation_thread();
	  		
	  		mt.start();
	 	}
}