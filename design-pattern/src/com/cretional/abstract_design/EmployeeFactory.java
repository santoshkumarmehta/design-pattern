package com.cretional.abstract_design;

public class EmployeeFactory {

	public static Employee getEmployee(EmployeeAbstractFactory abstractFactory) {
		
		return abstractFactory.getEmployee();
	}

}
