package com.collections;

import java.util.HashMap;

public class HashMapKeys {

	public static void main(String[] args) {
		HashMap<String, String> map = new HashMap<>();
		map.put("a", "b");
		map.put("b", "b");
		map.put("c", "b");
		map.put("f", "b");
		map.put("d", "b");
		map.put("e", "b");
		map.put("g", "b");
		map.put("h", "b");

		//we can add null key value any time this will not give you any runtime or compile time error
		map.put(null, "value");
		map.put(null, "value1");

		System.out.println("value -------- :: "+map.get(null));

	}
}