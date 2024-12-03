package com.behaviourl.iterator;

public class User {
	
	private String userName;
	private int userId;
	
	public User(String string, int i) {
		this.userId=i;
		this.userName=string;
	}

	@Override
	public String toString() {
		return "User [userName=" + userName + ", userId=" + userId + "]";
	}
	
	
}
