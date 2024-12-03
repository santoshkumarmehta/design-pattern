package com.cretional.factory;

public class UserClient {

	public static void main(String[] args) {
		
		User user=UserFactory.getUser("Java Developer");
		System.out.println(user.getSalary());
		
		User user1=UserFactory.getUser("Web Developer");
		System.out.println(user1.getSalary());
	}

}
