<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <% String fname=(String)request.getParameter("fname"); %>
    <% String lname=(String)request.getParameter("lname"); %>
    <% String age=(String)request.getParameter("age"); %>
    <% String email=(String)request.getParameter("email"); %>
    <% String phone=(String)request.getParameter("phone"); %>
    <% String add=(String)request.getParameter("add"); %>
    <% String g=(String)request.getParameter("g"); %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<fieldset>
<legend><%=fname %>'s Details</legend>
<form action="./login1">
<table>
<tr><td><label>Name</label></td><td> <%=" : "+fname +" "+lname %></td></tr>
<td><label>Age</label></td><td><%=" : "+age %></td></tr>
<tr><td><label>Email</label></td><td><%=" : "+email %></td></tr>
<tr><td><label>Phone No</label></td><td><%=" : "+phone %></td></tr>
<tr><td><label>Address</label> </td><td><%=" : "+add %></td></tr>
<tr><td><label>Gender</label></td><td><%=" : "+g %></td></tr>

<tr><td><input type="submit" value="Back"></td></tr>
</table>
</form>
</fieldset>
<a href="http://localhost:8080/mvc/login4">click</a>
</body>
</html>