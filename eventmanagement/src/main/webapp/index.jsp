<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Employee Management System</title>
</head>
<body bgcolor="red">
<center>
<h1>Employee Management system</h1>
<br>
<form action="success" modelAttribute="admin">
<div>
User ID:<input type="text" name="username"/>
<br>
<br>
Password:<input type="password" name="password"/>
<br>
<br>
</center>
<p align="center" font size="20"><input type="submit" name="submit" value="Login"/></p>
</div>
</form>
</center>
</body>
</html>