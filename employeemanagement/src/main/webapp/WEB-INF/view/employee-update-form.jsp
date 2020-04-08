<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false" %>
 <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Update employee list</title>
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

input[type=submit] {
  background-color: green;
  border: none;
  color: white;
  padding: 12px 40px;
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
input[type=submit]:hover {
  background-color: darkgreen;
  color: white;
}

a {
  background-color: green;
  border: none;
  color: white;
  padding: 8px 32px;
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
a:hover {
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
<body bgcolor="orange">

<h1>Employee Management System</h1>

<h3>Update Employee</h3>
<form:form action="saveEmployee" modelAttribute="employee" method="POST" >
		<table id="customers">
			<tbody>
			<tr>
					<td><label>Employee_ID:</label></td>
					<td><form:input path="id" /></td>
				</tr>
				<tr>
					<td><label>First Name:</label></td>
					<td><form:input path="firstName" /></td>
				</tr>
				<tr>
					<td><label>Last Name:</label></td>
					<td><form:input path="lastName" /></td>
				</tr>
				<tr>
					<td><label>Email_ID:</label></td>
					<td><form:input path="email" /></td>
				</tr>
				<tr>
					<td><label>Contact number:</label></td>
					<td><form:input path="contact" /></td>
				</tr>
				<tr>
					<td><label>Gender:</label></td>
					<td><form:input path="gender" /></td>
				</tr>
				<tr>
					<td><label>Age:</label></td>
					<td><form:input path="age" /></td>
				</tr>
				<tr>
					<td><label>Location:</label></td>
					<td><form:input path="location" /></td>
				</tr>
				<tr>
					<td><label>Business Unit:</label></td>
					<td><form:input path="bu" /></td>
				</tr>
				<tr>
					<td><label>Project_ID:</label></td>
					<td><form:input path="projectId" /></td>
				</tr>
				<tr>
					<td><label>Job_title:</label></td>
					<td><form:input path="job_title" /></td>
				</tr>
				<tr>
					<td><label>DateOfJoining:</label></td>
					<td><form:input path="doj" type="date"/></td>
				</tr>
				<tr>
					<td><label>Salary:</label></td>
					<td><form:input path="salary" /></td>
				</tr>
				
				<!--  <tr>
					<td><input type="submit" value="Save" class="save"></td>
				</tr>-->
			</tbody>
		</table><br>
		<center><input type="submit" value="Save" class="save"></center>
	</form:form>
	<p>
		<a href="http://localhost:8080/EmployeeManagementSystem/employee/list">Back to Employee
			List</a>
	</p>
</body>
</html>