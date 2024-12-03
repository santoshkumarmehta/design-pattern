package com.cretional.prototype;

public class MainRunner {

	public static void main(String[] args) throws InterruptedException, CloneNotSupportedException {
		
		NetworkConnection networkConnection=new NetworkConnection();
		networkConnection.setIpAddress("190.193.164.05");
		networkConnection.setData("this is very very big data");

		System.out.println(networkConnection);
		System.out.println(networkConnection.hashCode());
		
		networkConnection.getDomains().remove(0);
		System.out.println(networkConnection);
		//create new object
		NetworkConnection networkConnection2=(NetworkConnection) networkConnection.clone();
		System.out.println(networkConnection2);
		System.out.println(networkConnection2.hashCode());
		
		NetworkConnection networkConnection3=(NetworkConnection) networkConnection.clone();
		System.out.println(networkConnection3);
		System.out.println(networkConnection3.hashCode());
	}

}
