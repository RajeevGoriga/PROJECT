<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!doctype html>
<html>
<head>
<title>Employee Management System</title>

<style>
body{
background-color:cadetblue;
background-size: cover;
}
h1{
background-color:white;
text-align: center;
font-family: Arial;
font-size: 30px;
padding: 20px
}
h2{
font-family: Arial;
font-size: 24px;
}

.login{
position: absolute;
top: calc(50% - 75px);
left: calc(45% - 50px);
}

.login input[type=text]{
color: #ffffff;
width: 250px;
height: 30px;
background: transparent;
border: 1px solid rgba(255,255,255,0.6);
border-radius: 2px;
font-size: 16px;
font-weight: 400;
padding: 4px;
}
.login input[type=password]{
width: 250px;
height: 30px;
background: transparent;
border: 1px solid rgba(255,255,255,0.6);
border-radius: 2px;
margin-top: 10px;
font-size: 16px;
font-weight: 400;
padding: 4px;
}
.login input[type=submit]{
width: 262px;
height: 35px;
cursor: pointer;
border-radius: 2px;
color: #a18d6c;
font-size: 16px;
font-weight: 400;
margin-top: 10px;
font-size: 16px;
font-weight: 400;
padding: 4px;
}
.login input[type=submit]:hover {
  background-color: darkgreen;
  color: white;
}

::placeholder {
  color: white;
}

#p1,#p2{
font-size: 18px;
}

</style>

<script>

var user,pswd;
function validateName() {
var input;
input=document.forms["myform"]["username"].value;
if(input=="admin") {
   document.getElementById("p1").innerHTML="Username is valid";
   user=true;
}
else{
   document.getElementById("p1").innerHTML="Please enter a valid username!";
   user=false;
}
}

function validatePw() {
var password;
password=document.forms["myform"]["password"].value;
if(password=="admin123") {
	   document.getElementById("p2").innerHTML=" ";
	   pswd=true;
	}
	else {
	   document.getElementById("p2").innerHTML="Please enter a Valid Password!";
	   pswd=false;
}
}

function validate(){
if(user==true && pswd==true){
     alert("Login Successful");
     }
else{
     alert("Invalid Creditionals!");
     }
}

</script>

</head>
<body>
<h1>Employee Management System</h1>
<h2>Admin login</h2>
<form action="success" modelAttribute="admin" name="myform">
<div class="main"></div>
<div class="abc"></div>
<div class="header">

</div>
<br>
<div class="login">
<input type="text" placeholder="Username" name="username" onfocusout="validateName();"><br>
<p id="p1"></p>
<input type="password" placeholder="Password" name="password" 
onfocusout="validatePw();"><br>
<p id="p2"></p>
<input type="submit" value="Login" name="submit" onclick="validateAll();">
</div>
</form>
</body>
</html>
