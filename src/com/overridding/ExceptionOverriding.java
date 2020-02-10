package com.overridding;

import java.io.IOException;

public class ExceptionOverriding {

	// SuperClass declares an exception
	void method() throws IOException {
		System.out.println("SuperClass");
	}

	public static void main(String args[]) {
		ExceptionOverriding s = new SubClass();
		try {
			s.method();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}

// SuperClass inherited by the SubClass
class SubClass extends ExceptionOverriding {

	// SubClass declaring without exception
	void method() {
		System.out.println("SubClass");
	}

	// Driver code

}