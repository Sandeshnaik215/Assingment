<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <% String fname=(String)request.getParameter("fname"); %>
    <% String lname=(String)request.getParameter("lname"); %>
    <% String age=(String)request.getParameter("age"); %>
    <% String email=(String)request.getParameter("email"); %>
    <% String phone=(String)request.getParameter("phone"); %>
    <% String add=(String)request.getParameter("add"); %>
    <% String g=(String)request.getParameter("g"); %>
    
        <% String t=(String)request.getParameter("t"); %>
    <% String rr=(String)request.getParameter("rr"); %>
    <% String fever=(String)request.getParameter("f"); %>
    <% String d=(String)request.getParameter("d"); %>
    <% String cough=(String)request.getParameter("n"); %>
    <% String sore=(String)request.getParameter("sore"); %>
    <% String bod=(String)request.getParameter("body"); %>
      <% String none=(String)request.getParameter("none"); %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<fieldset>
<legend><%=fname %>'s Details</legend>
<form action="./login3">
<table>
<tr><td><label>Name</label></td><td> <%=" : "+fname%></td></tr>
<td><label>Age</label></td><td><%=" : "+age %></td></tr>
<tr><td><label>Email</label></td><td><%=" : "+email %></td></tr>
<tr><td><label>Phone No</label></td><td><%=" : "+phone %></td></tr>
<tr><td><label>Address</label> </td><td><%=" : "+add %></td></tr>
<tr><td><label>Gender</label></td><td><%=" : "+g %></td></tr>

</table>
</fieldset>
<fieldset>
<legend>Personal Details</legend>

<table>
<tr><td><label>Travell History</label> </td><td><%=" : "+t%></td></tr>
<tr><td><label>Contact with COVID-19 patient </label> </td><td><%=" : "+rr%></td></tr>
<tr><td><label>Fever,chills,sweating</label></td><td> <%=" : "+fever %></td></tr>
<td><label>Difficulty</label></td><td><%=" : "+d%></td></tr>
<tr><td><label>New or Worsening cough</label></td><td><%=" : "+cough %></td></tr>
<tr><td><label>Sore throat</label></td><td><%=" : "+sore %></td></tr>
<tr><td><label>Body aches</label> </td><td><%=" : "+bod%></td></tr>



<tr><td><input type="submit" value="Back"></td></tr>
</table>
</form>
</fieldset>
<a href="http://localhost:8080/mvc/login4">click</a>
</body>
</html>