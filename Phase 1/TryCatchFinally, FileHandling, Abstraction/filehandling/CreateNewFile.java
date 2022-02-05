package com.simplilearn.filehandling;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Arrays;
import java.util.List;

public class CreateNewFile {

	static void CreateFileUsingFileClass() throws IOException 
	{
		File file= new File("D:\\fileHandling\\testFile");
		
		//create the file using file class
		if(file.createNewFile()) 
			System.out.println("File is created");
		else
			System.out.println("File Already Exists.");
		
		//write data to file
		FileWriter writer= new FileWriter(file);
		writer.write("Welcome to file handling !");
		writer.close();
	}
	
	//create file using FileOutputStreamClass
	static void createFileUsingOutputStream() throws IOException
	{
		FileOutputStream out=new FileOutputStream("D:\\fileHandling\\testFile1.txt");
		String data="Welcome to the world of JAVA File Handling";
		out.write(data.getBytes());
		out.close();
	}
	//create file using NIO
	static void createFileUsingNIO() throws IOException
	{
		String data= "Message";
		Files.write(Paths.get("D:\\fileHandling\\testFile2.txt"), 
				data.getBytes(), StandardOpenOption.CREATE);	
		List<String> lines= Arrays.asList("This is working","YEs perfectly working");
		Files.write(Paths.get("D:\\fileHandling\\testFile2.txt"), lines, StandardOpenOption.CREATE, StandardOpenOption.APPEND);
	}
	public static void main(String[] args) {
		try {
			//CreateFileUsingFileClass();
			//createFileUsingOutputStream();
			createFileUsingNIO();
		} 
		catch (IOException e) {
			System.out.println(e);
		}		
	}
}