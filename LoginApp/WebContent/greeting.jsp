<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ page import="org.thomas.java.dto.User" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
	//User user = (User) session.getAttribute("user");
	//User user = (User) request.getAttribute("user");
	String username = request.getParameter("username");
	String password = request.getParameter("password");	
%>
	<h1>Welcome from request object:<%=username %> - <%=password %></h1>
	
<jsp:useBean id="user" class="org.thomas.java.dto.User" scope="request"></jsp:useBean>

	<h1>Welcome from request object:<%=user.getFullname() %></h1>
	
	<h2>Hello <jsp:getProperty property="fullname" name="user"/></h2>
	
	<p>User name from request parameters: ${param.username}</p>
	<p>Password from request parameters: ${param.password}</p>

<jsp:setProperty property="username" name="user" value="newuser"/>

</body>
</html>