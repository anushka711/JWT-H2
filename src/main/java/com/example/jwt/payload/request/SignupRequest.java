package com.example.jwt.payload.request;

import java.util.List;

public class SignupRequest {

	String username;
	String password;
	String email;
	List<String> role;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public SignupRequest(String username, String password, String email, List<String> role) {
		super();
		this.username = username;
		this.password = password;
		this.email = email;
		this.role = role;
	}

	public SignupRequest() {
		super();
	}

	public List<String> getRole() {
		return role;
	}

	public void setRole(List<String> role) {
		this.role = role;
	}

	@Override
	public String toString() {
		return "SignupRequest [username=" + username + ", password=" + password + ", email=" + email + ", role=" + role
				+ "]";
	}

}
