package com.cretional.factory;

public class JavaDeveloper implements User{

	@Override
	public int getSalary() {
		System.out.println("Java Developer");
		return 50000;
	}

}
