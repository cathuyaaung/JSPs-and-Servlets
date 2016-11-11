package org.thomas.java.service;

public class LoginService {
	public static boolean authenticate(String username, String password) {
		if (username.equals("thuya") && password.equals("ygmfromthuya")) {
			System.out.println("Login successful");
			return true;
		}
		return false;
	}
}
