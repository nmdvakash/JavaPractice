package com.collections.map;

public class A {

    public A() {
        System.out.println("A");
    }

    public void test() {
        System.out.println("A:test");
    }
}

class B extends A {

    public B() {
        System.out.println("B");
    }

    public void test(){
        System.out.println("B:test");
    }

}

class C extends B {
    public C() {
        System.out.println("C");
    }
}
