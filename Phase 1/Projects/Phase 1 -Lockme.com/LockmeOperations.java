package FinalProjectLockme.com;


import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class LockmeOperations
{
	public static void retriveFiles() throws Exception
	{
		//printing list of files in the system
		File filedir =new File("D:\\fileHandling");
		if(filedir.isDirectory())
		{
			List<String> listFile = Arrays.asList(filedir.list());
			System.out.println("List of available files in the system : ");
			Collections.sort(listFile);
			if(listFile.isEmpty())
			{
				System.out.println("No Data Available");
			}
			else
			{
				for(String s:listFile)
				{
					System.out.println(s);
				}				
			}
		}
		else
		{
			System.out.println("No Data Available");
		}
	}
	public static void createfile() throws Exception
	{
		//creating new file
		Scanner sc = new Scanner(System.in);
	     System.out.print("Enter file name to create new file: ");
	     String fileName = sc.nextLine();
	     
	     fileName = fileName + ".txt";
	     
	     Path path=Paths.get("D:\\fileHandling\\"+fileName);
	     
	     try 
	     {
	    	 if(Files.exists(path))
	    	 {
	    		 System.out.println("File Already Exist in the system");
	    	 }
	    	 else
	    	 {
	         Path p = Files.createFile(path); //creates file at specified location  
	         System.out.println("File has been created..");
	    	 }
	    }
	       catch(IOException e) 
	     {
	         System.out.println("Exception Occurred:");
	         e.printStackTrace();
	     }
	}
	
	public static void deletefile() throws IOException
	{
		//deleting file from the system
		Scanner sc = new Scanner(System.in);
	     System.out.print("Enter file name to delete: ");
	     String fileName = sc.nextLine();
	     fileName = fileName + ".txt";
	     fileName.toLowerCase();	 
	     Path path=Paths.get("D:\\fileHandling\\"+fileName);
	     if(Files.deleteIfExists(path))
	    {
	    	System.out.println("File has been removed from the folder");
	    }
	    else
	    	 {
	    		 System.out.println("Could not find the file in the folder, So could not delete !");
	    	 }
	}
	
	public static void searchfile() throws IOException
	{
		//looking for particular file in the system
		Scanner sc = new Scanner(System.in);
	     System.out.print("Enter file name to search: ");
	     String fileName = sc.nextLine();
	    fileName = fileName + ".txt"; 
	     fileName.toLowerCase();
	     Path path=Paths.get("D:\\fileHandling\\"+fileName);
	     if(Files.exists(path))
		 {
	    	 System.out.println("File with same name is present in the folder.");
	    	 System.out.println();
		 }
		 else
		 {
			 System.out.println("Could not find the file, please enter proper name !");
		 }
	}
}