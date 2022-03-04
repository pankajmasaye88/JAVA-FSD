<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="java.util.Date" info="This is my first JSp Page" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%= "Today's date "+new Date()%>
<br>
<h2>Use Expression language</h2>
${'Helo World'}


<h1>Login page</h1>

<%@include file="login.jsp" %>

</body>
</html>