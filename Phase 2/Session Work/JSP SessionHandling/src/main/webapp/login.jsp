<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%
	String name= request.getParameter("name");	
	String pass= request.getParameter("pass");
	
	if(name== null || name.equals("") || pass==null || pass.equals(""))
	{
		response.sendRedirect("index.jsp?error=1");	
	}
	else
	{
		session.setAttribute("name", name);
		response.sendRedirect("dashboard.jsp");
	}
%>


</body>
</html>