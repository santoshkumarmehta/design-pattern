package com.cretional.builder;


public class User {

	private int userId;
	private String userName;
	private String userEmail;
	
	private User(UserBuilder builder) {
		this.userEmail=builder.userEmail;
		this.userId=builder.userId;
		this.userName=builder.userName;
	}

	public int getUserId() {
		return userId;
	}

	public String getUserName() {
		return userName;
	}

	public String getUserEmail() {
		return userEmail;
	}
	
	
	
	@Override
	public String toString() {
		return "User [userId=" + userId + ", userName=" + userName + ", userEmail=" + userEmail + "]";
	}



	static class UserBuilder{
		int userId;
		String userName;
		String userEmail;
		
		public UserBuilder() {
			
		}

		public UserBuilder setUserId(int userId) {
			this.userId = userId;
			return this;
		}

		public UserBuilder setUserName(String userName) {
			this.userName = userName;
			return this;
		}

		public UserBuilder setUserEmail(String userEmail) {
			this.userEmail = userEmail;
			return this;
		}

		public User build() {
			User user = new User(this);
			return user;
		}
		
		
	}
}
