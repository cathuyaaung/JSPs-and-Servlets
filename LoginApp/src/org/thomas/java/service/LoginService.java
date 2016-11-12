package org.thomas.java.service;

import java.util.HashMap;

import org.thomas.java.dto.User;

public class LoginService {
	
	private static HashMap<String, String> users = new HashMap<>();
	
	static {
		users.put("johndoe", "John Doe");
		users.put("thuya", "Thomas Thuya Aung");
		users.put("lizzie", "Queen Elizabeth II");
	}
	
	public static boolean authenticate(String username, String password) {
		if (username.equals("thuya") && password.equals("xxx")) {
			System.out.println("Login successful");
			return true;
		}
		return false;
	}
	
	public static User getUser(String username) {	
		User user = new User();
		user.setUsername(username);
		user.setFullname(users.get(username));
		System.out.println(username);
		System.out.println(users.get(username));
		System.out.println("getUser " + user.getFullname());
		return user;
	}
	
}
