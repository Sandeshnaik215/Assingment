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
<legend spellcheck="true"">Education Details</legend>
<form action="./form2">
<table spellcheck="true">
<tr><td><label>Name</label></td><td><input type="text" name="fname" spellcheck="true" placeholder="Enter Your Name"></td></tr>
<table>
  <tr>
    <th>Course</th>
    <th >Name</th>
    <th  >YOP</th>
    <th  >Percentage</th>
  </tr>
  <tr>
    <td >SSLC</td>
    <td ><input  type="text" name="sname" spellcheck="true" placeholder="Enter School Name"> </td>
     <td ><input  type="text" name="ys" spellcheck="true" placeholder="Enter Year Of Passout"> </td>
     <td ><input  type="text" name="ps" spellcheck="true" placeholder="Enter Perc in __%"> </td>
  </tr>
    <tr>
    <td >PUC</td>
    <td ><input  type="text" name="pname" spellcheck="true" placeholder="Enter Collage Name"> </td>
     <td ><input  type="text" name="yp" spellcheck="true" placeholder="Enter Year Of Passout"> </td>
     <td ><input  type="text" name="pp" spellcheck="true" placeholder="Enter Perc in __%"> </td>
  </tr>
    <tr>
    <td >Degree</td>
    <td ><input  type="text" name="dname" spellcheck="true" placeholder="Enter University Name"> </td>
     <td ><input  type="text" name="yd" spellcheck="true" placeholder="Enter Year Of Passout"> </td>
     <td ><input  type="text" name="pd" spellcheck="true" placeholder="Enter Perc in __%"> </td>
  </tr>
  
</table>
<table><tr>60% throughout academics<input type="radio" name="r" value="yes">Yes<input type="radio" name="r" value="no">No </tr></table>



<tr><td><input type="submit" value="Submit"></td></tr>
</table>
</form>
</fieldset>
<a href="http://localhost:8080/mvc/login4">click</a>
</body>
</html> 