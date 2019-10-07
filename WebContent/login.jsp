<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login Page</title>
</head>
<body>
<form action="LoginRegister" method="post">
<table style="background-color: #7FFF00; margin-left:50px ; margin-right:50px ;">

<tr>
<td><h3 style="background-color:red">${message}</h3>
<h3 style="background-color:greed">${succesmessage}</h3>
</td>
<td></td>
</tr>
<tr>
<td><h3 style="color:Crimson">Login Page!!!</h3> </td>
<td></td>
</tr>

<tr><td> UserName : </td><td><input type ="text" name="name"></td></tr>
<tr><td> Password : </td><td><input type ="password" name="password1"></td></tr>
<tr><td> <input type="submit" name="submit" value="login"></td>
<td><a href="register.jsp">Registration</a></td></tr>

</table>
</form>
</body>
</html>