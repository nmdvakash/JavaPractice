package com.inheritance;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

interface AA{
  public default void m(){

  }
}
interface  AAA {
    public default void m(){

    }
}
//class BB implements AA, AAA{
//
//}
public  class Polymorphism {

    public static void main(String[] args) {
//       BB b = new AA();
        //cannot be converted to com.inheritance.BB
Polymorphism polymorphism = new Polymorphism();

        Map<String, List<Integer>> map = new ConcurrentHashMap<>();
        map.put("gmail", Arrays.asList(1,2,3,4));

Double value=        map.get("gmail").stream().mapToDouble(Integer::floatValue).average().orElse(0.0);
        System.out.println("value ,--- :: "+value);

    }

}
