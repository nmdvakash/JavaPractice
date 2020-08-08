package com.java8.defaultmethod;

public class DefaultMethodImplementation implements DefaultMethod {

    @Override
    public void print() {
    }

    public static void main(String[] args) {
        DefaultMethod defaultMethod = () -> System.out.println("call print ");
        defaultMethod.test();
        defaultMethod.print();
    }

}
