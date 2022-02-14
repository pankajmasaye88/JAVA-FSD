package PracticeProjectAssistedProject;

@SuppressWarnings("serial")
public class ExceptionHandlers extends Exception{

   String str1;
   ExceptionHandlers(String str2) {
	str1=str2;
   }
   
   public String toString(){ 
	return ("ExceptionHandlers Occurred: "+str1) ;
   }

   public static void main(String args[]){
	try{
		System.out.println("Starting of try block");
		// I'm throwing the custom exception using throw
		throw new ExceptionHandlers("This is My error Message");
	}
	catch(ExceptionHandlers exp){
		System.out.println("Catch Block") ;
		System.out.println(exp) ;
	}
   }
}