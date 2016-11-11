<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>welcome to jsp</h1>
	
	
	<% 
		String str = "123";
		out.println(str);	
		out.println(add(1,2));
	%>
	
	<%!
		public int add(int a, int b){
			return a+b;
		}
	%>

	<%
		for(int i=0; i<5; i++){
			out.print("<br>"+i);
	%>
		<h2>Header <%=i%></h2>
	<%
		}
	
	%>	
	
	
	
</body>
</html>