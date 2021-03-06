package com.java8.stream;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ListStream {

    public static void main(String[] args) {
    	
    	
//    	byte b = 6;
//    	b += 8;
//    	System.out.println(b);
//    	b += 7;
//    	b = b + 7; //Compile time error
//    	System.out.println(b);
//    	

          
    	
        int min = 0;
        int max = 1_0;

        //will create list of Integer number Output 0 to 9
        List<Integer> numberList = IntStream.range(min, max).boxed().collect(Collectors.toList());

        System.out.println(numberList.stream().allMatch(obj -> obj == 9));// o/p false
        System.out.println(numberList.stream().filter(obj -> obj == 9 ||obj == 8).count() );
        numberList.stream().forEach(System.out::println);

        //Sum of 1 to 100 number with stream will print 5050
        int sum = IntStream.rangeClosed(1, 100).sum();
        System.out.println("value ---------- :: " + sum);
        System.out.println("----------------- X -----------------");

        //will create List of Integer number Output will be 0 to 10
        numberList = IntStream.rangeClosed(min, max).boxed().collect(Collectors.toList());
        numberList.stream().forEach(System.out::println);

        sum = numberList.stream().reduce(Integer::sum).orElse(0);
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

        List<String> listOfString = Arrays.asList("a", "aa", "bbb","ccc", "akash");
        String value = listOfString.stream().max(Comparator.comparingInt(String::length)).get();
        System.out.println("print Value ------- :: "+value);
    }
}
