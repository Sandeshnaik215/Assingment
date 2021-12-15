<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Log-in</title>
</head>
<body>
<fieldset>
<legend spellcheck="true"">Employee Login Form</legend>
<form action="./login1" method="post">
<table spellcheck="true">
<tr><td><label>FirstName</label></td><td><input type="text" name="fname" spellcheck="true" placeholder="Enter Your FirstName"></td></tr>
<tr><td><label>LastName</label></td><td><input type="text" name="lname" spellcheck="true" placeholder="Enter Your LastName"></td></tr>
<tr><td><label>Age</label></td><td><input type="number" name="age" placeholder="Enter Your Age"></td></tr>
<tr><td><label>Email</label></td><td><input type="email" name="email" placeholder="Enter Your Email"></td></tr>
<tr><td><label>Phone No.</label></td><td><input type="nubmer" name="phone" placeholder="Enter Your Number"></td></tr><br>
<tr><td><label>Address</label></td><td><input type="address" name="add" placeholder="Enter Your Address"></td></tr><br>
<tr><td><label>Gender</label></td><td><input type="radio" name="g" value="male">Male<input type="radio" name="g" value="female">Female</td></tr><br>
<tr><td><input type="submit" value="Submit"></td></tr>
</table>
</form>
</fieldset>
<a href="http://localhost:8080/mvc/login4">click</a>
</body>
</html> 