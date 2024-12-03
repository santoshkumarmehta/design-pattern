package com.behaviourl.observer;

import java.util.ArrayList;
import java.util.List;

public class Channel implements Subject{

	List<Observer> subscriber=new ArrayList<Observer>();
	
	@Override
	public void subscribe(Observer ob) {
		this.subscriber.add(ob);		
	}

	@Override
	public void unSubscribe(Observer ob) {
		this.subscriber.remove(ob);
		
	}

	@Override
	public void newVideoUploaded(String title) {
		for(Observer ob:this.subscriber) {
			ob.notified(title);
		}
		
	}

}
