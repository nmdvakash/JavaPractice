package com.collections;

import java.util.Vector;

public class VectorClass {

    public static void main(String[] args) {

        Vector<String> vector = new Vector<>(5);

        for(int i =0; i < 10; i++){
            System.out.println("value ---- :: "+vector.add("A"));
        }

        System.out.println("vector size :: "+vector.size());
        System.out.println("vector Values :: "+vector);

        vector.setSize(3);
        System.out.println("after setSize to 3 :: "+vector);
    }
}
