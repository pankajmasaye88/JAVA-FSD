<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<c:set var="input" value="67"></c:set>
	<c:out value="${input}"></c:out>
<br>
	<c:set var="input1" value="${500*10}"></c:set>
	<c:out value="${input1}"></c:out>
<br>
	<c:choose>
		<c:when test="${input1>=4000}">
		Income is good
	</c:when>
		<c:otherwise>
		Not good
	</c:otherwise>
	</c:choose>
<br>
	<c:catch var="error">
		<%
		int x = 10 / 0;
		%>
	</c:catch>
	<c:if test="${error!=null}"> 
The exception is -> ${error}
<br>
Message: ${error.message}
</c:if>

</body>
</html>