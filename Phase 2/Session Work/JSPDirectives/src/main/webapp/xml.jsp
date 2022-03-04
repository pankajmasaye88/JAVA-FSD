<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="x" uri="http://java.sun.com/jsp/jstl/xml"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
   
<!DOCTYPE html>

<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<c:set var="books">
	<books>
		<book>
			<name>Java-complete Reference</name>
			<author>Mac Grow Hill</author>
		</book>
		<book>
		<name>ANSI C</name>
		<author>Balaguruswami</author>
		</book>
	</books>
</c:set>
			
<x:parse xml="${books }" var="bookarray"></x:parse>
<h2>Lets Print</h2><hr>
<x:out select="$bookarray/books/book[1]/name"/><br>
<x:out select="$bookarray/books/book[2]/author"/><br>
</body>
</html>