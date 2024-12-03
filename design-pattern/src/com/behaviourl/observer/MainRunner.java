package com.behaviourl.observer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MainRunner {

	public static void main(String[] args) throws IOException {
		
		Channel channel= new Channel();
		Subscriber aman=new Subscriber("Aman");
		channel.subscribe(aman);
		channel.newVideoUploaded("Design Pattern");
		
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		while(true) {
			System.out.println("Press 1 for uploading video");
			System.out.println("Press 2 for add subcriber");
			System.out.println("Press 3 for unsubscribe");
			System.out.println("Press 4 for Exit");
			
			int choice=Integer.parseInt(br.readLine());
			if(choice==1) {
				System.out.println("Enter video title");
				String str=br.readLine();
				channel.newVideoUploaded(str);
				
			}else if(choice==2) {
				System.out.println("Enter subscriber name");
				String name=br.readLine();
				Subscriber subscriber1=new Subscriber(name);
				channel.subscriber.add(subscriber1);
				
			}else if(choice==3) {
				System.out.println("Enter unsubscriber name");
				String name=br.readLine();
				Subscriber subscriber1=new Subscriber(name);
				channel.subscriber.remove(subscriber1);
				
				
			}else if(choice==4) {
				System.out.println("Thank you for using");
				break;
				
			}else{
				System.out.println("You entered wrong value. Thanks");
			}
			
			
		}
	}

}
