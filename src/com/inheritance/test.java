package com.inheritance;

public class test {

	public static void main(String[] args) {
		A a = new B();
		a.print();
		int i  =12;
		long lo = 12;
		i += lo; 
		System.out.println("   " + ("hello" == "he"+"llo"));
		System.out.println("   ::  "+ new String("hello").equals("hello"));
	}

}

class A {

	public void print() {
		System.out.println("get print A");
	}
}

class B extends A {

	public void print() {
		System.out.println("get print B");
	}
}