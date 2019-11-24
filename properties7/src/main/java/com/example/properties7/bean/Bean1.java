package com.example.properties7.bean;

public class Bean1 {

	private String username;
	private String password;

	public Bean1(String username, String password) {
		super();
		this.username = username;
		this.password = password;
	}

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

	@Override
	public String toString() {
		return "Bean1 [username=" + username + ", password=" + password + "]";
	}
}
