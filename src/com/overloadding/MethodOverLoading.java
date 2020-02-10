package com.overloadding;

// Java Compiler chooses the most specific method.

/**
 * Whenever more than one overloaded methods can be applied to the argument
 * list, the most specific method is used. In this case either of the methods
 * can be called when passing null, since the "null type" is assignable to both
 * Object and to String. The method that takes String is more specific so it
 * will be picked.
 *
 */

public class MethodOverLoading {
	public void print(Object str) {
		System.out.println("Class :  Object");
	}

	public void print(Number str) {
		System.out.println("Class :  Number");
	}

	public void print(Integer obj) {
		System.out.println("Class :  Integer");
	}

	
//	Compilation error while calling method with null value  
//	public void print(String obj) {
//		System.out.println("Class :  Integer");
//	}

	public static void main(String[] args) {

		MethodOverLoading overRiding = new MethodOverLoading();

		overRiding.print(null);

	}
}
