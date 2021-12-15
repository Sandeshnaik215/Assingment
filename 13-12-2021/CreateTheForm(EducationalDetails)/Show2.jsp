<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
      <% String fname=(String)request.getParameter("fname"); %>
     <% String sname=(String)request.getParameter("sname"); %>
    <% String pname=(String)request.getParameter("pname"); %>
      <% String dname=(String)request.getParameter("dname"); %>
    <% String ys=(String)request.getParameter("ys"); %>
    <% String yp=(String)request.getParameter("yp"); %>
    <% String yd=(String)request.getParameter("yd"); %>
    <% String ps=(String)request.getParameter("ps"); %>
    <% String pp=(String)request.getParameter("pp"); %>
    <% String pd=(String)request.getParameter("pd"); %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<fieldset>
<legend><%=fname %>'s Details</legend>
<form action="./login2">
<table>
<tr><td><label>Name</label></td><td> <%=" : "+fname %></td></tr>
<td><label>SSLC</label></td><td><%=" : Scored "+ps +"% in "+ys %></td></tr>
<tr><td><label>PUC</label></td><td><%=" : Scored "+pp +"% in "+yp%></td></tr>
<tr><td><label>Degree</label></td><td><%=" : Scored "+pd +"% in "+yd%></td></tr>


<tr><td><input type="submit" value="Back"></td></tr>
</table>
</form>
</fieldset>
<a href="http://localhost:8080/mvc/login4">click</a>
</body>
</html>