package com.javaconcepts;

import java.math.BigDecimal;

public interface TestInterface {

    public static void main(String[] args) {

        System.out.println(" value  ::  " + 0.0 / 0);

        System.out.println(2.0 % 0);
        // Nothing will pring
        // for (int i = 0; i < args.length; i++) {
        // System.out.println(" print :: " + args[i]);
        // }

        // getValue(1L, 2L);

        // getValue(new BigDecimal("10.1"), new BigDecimal("8.3"));

        // getValue(Double.valueOf("10.1"), Double.valueOf("8.3"));

    }

    // public static void getValue(int l1, int l2) {
    // System.out.println("get call :: Integer");
    // }
    //
    // public static void getValue(long l1, long l2) {
    // System.out.println("get call :: Long");
    // }
    //
    // public static void getValue(float l1, float l2) {
    // System.out.println("get call :: Float");
    // }

    public static void getValue(BigDecimal b1, BigDecimal b2) {

        System.out.println("BigDecimal  ::  " + b1.divide(b2));
    }

    public static void getValue(Double b1, Double b2) {
        System.out.println("BigDecimal  ::  " + b1 / b2);
    }
}
