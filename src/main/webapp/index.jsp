<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<style>
form
{
background-color: aqua;
width:550px;
border-radius:2em;
}
body{
background-color: lime;
}
</style>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<center>
<body>
<h1>Insertion using Hibernate</h1>
<form action="AddServlet" method="get">

<br>
Student Id:<input type="text" name="t1"/><br>
<br>
Student name:<input type="text" name="t2"/><br>
<br>
Student Department:<input type="text" name="t3"/><br>
<br>
<input type="submit" value="INSERT"/>
</form>
<h1>
Retrieve Data</h1>
<form action="ReadServlet" method="get">
<br>

<input type="submit" value="GetData"/>
<br>
</form>
<h1>Update Data</h1>
<form action="UpdateServlet" method="get">
<br>

Student Id:<input type="text" name="t1"/><br>
<br>
Student name:<input type="text" name="t2"/><br>
<br>
Student Department:<input type="text" name="t3"/><br>
<br>
<input type="submit" value="UPDATE"/>
</form>
<h1>Deletion</h1>

<form action="DeletionServlet" method="get">
<br>

Student Id:<input type="text" name="t1"/><br>
<br>
<input type="submit" value="Delete"/>
</form>
</center>
</body>
</body>
</html>