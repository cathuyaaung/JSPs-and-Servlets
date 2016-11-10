package org.thomas.java;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class XmlServlet extends HttpServlet {

	protected void doGet(HttpServletRequest req, HttpServletResponse resp) 
			throws ServletException, IOException {
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		
		String username = req.getParameter("username");
		String firstname = req.getParameter("firstname");
		String lastname = req.getParameter("lastname");
		
		out.printf("Hello from GET %s %s %s", username, firstname, lastname);
	}
	

	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		
		String username = req.getParameter("username");
		String firstname = req.getParameter("firstname");
		String lastname = req.getParameter("lastname");
		String prof = req.getParameter("prof");
//		String location = req.getParameter("location");
		String[] location = req.getParameterValues("location");
		
		out.printf("Hello from POST %s %s %s %s ", username, firstname, lastname, prof);
		out.printf("Locations ");
		for (String string : location) {
			out.printf("%s ", string);
		}
		
	}
	
	
}
