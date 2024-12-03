package com.structural.adapter;

public class ChargerApp implements AppleCharger{

	@Override
	public void chargePhone() {
		System.out.println("Your Apple phone is charging..");
	}

	
}
