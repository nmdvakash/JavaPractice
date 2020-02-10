package com.string;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class LongestSubString {

	public static void main(String[] args) {

		String str = "thelongestsubstring";
		System.out.println(" --- :: " + getLongestSubString(str));

	}

	public static Integer getLongestSubString(String str) {

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
		map.keySet().stream().forEach(System.out::println);
//		List<Integer> test = map.values().stream().sorted(Comparator.<Integer>reverseOrder())
//				.collect(Collectors.toList());

		return map.lastEntry().getKey();

	}

}
