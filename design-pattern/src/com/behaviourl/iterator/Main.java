package com.behaviourl.iterator;

public class Main {

	public static void main(String[] args) {
		UserManagement management=new UserManagement();
		
		management.addUser(new User("Santosh", 101));
		management.addUser(new User("Arshika", 102));
		management.addUser(new User("Poonam", 103));
		
		MyIterator iterator=management.getIterator();
		
		while(iterator.hasNext()) {
			User user=(User)iterator.next();
			System.out.println(user.toString());
		}
		
	}

}
