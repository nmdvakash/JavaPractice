package com;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ProgrammingTest {

	public static void main(String[] args) {
		int[] list = { 1, 2, 3 };
		marcsCakewalk(list);
	}

	static long marcsCakewalk(int[] calorie) {

		List<Long> listLong = new ArrayList<>();
		for (int i = 0, l = calorie.length - 1; i < calorie.length; i++, l--) {
			long sum1 = 0;
			long sum2 = 0;
			for (int j = i, k = 0, pow = 0, m = l, n = calorie.length - 1; j < calorie.length || k < i; j++, pow++, m-- ) {
				if (j < calorie.length) {
					sum1 += Math.pow(2, pow) * calorie[j];
					sum2 += Math.pow(2, pow) * calorie[m];
				} else {
					sum1 += Math.pow(2, pow) * calorie[k++];
					sum2 += Math.pow(2, pow) * calorie[n--];
				}
				
			}
			listLong.add(sum1);
			listLong.add(sum2);
		}
		Collections.sort(listLong);
		System.out.println(Math.pow(2, 0) + "  " + listLong.get(0));
		return listLong.get(0);
	}
}
