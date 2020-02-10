package com.arrays;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountDuplicateWords {
	public static void main(String[] args) {

		// count repeated word in the list
		List<String> stringList = Arrays.asList("test", "test", "A", "A", "A", "B", "b", "b", "B", "d");
		Set<String> uniqueSet = new HashSet<>(stringList);
		for (String temp : uniqueSet) {
			System.out.println(temp + ": " + Collections.frequency(stringList, temp));
		}

		// java 8 with Stream funtion

		// Word lenght
		List<String> cards = Arrays.asList("Visa", "MasterCard", "American Express", "Visa");
		// System.out.println("list: " + cards);

		//count the no of string
		Map<String, Integer> cards2Length = cards.stream()
				.collect(Collectors.toMap(Function.identity(), String::length, (e1, e2) -> e1));
		System.out.println("map: " + cards2Length);
		// -------------------

	}
}
