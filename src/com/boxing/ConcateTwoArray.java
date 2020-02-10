package com.boxing;

import java.util.List;
import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ConcateTwoArray {

	public static void main(String[] args) {

		int[] a = new int[] { 1, 3, 5, 6 };
		int[] b = new int[] { 2, 4 };

		Arrays.stream(concate(a, b)).forEach(System.out::println);
	}

	public static int[] concate(int[] a, int[] b) {
		
		
		
		Arrays.stream(a).boxed();
		List<Integer> list = Stream.concat(Arrays.stream(a).boxed(), Arrays.stream(b).boxed()).sorted()
				.collect(Collectors.toList());
//	Integer[] both = Stream.of(a, b).flatMap(Stream::of).toArray(Integer[]::new);
		return list.stream().mapToInt(i -> i).toArray();
	}
}
