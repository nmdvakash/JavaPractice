package com.generics;

import java.lang.reflect.GenericArrayType;

public class GenericsConstructor<T> {


    // Constructors
    public <T> GenericsConstructor(T t) {
        System.out.println("value --- :: " + t);
    }

    // Constructors
    public <A, B> GenericsConstructor(A a, B b) {
        System.out.println("value -- a :: " + a + "  b :: " + b);
    }

    public static void main(String[] args) {

        GenericsConstructor<Integer> constructor = new GenericsConstructor<>(new Integer(10));

        GenericsConstructor<Integer> constructor1 = new GenericsConstructor<>(new Integer(30), new StringBuilder("test"));

    }
}
