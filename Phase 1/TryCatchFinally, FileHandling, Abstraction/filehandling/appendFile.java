package com.simplilearn.filehandling;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
public class appendFile
{   
       public static void appendStrToFile(String fileName,String str)
{
    	   try {
    		   BufferedWriter out = new BufferedWriter(new FileWriter("D:\\fileHandling\\testFile2.txt", true));
    		   out.write(str);
    		   out.close();
    	   }
    	   catch (IOException e) {
    		   System.out.println("exception occurred" + e);
} }

	    public static void main(String[] args) throws Exception
	    {
	        String fileName = "D:\\fileHandling\\testFile2.txt";
	        try {
	            BufferedWriter out = new BufferedWriter(new FileWriter(fileName));	 
	            out.write("Hello World:\n");
	            out.close();
	        }
	        catch (IOException e) {
	            System.out.println("Exception Occurred" + e);
	        }

	        String str = "This is File Appending Program ";
	        appendStrToFile(fileName, str);
	        Scanner sc= new Scanner(System.in);
	        System.out.println("Enter string to append : ");
	        String str1 = sc.next();
	        appendStrToFile(fileName, str1);
	        try {
	            BufferedReader in = new BufferedReader(
	                new FileReader("D:\\fileHandling\\testFile2.txt"));
	            String mystring;
	            while ((mystring = in.readLine()) != null) {
	                System.out.println(mystring);
	            }
	        }
	        catch (IOException e) {
	            System.out.println("Exception Occurred" + e);
	        }
	    }
	}	