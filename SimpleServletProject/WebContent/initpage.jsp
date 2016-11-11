<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%!
// overriding init to set default value to session
public void jspInit() {	
	String defaultUser = getServletConfig().getInitParameter("defaultuser");
	ServletContext context = getServletContext();
	context.setAttribute("defaultuser", defaultUser);
}
%>
Default User from Servlet Config:<b><%=getServletConfig().getInitParameter("defaultuser") %></b><br>
Default User from Servlet Context:<b><%=getServletContext().getAttribute("defaultuser") %></b>

</body>
</html>