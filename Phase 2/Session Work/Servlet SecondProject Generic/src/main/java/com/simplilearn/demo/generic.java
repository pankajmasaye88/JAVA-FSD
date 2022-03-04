package com.simplilearn.demo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

/**
 * Servlet implementation class generic
 */
@WebServlet("/generic")
public class generic extends GenericServlet {
	private static final long serialVersionUID = 1L;
       
	@Override
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		PrintWriter out= response.getWriter();

		String uname= request.getParameter("uname");
		String pass= request.getParameter("pass");
		
		if(pass.equals("admin123") && uname.equals("Pankaj"))
		{
			out.print("Login data successfully !");
			out.print("Welcome "+uname);
		}
		else
		{
			out.print("Invalid login");
		}
	}
}