package com.interfaces;

import java.util.ArrayList;
import java.util.List;

public abstract class InterfaceMainClass {

    public static void main(String[] args) {
//		System.out.println("get call mai");
//		Interface.get();

    }

    public void print() {
        System.out.println("value ----");
    }
}

interface Interface {

    @Override
    public boolean equals(Object object);

    public static void get() {

        System.out.println("get static method");
        List<Long> list = new ArrayList<>();
    }

}
