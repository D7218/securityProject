package com.PracticeThink.entity;

import jakarta.persistence.Entity;


public class User {

	private String userName;
	private String password;
	private String email;

	public String getUserName() {
		return userName;
	}

	public void setUseddrName(String userName) {
		this.userName = userName;
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

	public User(String userName, String password, String email) {
		this.userName = userName;
		this.password = password;
		this.email = email;
	}

	@Override
	public String toString() {
		return "User{" +
				"userName='" + userName + '\'' +
				", password='" + password + '\'' +
				", email='" + email + '\'' +
				'}';
	}
}

