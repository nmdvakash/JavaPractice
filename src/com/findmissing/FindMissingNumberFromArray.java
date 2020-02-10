package com.findmissing;

import java.util.ArrayList;
import java.util.List;

public class FindMissingNumberFromArray {
	public static void main(String[] args) {

		List<Long> numberList = new ArrayList<>();

		for (Long i = 1L; i <= 1000; ++i) {
			if (!i.equals(944L)) {
				numberList.add(i);
			}
		}
		System.out.println("get missing number ::  " + findMissingNumber(numberList));
	}

	private static int findMissingNumber(List<Long> numberList) {
		System.out.println("get value ::  " + numberList.size());
		System.out.println("get Sum of the value ::  " + numberList.stream().mapToInt(Long::intValue).sum());
		return 1000 * (1000 + 1) / 2 - numberList.stream().mapToInt(Long::intValue).sum();

	}

}
