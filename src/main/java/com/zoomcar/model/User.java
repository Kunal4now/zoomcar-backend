package com.zoomcar.model;

import java.util.List;

public class User {
	private String userId;
	private String username;
	private String password;
	private List<String> roles;
	private Integer balance;
	
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public User(String userId, String username, String password, List<String> roles, Integer balance) {
		super();
		this.userId = userId;
		this.username = username;
		this.password = password;
		this.roles = roles;
		this.balance = balance;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return username;
	}

	public void setUserName(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public List<String> getRoles() {
		return roles;
	}

	public void setRoles(List<String> roles) {
		this.roles = roles;
	}

	public Integer getBalance() {
		return balance;
	}

	public void setBalance(Integer balance) {
		this.balance = balance;
	}

	@Override
	public String toString() {
		return "User [userId=" + userId + ", username=" + username + ", password=" + password + ", roles=" + roles
				+ ", balance=" + balance + "]";
	}
}
