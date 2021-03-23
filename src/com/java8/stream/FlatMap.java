package com.java8.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMap {

    public static void main(String[] args) {

        List<List<Integer>> listOfList = Arrays.asList(Arrays.asList(12, 3, 4, 5), Arrays.asList(4, 5, 6, 6),
                Arrays.asList(4, 5, 6));
        
        List<Integer> result = listOfList.stream().flatMap(List::stream).collect(Collectors.toList());
        System.out.println("value ---- after flat map :: " + result);

        int sum = listOfList.stream().flatMap(List::stream).mapToInt(Integer::intValue).sum();
        System.out.println("Sum list of list :: " + sum);
    }
}
