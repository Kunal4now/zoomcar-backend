package com.zoomcar.model;

import java.util.List;

public class UserDTO {
	private String userId;
	private String name;
	private String password;
	private List<String> roles;
	private Integer balance;
	
	public UserDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public UserDTO(String userId, String name, String password, List<String> roles, Integer balance) {
		super();
		this.userId = userId;
		this.name = name;
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
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
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
		return "User [userId=" + userId + ", name=" + name + ", password=" + password + ", roles=" + roles
				+ ", balance=" + balance + "]";
	}
}


