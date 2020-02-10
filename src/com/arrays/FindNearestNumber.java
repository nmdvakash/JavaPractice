package com.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindNearestNumber {

	public static void main(String[] args) {

		int[] list = { 4, 73, 67, 38, 33 };
		list = getList(list);

		for (int num : list)
			System.out.println(num);
	}

	public static int[] getList(int[] list) {
		List<Integer> result = new ArrayList<>();
		for (int i = 0; i < list.length; i++) {
			if (list[i] >= 38) {
				int round = Math.round((list[i] + 5) / 5) * 5;
				if ((round - list[i]) < 3) {
					result.add(round);
				} else {
					result.add(list[i]);
				}
			} else {
				result.add(list[i]);
			}
		}
		return result.stream().mapToInt(Integer::intValue).toArray();
	}

}
