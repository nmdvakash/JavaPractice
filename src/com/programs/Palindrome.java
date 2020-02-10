package com.programs;

import java.io.IOException;

public class Palindrome {
	public static void main(String[] args) throws IOException {
		// BufferedReader bufferedReader = new BufferedReader(new
		// InputStreamReader(System.in));
		//
		// String str = bufferedReader.readLine();

		// System.out.println("get value input :: " + str);
		int value = 54321;// new Integer(str).intValue();
		int rev = 0;
		int palin = value;
		while (palin != 0) {
			int rem = palin % 10;
			// System.out.println("get value rem :: " + rem);
			rev = rev * 10 + rem;
			// System.out.println("get rev :: " + rev);
			palin = palin / 10;
			// System.out.println("palin :: " + palin);
		}

		System.out.println(value + "    " + rev);
	}
}
