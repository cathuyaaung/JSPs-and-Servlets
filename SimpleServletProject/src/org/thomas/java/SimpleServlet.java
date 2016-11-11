package org.thomas.java;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(description = "A simple servlet", urlPatterns = { "/SimpleServletPath3" },
		initParams={@WebInitParam(name="defaultuser", value="johndoe")})

public class SimpleServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Hello from GET method");
		response.getWriter().append("Served at: ").append(request.getContextPath());
		PrintWriter writer = response.getWriter();
		
		writer.println("<h1>Hello, I'm in HTML 3.</h1>");
		writer.println(getServletConfig().getInitParameter("defaultuser"));
		writer.println(getInitParameter("defaultuser"));
	}

}
