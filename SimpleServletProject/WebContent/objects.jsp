<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
	String username = request.getParameter("un");
	if(username!=null){
		session.setAttribute("idsession", username);
		application.setAttribute("idapplication", username);
		//pageContext.setAttribute("idpagecontext", username);
		pageContext.setAttribute("idpagecontext", username, pageContext.APPLICATION_SCOPE);
	}
	String firstname = request.getParameter("fn");
	String lastname = request.getParameter("ln");
	
	
	
%>

Username: <b><%=username %></b><br>
First Name: <b><%=firstname %></b><br>
Last Name: <b><%=lastname %></b><br>
Username Session: <b><%=session.getAttribute("idsession") %></b><br>
Username Application: <b><%=application.getAttribute("idapplication") %></b><br>
Username pageContext: <b><%=pageContext.getAttribute("idpagecontext", pageContext.APPLICATION_SCOPE) %></b><br>
</body>
</html>