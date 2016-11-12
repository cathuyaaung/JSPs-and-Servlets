<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>User Registration</title>
</head>
<body>
	<h1>Login</h1>
	<form action="register.jsp" method="post">
	User ID: <input type="text" name="userId"><br>
	User Name: <input type="text" name="userName"><br>
	Address Line 1: <input type="text" name="userAdd1"><br>
	Address Line 2: <input type="text" name="userAdd2"><br>
	City: <input type="text" name="userCity"><br>
	Country: <input type="text" name="userCountry"><br>
	Postal Code: <input type="text" name="userPostalCode"><br>
	<input type="submit">
	</form>
</body>
</html>