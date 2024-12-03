package com.cretional.prototype;

import java.util.ArrayList;
import java.util.List;

public class NetworkConnection implements Cloneable{

	private String data;
	private String ipAddress;
	private List<String> domains=new ArrayList<String>();
	
		
	public NetworkConnection() {
		super();
		
	}

	public String getData() {
		return data;
	}

	public void setData(String data) throws InterruptedException {

		this.domains.add("www.lwsk.com");
		this.domains.add("www.lwpk.com");
		this.domains.add("www.lwak.com");
		Thread.sleep(2000);
		this.data = data;
	}

	public String getIpAddress() {
		return ipAddress;
	}

	public void setIpAddress(String ipAddress) {
		this.ipAddress = ipAddress;
	}

	public List<String> getDomains() {
		return domains;
	}

	public void setDomains(List<String> domains) {

		this.domains = domains;
	}



	@Override
	public String toString() {
		return "data=" + data + "ipAddress=" + ipAddress + "domains=" + this.domains;
	}

	//Shallow clone copy
	/*@Override
	
	 * protected Object clone() throws CloneNotSupportedException { return
	 * super.clone(); }
	 */
	//deep clone copy
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		NetworkConnection connection=new NetworkConnection();
		try {
			connection.setData(this.getData());
			connection.setIpAddress(this.getIpAddress());
			
			for(String d:this.getDomains()) {
				connection.getDomains().add(d);
			}
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return connection;
	}

	
	
}
