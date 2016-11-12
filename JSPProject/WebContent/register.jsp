<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<jsp:useBean id="user" class="org.thomas.java.dto.User">
		<jsp:setProperty property="*" name="user" />		
	</jsp:useBean>
	
	
	Hello <jsp:getProperty property="userId" name="user"/><br>
	User Name: <jsp:getProperty property="userName" name="user"/><br>
	Address Line 1: <jsp:getProperty property="userAdd1" name="user"/><br>
	Address Line 2: <jsp:getProperty property="userAdd2" name="user"/><br>
	City: <jsp:getProperty property="userCity" name="user"/><br>
	Country: <jsp:getProperty property="userCountry" name="user"/><br>
	Postal Code: <jsp:getProperty property="userPostalCode" name="user"/><br>
	
	
</body>
</html>