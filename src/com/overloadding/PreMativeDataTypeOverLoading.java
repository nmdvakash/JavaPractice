package com.overloadding;

public class PreMativeDataTypeOverLoading {

	public static void main(String[] args) {

		byte i = 12;

		PreMativeDataTypeOverLoading loading = new PreMativeDataTypeOverLoading();

		loading.print(i);

	}

	public void print(Integer i) {
		System.out.println(" Integer ");
	}

	public void print(Long i) {
		System.out.println(" Integer ");
	}

	public void print(int i) {
		System.out.println(" int ");
	}

	public void print(long i) {
		System.out.println(" long ");
	}
}
