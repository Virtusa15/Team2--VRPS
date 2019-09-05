<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<style>
body {font-family: Arial, Helvetica, sans-serif;
background-image: linear-gradient(rgba(0,0,0,0.69),rgba(0,0,0,0.69)),url(b7.jpg);
color: white;
background-position:center;
background-size: cover;
overflow-x: hidden;
height:100vh;
</style>
<title>Insert title here</title>
</head>
<body>
<div class="Registration" align="center">

<i class="fa fa-user" aria-hidden="true"></i>

Login User
<form method='post' action="UserLogin">

<p>Username
<input type="text" name="Username" placeholder="Username"><br><p>


<p>Password
<input type="password" name="Password" placeholder="password"><br></p>

<input type="Submit" name="Login" value="Login" >
</form>


</div>
</body>
</html>