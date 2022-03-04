package com.simplilearn.op;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/dbop")
public class DBOperations extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out= response.getWriter();
		response.setContentType("text/html");
		Properties props= new Properties();
		props.load(getServletContext().getResourceAsStream("/WEB-INF/application.properties"));
		
		try {
			DBConnection config= new DBConnection(props.getProperty("driver"),props.getProperty("url"),props.getProperty("username"),props.getProperty("password"));
			
			Connection conn= config.getConnection();
		
			Statement stmt= conn.createStatement();
			stmt.executeUpdate("create database mydatabase");
			out.print("Database created");
		
			stmt.executeUpdate("use mydatabase");
			out.print("Database changed and selected");
			
			stmt.executeUpdate("drop database mydatabase");
			out.print("Database dropped successfully");
			
			
			stmt.close();
			config.closeConnection();
			
		
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
