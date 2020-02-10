package com.singleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ReflactionSingleton {

	public static void main(String[] args)
			throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {

		EagerSingleton instanceOne = EagerSingleton.getInstance();

		EagerSingleton instanceTwo = null;

		Constructor[] constructors = EagerSingleton.class.getDeclaredConstructors();

		for (Constructor constructor : constructors) {
			constructor.setAccessible(true);
			instanceTwo = (EagerSingleton) constructor.newInstance();
			break;
		}
		System.out.println("get one :: " + instanceOne);
		System.out.println("get two :: " + instanceTwo);
		
		//Solution to create enum 
		/*
		 * enum MyClass{ INSTANCE; }
		 */
	} 

}
