package com.string;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class LongestSubString {

    public static void main(String[] args) {

        String str = "thelongestsubstring";
        Map.Entry<Integer, String> entry = getLongestSubString(str);

        // find the longest non repeatable char sub string
        System.out.println("Out put Longest Sub String  :: " + entry.getValue());
        //Longest Sub String  :: [u, b, s, t, r, i, n, g]

        System.out.println("Max length --- :: " + entry.getKey());
        // Output --- :: 8
    }

    public static Map.Entry<Integer, String> getLongestSubString(String str) {
        TreeMap<Integer, String> map = new TreeMap<>();
        List<String> list = new ArrayList<>();
        int j = 0;
        for (int i = 0; i < str.length(); i++) {
            if (j == 0) {
                j = i;
            }
            if (!list.contains(str.charAt(i) + "")) {
                list.add(str.charAt(i) + "");
            } else {
                map.put(list.size(), list.toString());
                list.clear();
                i = j;
                j = 0;
            }
        }
        map.put(list.size(), list.toString());
//		List<Integer> test = map.values().stream().sorted(Comparator.<Integer>reverseOrder())
//				.collect(Collectors.toList());
        return map.lastEntry();
    }

}
