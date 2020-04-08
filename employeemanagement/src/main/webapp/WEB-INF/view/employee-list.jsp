<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false" %>
 <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Employee List</title>

<style>
body{
background-color:honeydew;
}
#customers {
  font-family: "Trebuchet MS", Arial, Helvetica, sans-serif;
  border-collapse: collapse;
  width: 100%;
}

#customers td, #customers th {
  border: 1px solid #ddd;
  padding: 8px;
}

#customers tr:nth-child(even){background-color: #f2f2f2;}

#customers tr:hover {background-color: #ddd;}

#customers tr:nth-child(1) {
  padding-top: 12px;
  padding-bottom: 12px;
  text-align: left;
  background-color: cadetblue;
  color: white;
}

input[type=button] {
  background-color: green;
  border: none;
  color: white;
  padding: 15px 32px;
  text-align: center;
  text-decoration: none;
  display: inline-block;
  font-size: 16px;
  margin: 4px 2px;
  cursor: pointer;
  transition-duration: 0.4s;
  cursor: pointer;
  box-shadow: 0 8px 16px 0 rgba(0,0,0,0.2), 0 6px 20px 0 rgba(0,0,0,0.19);
}
input[type=button]:hover {
  background-color: darkgreen;
  color: white;
}
h1{
background-color:white;
text-align: center;
font-family: Arial;
font-size: 30px;
padding: 20px
}
h3{
font-family: Arial;
font-size: 24px;
}

</style>
</head>
<body>

<h1>Employee Management System</h1>

<h3>Employee List</h3>
<div>
<input type="button" value="Add Employee" onclick="window.location.href='addEmployee';return false;" class="add-button"/>
</div>
<br>
<table id="customers">
	    <tr>
		   <td>Employee_ID</td>
		   <td>First Name</td>
		   <td>Last Name</td>
		   <td>Email_ID</td>
		   <td>Contact number</td>
		   <td>Gender</td>
	       <td>Age</td>
		   <td>Job_location</td>
		   <td>Business_Unit</td>
		   <td>Project_ID</td>
		   <td>Job_title</td>
		   <td>DateOfJoining</td>
	       <td>Salary</td>
	       <td>Action</td>
		</tr>
		<c:forEach var="tempEmployees" items="${employees}">
		<c:url var="updateLink" value="/employee/updateEmployee">
				<c:param name="employeeId" value="${tempEmployees.id}"></c:param>
		</c:url>
		<c:url var="deleteLink" value="/employee/deleteEmployee">
				<c:param name="employeeId" value="${tempEmployees.id}"></c:param>
			</c:url>
			<tr>
				<td>${tempEmployees.id}</td>
				<td>${tempEmployees.firstName}</td>
				<td>${tempEmployees.lastName}</td>
				<td>${tempEmployees.email}</td>
				<td>${tempEmployees.contact}</td>
				<td>${tempEmployees.gender}</td>
				<td>${tempEmployees.age}</td>
				<td>${tempEmployees.location}</td>
				<td>${tempEmployees.bu}</td>
				<td>${tempEmployees.projectId}</td>
				<td>${tempEmployees.job_title}</td>
				<td>${tempEmployees.doj}</td>
				<td>${tempEmployees.salary}</td>
				<td><a href="${updateLink}">Update</a>|
				<a href="${deleteLink}" onclick="if(!(confirm('Are you sure to delete'))) return false">Delete</a></td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>