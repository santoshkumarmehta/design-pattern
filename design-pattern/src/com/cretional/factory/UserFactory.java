package com.cretional.factory;

public class UserFactory {
	
	public static User getUser(String userType) {
		
		if(userType.equalsIgnoreCase("Java Developer")) {
			return new JavaDeveloper();
		}
		else if(userType.equalsIgnoreCase("Web Developer")) {
			return new WebDeveloper();
		}else {
			return null;	
		}
	}

}
