package com.cretional.abstract_design;

public class FactoryClient {

	public static void main(String[] args) {
		
		Employee e1=EmployeeFactory.getEmployee(new WebDeveloperFactory());
		System.out.println(e1.getName());
		
		Employee e2=EmployeeFactory.getEmployee(new AndroidDeveloperFactory());
		System.out.println(e2.getName());
		
		Employee m1=EmployeeFactory.getEmployee(new ManagerFactory());
		System.out.println(m1.getName());
	}

}
