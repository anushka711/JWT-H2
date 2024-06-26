package com.example.jwt.payload.response;

import java.util.List;

public class UserinfoResponse {
	Long id;
	String username;
	String email;
	List<String> roles;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public List<String> getRoles() {
		return roles;
	}

	public void setRoles(List<String> roles) {
		this.roles = roles;
	}

	public UserinfoResponse(Long id, String username, String email, List<String> roles) {
		super();
		this.id = id;
		this.username = username;
		this.email = email;
		this.roles = roles;
	}

	public UserinfoResponse() {
		super();
	}

	@Override
	public String toString() {
		return "UserinfoResponse [id=" + id + ", username=" + username + ", email=" + email + ", roles=" + roles + "]";
	}

}
