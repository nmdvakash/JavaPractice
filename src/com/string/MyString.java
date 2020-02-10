package com.string;

public class MyString {
	public static void main(String[] args) {
		String s1 = "abc";

		String s2 = "abc" + "def";

		String s3 = "123" + "A" + "B";

		String s4 = s2 + s1;
		String s5 = "abcdefabc";

		System.out.println("get ::  " + (s5 == s4));

		System.out.println(s1); // Output : abc

		System.out.println(s2); // Output : abcdef

		System.out.println(s3); // Output : 123AB

		String str = "akash";

		StringBuilder builder = new StringBuilder(str);

		System.out.println("reverse ::  " + builder.reverse());
	}
}
