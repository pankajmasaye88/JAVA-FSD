<%@page import="java.net.http.HttpClient.Redirect"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" errorPage="handle-error-page.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>JSP Implicit Objects</title>
</head>
<body>

	<%
	String responseCheck = request.getParameter("office");
	if (responseCheck != null) {
		response.setStatus(response.SC_MOVED_TEMPORARILY);
		response.setHeader("Location", "response-redirect.jsp?office=" + responseCheck);

	}

	String errorCheck = request.getParameter("error");
	if (errorCheck != null) {
		int x = 0;
		if (x == 0)
			throw new RuntimeException("Exception has been raised");
	}
	%>
	<%
	int serverPort = request.getServerPort();
	out.print("The server is running on post: " + serverPort+"<br>");
	out.print("Servlet page: " + config.getServletContext()+"<br>");
	out.print("Server info: " + application.getServerInfo()+"<br>");

	String pagaName = page.toString();
	out.print("The name of a page is:" + pagaName);

	pageContext.setAttribute("userid", "Pankaj Masaye");
	out.print("Get attribute from page Context: " + pageContext.getAttribute("userid") + "<br>");
	%>

	<a href="index.jsp?office=head-office">Show usage of response
		object</a>
	<a href="index.jsp?error=1">Show usage of error object</a>

	<%
	if (response.containsHeader("Location")) {
		out.print("Current Location is : " + response.getHeader("Location"));
	}
	%>


</body>
</html>