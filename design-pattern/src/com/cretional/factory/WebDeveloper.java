package com.cretional.factory;

public class WebDeveloper implements User{

	@Override
	public int getSalary() {
		System.out.println("Web Developer");
		return 4000;
	}

}
