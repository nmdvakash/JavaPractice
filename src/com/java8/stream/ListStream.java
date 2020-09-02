package com.java8.stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ListStream {

    public static void main(String[] args) {

        int min = 0;
        int max = 1_0;

        //will create list of Integer number Output 0 to 9
        List<Integer> numberList = IntStream.range(min, max).boxed().collect(Collectors.toList());
        numberList.stream().forEach(System.out::println);

        //Sum of 1 to 100 number with stream will print 5050
        int sum = IntStream.rangeClosed(1, 100).sum();
        System.out.println("value ---------- :: " + sum);
        System.out.println("----------------- X -----------------");

        //will create List of Integer number Output will be 0 to 10
        numberList = IntStream.rangeClosed(min, max).boxed().collect(Collectors.toList());
        numberList.stream().forEach(System.out::println);

        sum = numberList.stream().reduce(Integer::sum).get();
        int mapToIntSum = numberList.stream().mapToInt(Integer::intValue).sum();
        System.out.println(" sum of reduce ------ :: " + sum);
        System.out.println(" mapToIntSum ------ :: " + mapToIntSum);

        //find the Max number from list
        numberList.parallelStream().reduce(Integer::max).stream().forEach(System.out::println);

        List<Integer> list = Arrays.asList(2, 3, 43, 2, 4, 5, 63, 2, 4, 6);
        // sort the list
        System.out.println("---- sort --- ");
        list.stream().sorted().forEach(System.out::print);
        // Reverse order sort
        System.out.println("---- reverse sort --- ");
        list.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);

        System.out.println("---- remove duplicates --- ");
        list.stream().distinct().forEach(System.out::print);

        //Print steam with out for loop
        list = list.stream().distinct().peek(System.out::println).collect(Collectors.toList());
        System.out.println("out ----- :: "+list);

        //Square list of number
        numberList.stream().map(i -> i*i).forEach(System.out::println);


        Random randomList = new Random();
        randomList.ints().limit(15).forEach(System.out::println);
    }
}
