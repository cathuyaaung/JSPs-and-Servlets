package org.thomas.java;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.thomas.java.service.LoginService;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String username = request.getParameter("username");
		String password = request.getParameter("password"); 
		System.out.printf("%s - %s", username, password);
		boolean result = LoginService.authenticate(username, password);
		System.out.println(result);
		
		if (result) {
			response.sendRedirect("./greeting.jsp");
			return;
		} else {
			response.sendRedirect("./login.jsp");
			return;
		}
	}

}
