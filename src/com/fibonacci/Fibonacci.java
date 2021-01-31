package com.fibonacci;

import java.util.ArrayList;
import java.util.List;

/**
 * In fibonacci series, next number is the sum of previous two numbers for example 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55 etc. The first two numbers of fibonacci series are 0 and 1.
 * <p>
 * Implemented Two way
 * <p>
 * Fibonacci Series without using recursion
 * Fibonacci Series using recursion
 */
public interface Fibonacci {

    static void main(String[] args) {
        //First option
        fibonacciWithoutRecursion(10);
        System.out.println();
        //second option
        for (int i = 0; i < 10; i++) {
            System.out.print(fibonacciWithRecursion(i) + " ");
        }
        System.out.println();
        //Third option using list
        System.out.println(fibonacciWithRecursionLogic(10));
    }

    /**
     * @param num
     */
    static void fibonacciWithoutRecursion(Integer num) {
        Integer obj1 = 0;
        Integer obj2 = 1;
        Integer obj3 = 0;
        for (int i = 0; i < num; i++) {
            System.out.print(obj1 + " ");
            obj3 = obj1 + obj2;
            obj2 = obj1;
            obj1 = obj3;
        }
    }

    static List<Integer> fibonacciWithRecursionLogic(Integer num) {
        List<Integer> list = new ArrayList<>();
        list.add(0);
        list.add(1);
        for (int i = 2; i <= num ; i++) {
            list.add(i, list.get(i - 1) + list.get(i - 2));
        }
        return list;
    }

    /**
     * @param num
     * @return
     */
    static Integer fibonacciWithRecursion(Integer num) {
        if (num <= 1) {
            return num;
        }
        return fibonacciWithRecursion(num - 1) + fibonacciWithRecursion(num - 2);
    }

}
