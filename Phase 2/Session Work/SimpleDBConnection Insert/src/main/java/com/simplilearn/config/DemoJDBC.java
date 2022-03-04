package com.simplilearn.config;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.sql.Connection;
import java.util.Properties;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/jdbc")
public class DemoJDBC extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		PrintWriter out= response.getWriter();
			try {
				InputStream in= getServletContext().getResourceAsStream("/WEB-INF/application.properties");
				Properties props= new Properties();
				props.load(in);
				
				DatabaseConfig obj= new DatabaseConfig(props.getProperty("driver"),props.getProperty("url"),props.getProperty("username"),props.getProperty("password"));
				Connection conn=obj.getConnection();
				if(conn!=null) {
					
						String sql= "insert into student(id, fname,lname,email) values (7,'rajnish','patel','rpatel@gmail.com')";
						java.sql.Statement stmt= conn.createStatement();
						stmt.execute(sql);
						out.println("Data inserted successfully");
					}
						
					else {
						out.println("Error while connecting with database");	
					}
			} catch (Exception e) {
				e.printStackTrace();
			}
	}

	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
