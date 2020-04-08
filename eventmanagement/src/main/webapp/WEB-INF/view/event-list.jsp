<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false" %>
 <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Event List</title>
</head>
<body bgcolor="skyblue">

<h1>EVENT Management System</h1>

<h3>EVENT LIST</h3>
<div>
<input type="button" value="Add Event" onclick="window.location.href='addEvent';return false;" class="add-button"/>
</div>
<br>
<table border="1">
	    <tr>
		   <td>Event_ID</td>
		   <td>Event Name</td>
		   <td>Contact number</td>
		   <td>event_location</td>
		   <td>event_Unit</td>
		   <td>event_title</td>
		   <td>eventDate</td>
	       <td>amount</td>
	       <td>Action</td>
		</tr>
		<c:forEach var="tempEvent" items="${event}">
		<c:url var="updateLink" value="/employee/updateEvent">
				<c:param name="eventId" value="${tempEvent.id}"></c:param>
		</c:url>
		<c:url var="deleteLink" value="/event/deleteEvent">
				<c:param name="eventId" value="${tempEvent.id}"></c:param>
			</c:url>
			<tr>
				<td>${tempEvent.id}</td>
				<td>${tempEvent.eventName}</td>
				<td>${tempEvent.contact}</td>
				<td>${tempEvent.eventlocation}</td>
				<td>${tempEvent.eu}</td>
				<td>${tempEvent.event_title}</td>
				<td>${tempEvent.evd}</td>
				<td>${tempEvent.amount}</td>
				<td><a href="${updateLink}">Update</a>|
				<a href="${deleteLink}" onclick="if(!(confirm('Are you sure to delete'))) return false">Delete</a></td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>