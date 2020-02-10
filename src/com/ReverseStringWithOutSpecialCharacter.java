package com;

public class ReverseStringWithOutSpecialCharacter {

	public static void main(String[] args) {

		String str = "a#b%1C$";
		int len = str.length() - 1, i = 0;

		char[] chars = str.toCharArray();

		while (len > i) {

			if (!Character.isAlphabetic(str.charAt(i)))
				i++;
			else if (!Character.isAlphabetic(str.charAt(len))) {
				len--;
			} else {
				char tmp = chars[i];
				chars[i] = chars[len];
				chars[len] = tmp;
				len--;
				i++;
			}
		}

		System.out.println("out put  ::  " + new String(chars));

	}
}
