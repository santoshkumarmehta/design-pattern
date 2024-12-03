package com.behaviourl.observer;

public class Subscriber implements Observer{

	String name;
	
	public Subscriber(String name) {
		this.name=name;
	}
	
	
	@Override
	public void notified(String title) {
		System.out.println("Hi "+  this.name +" "+ title +" Video uploaded.");
		
	}

}
