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
<legend spellcheck="true"">Personal Details</legend>
<form action="./form3">
<table spellcheck="true">
<tr><td><label>Name</label></td><td><input type="text" name="fname" spellcheck="true" placeholder="Enter Your FullName"></td></tr>

<tr><td><label>Age</label></td><td><input type="number" name="age" placeholder="Enter Your Age"></td></tr>
<tr><td><label>Email</label></td><td><input type="email" name="email" placeholder="Enter Your Email"></td></tr>
<tr><td><label>Phone No.</label></td><td><input type="nubmer" name="phone" placeholder="Enter Your Number"></td></tr><br>
<tr><td><label>Address</label></td><td><input type="address" name="add" placeholder="Enter Your Address"></td></tr><br>
<tr><td><label>Gender</label></td><td><input type="radio" name="g" value="male">Male<input type="radio" name="g" value="female">Female</td></tr><br>

</table>

</fieldset>
<fieldset>
<legend>Health detail's</legend>

<tr><td><label>Have you travelled internationally within the last 14 days?</label></td><td><input type="radio" name="t" value="yes">Yes<input type="radio" name="t" value="no">No </td></tr><br>
<tr><td><label>Have you had contact with anyone with confirmed COVID-19 in the last 14 days</label></td><td><input type="radio" name="rr" value="yes">Yes<input type="radio" name="rr" value="no">No <input type="radio" name="r" value="no">Unsure</td></tr><br>
<br>
<tr><td><label>Please check the box of each symptom you you are currently experiencing or have had in the last 14 days :</label></td></tr><br>

<tr><td><label>Fever,chills,sweating</label></td><td><input type="radio" name="f" value="yes">Yes<input type="radio" name="f" value="no">No </td></tr><br>
<tr><td><label>Defficulty breathing</label></td><td><input type="radio" name="d" value="yes">Yes<input type="radio" name="d" value="no">No </td></tr><br>
<tr><td><label>New or worsening cough</label></td><td><input type="radio" name="n" value="yes">Yes<input type="radio" name="n" value="no">No </td></tr><br>
<tr><td><label>Sore throat</label></td><td><input type="radio" name="sore" value="yes">Yes<input type="radio" name="sore" value="no">No </td></tr><br>
<tr><td><label>Body aches</label></td><td><input type="radio" name="body" value="yes">Yes<input type="radio" name="body" value="no">No </td></tr><br>
<tr><td><label>None of the above</label></td><td><input type="radio" name="none" value="yes">Yes</tr><br><br>

<tr><td><input type="submit" value="Submit"></td></tr>
</form>
</fieldset>
<a href="http://localhost:8080/mvc/login4">click</a>
</body>
</html> 