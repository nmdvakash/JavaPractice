package com.test;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Test2 {

//    synchronized  tp(){}
    public static void main(String[] args) {


        Random test  = new Random();

        test.ints(1,20).distinct().limit(15).sorted().forEach(System.out::println);

//        List<Integer> arr1 = Arrays.asList(123, 543);
//        List<Integer> arr2 = Arrays.asList(321, 279);

//       int count =  countMoveToEqualArrayElements(arr1.stream().mapToInt(Integer::intValue).toArray(), arr2.stream().mapToInt(Integer::intValue).toArray());
//        System.out.println("value ------ :: "+count);

//        List<Integer> arr1 = Arrays.asList(1, 2, 3,3);
//        int value = BalanceBest(arr1.stream().mapToInt(Integer::intValue).toArray());
//        System.out.println("value --- :: " + value);


    }

    private static int countMoveToEqualArrayElements(int[] a, int[] b) {
        int aLength = a.length;
        int counter = 0;
        if (a.length != b.length) {
            throw new RuntimeException("Make sure both arrays have equal elements");
        }
        for (int i = 0; i < aLength; i++) {
            String as = String.valueOf(a[i]);
            String bs = String.valueOf(b[i]);
            for (int c = 0; c < as.length(); c++) {
                int aValue = Integer.parseInt(Character.toString(as.charAt(c)));
                int bValue = Integer.parseInt(Character.toString(bs.charAt(c)));
                if (aValue > bValue) {
                    counter += aValue - bValue;
                } else {
                    counter += bValue - aValue;
                }
            }
        }
        return counter;
    }

    public static int BalanceBest(int[] a) {
        int leftSum = a[0];
        int rightSum = 0;
        ;
        for (int i = 0; i < a.length; i++)//notice we start from 2nd as 1st value is set
            rightSum += a[i];//each sum is sum of previous sum plus current value

        for (int i = 0; i < a.length - 1; i++) {
            if (leftSum == rightSum)
                return i;
            leftSum += a[i + 1];
            rightSum -= a[i];
        }
        return -1;//otherwise we return -1 as not found
    }


    static int birthdayCakeCandles(int n, int[] ar) {
        int max = 1;
        int counter = 0;
        for (int i = 0; i < ar.length; i++) {
            if (max < ar[i]) {
                max = ar[i];
                counter = 1;
            } else if (max == ar[i]) {
                counter++;
            }
        }
        return counter;
    }

}
