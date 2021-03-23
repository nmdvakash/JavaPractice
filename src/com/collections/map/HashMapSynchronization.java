package com.collections.map;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class HashMapSynchronization {

    public static void main(String[] args) {
        // create map
        Map<String,String> map = new HashMap<>();

        // populate the map
        map.put("1","ALIVE ");
        map.put("2","IS");
        map.put("3","AWESOME");

        // create a synchronized map
        Map<String,String> syncMap = Collections.synchronizedMap(map);
        syncMap.put("te", "a");
        System.out.println("Synchronized map :"+syncMap);


        ConcurrentHashMap<String, String> concurrentHashMap = new ConcurrentHashMap<>();
        concurrentHashMap.put("A", "A");
//        concurrentHashMap.put("B", null);// error
//        concurrentHashMap.put("c", null);
//        concurrentHashMap.put(null, null);
String str = null;
        synchronized (str){

//        synchronized (null){ compile time error

        }


    }
}
