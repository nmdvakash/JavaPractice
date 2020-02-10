package com.constructor;


class A {

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

    public void test() {
        System.out.println("B:test");
    }

}

class C extends B {
    public C() {
        System.out.println("C");
    }

    public static void testStatic() {
        System.out.println("call :: static method");
    }
}

public class ConstructorChainingInInheritance {

    int id;

    public ConstructorChainingInInheritance() {
        System.out.println("ConstructorChainingInInheritance : default");
    }

    public ConstructorChainingInInheritance(int id) {
//        this();
        System.out.println("ConstructorChainingInInheritance : Parameter");
        this.id = id;
    }

    public static void main(String[] args) {
        new ConstructorChainingInInheritance(1);
        C c = new C();
        c.test();
        A a = ((A) c);
        a.test();

        String[] str = {"a", "b"};
//        ConstructorChainingInInheritance.main(str); // possible

        C c1 = null;
        c1.testStatic(); // works properly

    }

}
