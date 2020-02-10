package com.functionalinterface;

@FunctionalInterface
public interface Funtionalnterface extends Funtion {

	public default void print() {
		System.out.println(" value ------ default ");
	}

	public void println();

	@Override
	public String toString();

}

interface Funtion {

	public void print();

}

class MyFuntion{
	
}