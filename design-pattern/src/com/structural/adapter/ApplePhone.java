package com.structural.adapter;

public class ApplePhone {

	private AppleCharger charger;
	
	public ApplePhone(AppleCharger charger) {
		super();
		this.charger = charger;
	}

	public void chargePhone() {
		charger.chargePhone();
	}
	
	
}
