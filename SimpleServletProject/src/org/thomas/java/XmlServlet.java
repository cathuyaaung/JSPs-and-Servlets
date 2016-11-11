package org.thomas.java;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Servlet;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class XmlServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	// init() - servlet created
	// service() - new request to servlet
	// 
	@Override
	public void init() throws ServletException {
		super.init();
		System.out.println("XmlServlet init()");
	}

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		super.service(req, resp);
		System.out.println("XmlServlet service()");
	}
	
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) 
			throws ServletException, IOException {
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		String username = req.getParameter("username");
		String firstname = req.getParameter("firstname");
		String lastname = req.getParameter("lastname");
		out.printf("<br>Hello from GET %s %s %s", username, firstname, lastname);
		
		HttpSession session = req.getSession();
		ServletContext context  = req.getServletContext();
		
		if (username!="" && username !=null) {
			session.setAttribute("username", username);
			context.setAttribute("username", username);
		}	
		out.printf("<br>Saved in session: username: %s", session.getAttribute("username"));
		out.printf("<br>Saved in context: username: %s", context.getAttribute("username"));
		out.printf("<br>Saved in servlet config: username: %s", getServletConfig().getInitParameter("defaultname"));
		out.printf("<br>Saved in servlet config: username: %s", getInitParameter("defaultname"));
		System.out.println(getServletConfig().toString());
		
	}
	

	protected void doPost(HttpServletRequest req, HttpServletResponse resp) 
			throws ServletException, IOException {
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
