package com.cretional.singleton;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class SingletonMainRunner {

	public static void main(String[] args) throws NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, FileNotFoundException, IOException, ClassNotFoundException {
		
		Employee employee=Employee.getEmployee();
		System.out.println(employee.hashCode());
		Employee employee2=Employee.getEmployee();
		System.out.println(employee2.hashCode());
		
		
//		We can break singleton degsin pattern through Reflection API.
		
		/*
		 * Constructor<Employee> constructor=Employee.class.getDeclaredConstructor();
		 * constructor.setAccessible(true); Employee e2= constructor.newInstance();
		 * System.out.println(e2.hashCode());
		 */
		
		User user=User.INSTANCE;
		System.out.println(user.hashCode());
		
		
		
		User user2=User.INSTANCE;
		System.out.println(user2.hashCode());
		
//		We can create multiple objects through Serialization.
		ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("abc.ob"));
		oos.writeObject(employee);
		System.out.println("Serialization done..");
		ObjectInputStream ois=new ObjectInputStream(new FileInputStream("abc.ob"));
		Employee eds=(Employee) ois.readObject();
		
		System.out.println(eds.hashCode());
		
		
//		We can create multiple objects through Clone.
		
		Employee eClone=(Employee) employee.clone();
		System.out.println(eClone.hashCode());
	}

}
