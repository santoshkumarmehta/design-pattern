package com.structural.adapter;

public class Demo {

	public static void main(String[] args) {
		System.out.println("Program started..");
		
		AppleCharger appleCharger= new AdapterCharger(new ChargerAndroid());
		ApplePhone applePhone= new ApplePhone(appleCharger);
		applePhone.chargePhone();
		
	}

}
