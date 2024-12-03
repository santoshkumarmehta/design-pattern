package com.cretional.abstract_design;

public class ManagerFactory extends EmployeeAbstractFactory {

	@Override
	public Employee getEmployee() {
		
		return new Manager();
	}

}
