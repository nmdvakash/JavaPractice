package com.javaconcepts;

public class ArrayConcepts {

	public static void main(String[] args) {
		int i[] = { 1, 2, 3, };

		System.out.println("lenth of array ::  " + i.length); // 3
		System.out.println("elements ::  " + i); // reference of the array

		for (int j : i) {
			System.out.println("j ::  " + j);
		}
	}

}
