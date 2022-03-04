package com.simplilearn.config;


import java.sql.Connection;
import java.sql.DriverManager;

public class Insert {
	
		public static void main(String[] args) {
			
		String driver="com.mysql.cj.jdbc.Driver";
		String url="jdbc:mysql://localhost:3306/simplilearn";
		String username="root";
		String password="Pankaj@123"; 
			
			try {
				//load driver
				Class.forName(driver);
				//get connection and store it in con object
				Connection con= DriverManager.getConnection(url, username, password);
				//check if the connection is not null
				if(con!=null)
				{
					String sql= "insert into student(id, fname,lname,email) values (6,'kumar','jain','jainkumar@gmail.com')";
					java.sql.Statement stmt= con.createStatement();
					stmt.execute(sql);
					System.out.println("Data inserted successfully");
				}
					
				else
					System.out.println("Error while connecting with database");	
			} catch (Exception e) {
				e.printStackTrace();
			}
		
		}
	}