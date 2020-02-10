package com.interview;

import java.util.ArrayList;
import java.util.List;

public class PracticeNotes {

    public static void main(String[] args) {
        // --- Q1
        List<Integer> list = new ArrayList<>();
        //error
//        list.add('1');
//        list.add('2');
        // --- Q2
        List<Number> numberList = new ArrayList<>();

        ArrayList gListA = new ArrayList();
        ArrayList gListB = new ArrayList();

        numberList = gListA;
        gListB = gListA;

        //error
//        gListB = numberList;

        //error
//        Integer i = new Object();
//        String test = new Object();

        Object num = new Integer(2);
        Object obj = new String();

        Number num1 = new Integer(1);

    }
}
