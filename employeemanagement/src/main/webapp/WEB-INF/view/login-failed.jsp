<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login failed</title>
<style>
.center {
  padding: 70px 0;
  text-align: center;
}
button {
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
button:hover {
  background-color: darkgreen;
  color: white;
}
</style>
<script>
function goBack() {
  window.history.back();
}
</script>
</head>
<body bgcolor="gainsboro">
<div class="center">
<h1>Login failed!!</h1>
<br>
<button onclick="goBack()">Go Back to Login Page</button>
</div>

<!--  <p><a href="http://localhost:8080/EmployeeManagementSystem/">Back to login page</a></p>-->
</body>
</html>
