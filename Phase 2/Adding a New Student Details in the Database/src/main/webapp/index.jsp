<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Adding a New Student Details in the Database</title>
</head>
<body>
<h3>Welcome to Project 3</h3><br>
<h1 style="color: purple">Adding a New Student Details in the Database</h1>
<br><br>


<h3 align="right" style="color: blue"><a href="list">Click here for stored details</a></h3>
<br><br>

<table>
<tr>
<h3 align="center" style="color: blue">Enter Product Details</h3>
<form action="add" method="post">
<h3 align="center">Student First Name: <input type="text" name="fname" placeholder="Enter Student FName" maxlength="50">
</h3>
<h3 align="center">Student Last Name: <input type="text" name="lname" placeholder="Enter Student LName" maxlength="50">
</h3>
<h3 align="center">Student Email: <input type="text" name="email" placeholder="Enter Student Email" maxlength="50">
</h3>
<h3 align="center">Student Password: <input type="password" name="pass" placeholder="Enter Password" maxlength="50">
</h3>
<h2 align="center"><input type="submit" value="Submit Student Details" style="color: blue ">
</h2><br><br>
</form>
</tr>
</table>

</body>
</html>