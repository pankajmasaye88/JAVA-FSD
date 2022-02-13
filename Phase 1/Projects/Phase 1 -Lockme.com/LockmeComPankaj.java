package FinalProjectLockme.com;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class LockmeComPankaj extends LockmeOperations
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("------------------------------------------------");
		System.out.println("..........Hello Welcome To Lockme.com..........");
		System.out.println("\tWelcome to Pankaj Masaye Project");
		System.out.println();
	
		//creating some files automatically, so the folder isn't empty at the start
		  System.out.print("System waking up ! \n");
	    // System.out.println("Automatically creating some files in the system :");
		  System.out.println();
		  try {
				CreateWriteFile();
			} catch (IOException e) {
				System.out.println(e);
			}	
		  
		//while loop for calling methods
		while(true)
		{
			System.out.println("Enter 1 For List Of files in the ");
			System.out.println("Enter 2 For Performing Business Operations");
			System.out.println("Enter 3 For Exit");
			System.out.println("Enter Your Choice:");
			int ch=sc.nextInt();
			if(ch==1)
			{
				try 
				{
					retriveFiles();
					System.out.println();
				} 
				catch (Exception e)
				{
					e.printStackTrace();
				}
			}
			else if(ch==2)
			{
				while(true)
				{
					System.out.println("Enter 1 To Create File");
					System.out.println("Enter 2 To Delete File");
					System.out.println("Enter 3 To Search File");
					System.out.println("Enter 4 To Back");
					System.out.println("Enter Your Choice :");
					int op=sc.nextInt();
					if(op==1)
					{
						try 
						{
							//calling createfile
							createfile();
						} 
						catch (Exception e) 
						{
							e.printStackTrace();
						}
					}
					else if(op==2)
					{
						try 
						{
							//calling deletefile
							deletefile();
						} 
						catch (IOException e) 
						{
							e.printStackTrace();
						}
					}
					else if(op==3)
					{
						try 
						{
							//calling searchfile
							searchfile();
						} 
						catch (IOException e) 
						{
							e.printStackTrace();
						}
					}
					else if(op==4)
					{
						break;

					}
					else 
					{
						System.out.println("Choose Correct Option");
					}
				}
				System.out.println("----------------------------------------------------");
			}
			else if(ch==3)
			{
				System.out.println("---------------------------------------------------");
				System.out.println("Exiting the system ... ");
				System.out.println("System in shutdown mode ! ");
				System.out.println("----------------------------------------------------");
				break;	
			}
			else
			{
				System.out.println("Invalid Selection");
			}
		}
		sc.close();
	}
	
	static void CreateWriteFile() throws IOException{
		//create file
		File file1=new File("D:\\fileHandling\\Testing1.txt");
		File file2=new File("D:\\fileHandling\\Testing2.txt");
		File file3=new File("D:\\fileHandling\\Testing3.txt");
		//write to file
		FileWriter writer1= new FileWriter(file1);
		writer1.write("First Testing File");
		FileWriter writer2= new FileWriter(file2);
		writer2.write("Second Testing File");
		FileWriter writer3= new FileWriter(file3);
		writer3.write("Third Testing File");	
		writer1.close();
		writer2.close();
		writer3.close();
			}
}