package com.simplilearn.crud;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Properties;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/delete")
public class DeleteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out= response.getWriter();
		Properties prop= new Properties();
		
		String id= request.getParameter("id");
		
		
		prop.load(getServletContext().getResourceAsStream("/WEB-INF/application.properties"));
		try {
			DatabaseConfig config= new DatabaseConfig(prop.getProperty("driver"), prop.getProperty("url"), prop.getProperty("username"), prop.getProperty("password"));
			
		Connection conn= config.getConnection();

		PreparedStatement stmt= conn.prepareStatement("delete from eproduct where id=?");
		stmt.setInt(1, Integer.parseInt(id));
		
		int x= stmt.executeUpdate();
		if(x>0)
		{
			System.out.println("Data Deleted successfully");
		}
		else
		{
			System.out.println("Error while Deleting a data");
		}
		
		response.sendRedirect("list");
		
		
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
	
	
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
