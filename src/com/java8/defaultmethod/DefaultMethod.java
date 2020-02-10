package com.java8.defaultmethod;

@FunctionalInterface
public interface DefaultMethod {

	public void print();

	default void test() {

		System.out.println("value ----- ::  test");
	}

	static void staticMethod() {
		System.out.println("static method");
	}

	@Override
	public int hashCode();

	public String toString();

}
