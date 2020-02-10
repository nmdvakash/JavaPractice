package com.java8.stream;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ListStream {

    public static void main(String[] args) {

        int min = 0;
        int max = 1_0;
        List<Integer> numberList = IntStream.range(min, max).boxed().collect(Collectors.toList());
        numberList.stream().forEach(System.out::println);

        int sum = IntStream.rangeClosed(1,100).sum();
        System.out.println("value ---------- :: "+sum);
        System.out.println("----------------- X -----------------");

        List<Integer> numberList2 = IntStream.rangeClosed(min, max).boxed().collect(Collectors.toList());
        numberList2.stream().forEach(System.out::println);

        int sum1 = numberList.stream().reduce(Integer::sum).get();
        System.out.println(" sum of reduce ------ :: " + sum1);

        numberList.parallelStream().reduce(Integer::max).stream().forEach(System.out::println);



        List<Integer> list = Arrays.asList(2, 3, 43, 2, 4, 5, 63, 2, 4, 6);
        int sumTest = list.stream().mapToInt(Integer::intValue).sum();
        System.out.println("Sum of list :: " + sumTest);
        // sort the list
        System.out.println("---- sort --- ");
        list.stream().sorted().forEach(System.out::print);
        // Reverse order sort
        System.out.println("---- reverse sort --- ");
        list.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);

        System.out.println("---- remove duplicates --- ");
        // Remove duplicates
        list.stream().distinct().forEach(System.out::print);

        System.out.println("out -----");
        list.stream().distinct().peek(System.out::println).collect(Collectors.toList());


    }
}
