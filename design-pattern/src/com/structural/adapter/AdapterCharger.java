package com.structural.adapter;

public class AdapterCharger implements AppleCharger{
	
	private ChargerAndroid chargerAndroid;
	
	

	public AdapterCharger(ChargerAndroid chargerAndroid) {
		super();
		this.chargerAndroid = chargerAndroid;
	}



	@Override
	public void chargePhone() {
		chargerAndroid.androidCharger();
		System.out.println("Charging phone with adapter");
		
	}

}
