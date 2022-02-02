package emailValidation;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateEmail {
	
	public Boolean validate(String userEmail, ArrayList<String> emails)
	{
		return emails.contains(userEmail);
	}
	public static void main(String[] args) {
		ArrayList<String> emails= new ArrayList<String>();
		emails.add("rajabaja@gmail.com");
		emails.add("PremKishan@gmail.com");
		emails.add("NiyatiRao@domain.com");
		emails.add("AshwinKumar@cocy.com");
		emails.add("helloWorld@domain.com");
		emails.add("WelcomeJava@rediffmail.com");
		emails.add("StackOverFlow@yahoo.com");
		emails.add("TutorialsPoint@yahoo.com");
		emails.add("w3schools@gmail.com");
		emails.add("12453@domain.com");  
		emails.add("alice@example.com");
	    emails.add("alice.bob@example.com");
	    emails.add("GeeksForGeeks@geeks.com");
	    emails.add("Pandu@domain.com");
	    System.out.println(emails);

//Pattern for restrictions to domain part and local part
//^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$
		
		String pattern= "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";
	    Pattern p= Pattern.compile(pattern);
	   
	    Scanner sc= new Scanner(System.in);
	    System.out.println("Enter Email Id : ");
	    String userEmail = sc.nextLine();
	    Matcher match = p.matcher(userEmail);
	    
	    ValidateEmail val= new ValidateEmail();
	           
	    if(match.matches())
	    {
	    	System.out.println("Entered Email has Proper format : ");
	    	System.out.println();
	    	System.out.println("Checking Users Email with list available ... ");
	    	System.out.println();
	    	if(val.validate(userEmail, emails)) {
	    		System.out.println("Email is present in the system ! Proceed to Login !");
	    	}
	    	else {
	    		System.out.println("Email is not available in the system.\nEnter registered Email Id !");
	    	}
	    }
	    else
	    {
	    	System.out.println("Enter email in proper format : ");
	    }
	sc.close();	
	}
}