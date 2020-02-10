package com.UTILL;

public class MyQuestion { // implements A, B {
	public static void main(String[] args) {
		System.out.print("T" + "E");
		System.out.print('S' + 'T');

		Object obj = new Object();
		Object lo = Long.valueOf(10);
		Object in = Integer.valueOf(20);
		Object str = "akash";

		MyQuestion myQuestion = new MyQuestion();
		
		int b =  90 ;
		int a = b ^ 6;
		System.out.println("b------ :: "+a);

//		myQuestion.print(lo);
//		myQuestion.print(obj);
//		myQuestion.print(in);
//		myQuestion.print(str);
//
//		myQuestion.print(123456d);

	}

	
	
	
	
	public int print() {
		int a = 10;
		int b = 20;
		return (short) a * b;
	}

	public static void print(Integer i) {
		System.out.println("ints -- : " + i);
	}

	public void print(Long lo) {
		System.out.println("Ol -- : " + lo);
	}

	public void print(String str) {
		System.out.println("str -- : " + str);
	}

	public void print(Object obj) {
		System.out.println("Obj -- : " + obj);
	}

//	@Override
//	public void print() {
//
//	}
}

interface A {
	void print();
}

interface B {
	void print();
}