package com.cretional.builder;

public class MainRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		User user=new User.UserBuilder()
				.setUserEmail("santosh.k@gmail.com")
				.setUserId(101)
				.setUserName("santosh").build();
		System.out.println(user.toString());

	}

}
