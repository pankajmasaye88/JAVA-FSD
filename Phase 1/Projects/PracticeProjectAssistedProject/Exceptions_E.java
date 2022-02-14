package PracticeProjectAssistedProject;

public class Exceptions_E extends Exception{
 
	    public Exceptions_E(String s) 
	    { 
	        super(s); 
	    } 
	    public static void main(String args[]) 
	    { 
	        try
	        { 
	            throw new Exceptions_E("temp"); 
	        } 
	        catch (Exceptions_E ex) 
	        { 
	            System.out.println("Caught"); 
	            System.out.println(ex.getMessage()); 
	        } 
	    } 
}