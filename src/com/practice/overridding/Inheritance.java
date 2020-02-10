package com.practice.overridding;

class Test1 {

	public static int count = 4;

	static {
		System.out.println("call  test ::  " + count);
		count = 1;

	}

	void increment() {

		count++;

	}

	protected void display() {

		increment();

		System.out.println("Test1 count = " + count);

	}

}

public class Inheritance extends Test1 {

	static {
		System.out.println("call  inheritance ::  " + count);
		count++;

	}

	public void display() {

		super.display();

		count++;

		System.out.println("Inheritance count = " + count);

	}

	public static void main(String args[]) {

		Test1 tst = new Inheritance();

		tst.display();

	}

}
