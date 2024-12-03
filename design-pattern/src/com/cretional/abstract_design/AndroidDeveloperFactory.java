package com.cretional.abstract_design;

public class AndroidDeveloperFactory extends EmployeeAbstractFactory{

	@Override
	public Employee getEmployee() {
		// TODO Auto-generated method stub
		return new AndroidDeveloper();
	}

}
