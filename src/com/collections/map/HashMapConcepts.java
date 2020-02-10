package com.collections.map;

import javax.print.attribute.HashAttributeSet;
import java.util.HashMap;
import java.util.Objects;

public class HashMapConcepts extends C {


    public static void main(String[] args) {
        new HashMapConcepts(1, "a");

//        HashMap<HashMapConcepts, String> map = new HashMap<>();
//        map.put(new HashMapConcepts(1, "a"), "a");
//        map.put(new HashMapConcepts(2, "a"), "b");
//        map.put(new HashMapConcepts(3, "a"), "c");
//        map.put(new HashMapConcepts(4, "a"), "d");
//        map.put(new HashMapConcepts(5, "a"), "e");
//        map.put(new HashMapConcepts(5, "a"), "f");
//        System.out.println("value size ---- :: " + map.size());
//
//        System.out.println("value size ---- :: " + map.get(new HashMapConcepts(4, "a")));


    }

    public HashMapConcepts() {
        System.out.println("default");
    }

    public HashMapConcepts(int i, String name) {
        this();
        System.out.println("Parameter");
//        super();
        this.i = i;
        this.name = name;
    }

    int i;
    String name;

    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        HashMapConcepts that = (HashMapConcepts) o;
        return i == that.i &&
                Objects.equals(name, that.name);
//        return false;
    }

    @Override
//    public int hashCode() {
//        return Objects.hash(i, name);
//    }

    //
    public int hashCode() {
        return 2;
    }

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
