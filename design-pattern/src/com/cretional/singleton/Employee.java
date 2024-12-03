package com.cretional.singleton;

import java.io.Serializable;

public class Employee implements Serializable, Cloneable{
	//Eger way
//	private static Employee employee=new Employee();
	
	//Lazy Way
	private static Employee employee;
	
	private Employee(){
		//we are restricting creating multiple object through Reflection API. 
		if(employee!=null) {
			throw new RuntimeException("you are trying to break sigleton pattern");
		}
		
	}
	public static Employee getEmployee() {
		
		if(employee==null) {
			employee = new Employee();
		}
		
		return employee;
	}
	
	
	//We can restrict creating multiple object through Serialization
	public Object readResolve() {
		return employee;
	}
	
	
	//here we are restricting creating multiple objects through Cloneable
	@Override
	public Object clone() {
		return employee;
	}
}
