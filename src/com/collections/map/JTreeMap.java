package com.collections.map;

import java.util.TreeMap;

/**
 * 1 -> It stores key-value pairs similar to like HashMap.
 * <p>
 * 2 -> It allows only distinct keys. Duplicate keys are not possible.
 * <p>
 * 3 -> It cannot have null key but can have multiple null values.
 * <p>
 * 4 -> It stores the keys in sorted order (natural order) or by a Comparator
 * provided at map creation time.
 * <p>
 * 5 -> It provides guaranteed log(n) time cost for the containsKey, get, put
 * and remove operations. It is not synchronized. Use
 * Collections.synchronizedSortedMap(new TreeMap()) to work in concurrent
 * environment.
 * <p>
 * 6 -> The iterators returned by the iterator method are fail-fast.
 */
public class JTreeMap {

    public static void main(String[] args) {

        TreeMap<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(1, "A");
        treeMap.put(3, null);
        treeMap.put(4, "C");
        treeMap.put(2, "B");
        // treeMap.put(null, "B"); // not alow
        String value = treeMap.getOrDefault(5, "AB");

        System.out.println("value -------- :: " + treeMap + " value ---- :: " + value);
    }

}
