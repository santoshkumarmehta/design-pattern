package com.structural.adapter;

public class ChargerAndroid implements AndroidCharger{
	
	

	public ChargerAndroid() {
		super();
	}

	@Override
	public void androidCharger() {
		
		System.out.println("Android phone is charging.");
	}

}
