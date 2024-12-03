package com.cretional.abstract_design;

public class WebDeveloperFactory extends EmployeeAbstractFactory{

	@Override
	public Employee getEmployee() {
		// TODO Auto-generated method stub
		return new WebDeveloper();
	}

}
