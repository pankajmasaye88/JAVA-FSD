package com.simplilearn.demo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

//@WebServlet(name="interface", urlPatterns = "/login")
@WebServlet("/interface")
public class InterfaceDemo implements Servlet {

	private ServletConfig config=null;
	
	@Override
	public void destroy() {
		System.out.println("Destroy method called.");		
	}

	@Override
	public ServletConfig getServletConfig() {
		return config;
	}

	@Override
	public String getServletInfo() {
		return "Sample servlet Info";		
	}

	@Override
	public void init(ServletConfig config) throws ServletException {
		this.config=config;
		System.out.println("Servlet initialized");
	}

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
	
	res.setContentType("text/html");	
	PrintWriter out= res.getWriter();
	System.out.println("Service method called");
	out.print("<h1>Service Method Executed</h1>");
	InterfaceDemo n= new InterfaceDemo();
	n.destroy();
	
	
	}
	
	
	
}