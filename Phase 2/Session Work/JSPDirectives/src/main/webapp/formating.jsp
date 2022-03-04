<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
 <%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>



<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<c:set var="today" value="<%= new Date() %>"></c:set>
Time: <fmt:formatDate value="${today }" type="time"/><br>

Date: <fmt:formatDate value="${today }" type="date"/><br>

Both Default: <fmt:formatDate value="${today }" type="both"/><br>

Both Long: <fmt:formatDate value="${today }" type="both" dateStyle="long"/><br>

Both Short: <fmt:formatDate value="${today }" type="both" dateStyle="short"/><br>

</body>
</html>