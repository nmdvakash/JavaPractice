package com.java8.parallelstream;


import org.w3c.dom.ls.LSOutput;

import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ForkJoinPool;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ParallelStream {

    public static void main(String[] args) throws ExecutionException, InterruptedException {

        List<Integer> list = IntStream.rangeClosed(1, 100).boxed().collect(Collectors.toList());
        Stream<Integer> stream = list.parallelStream();
//        stream.unordered().forEach(System.out::println);

        ForkJoinPool forkJoinPool = new ForkJoinPool(50);
        int sum = forkJoinPool.submit(() -> list.parallelStream().reduce(Integer::sum).get()).get();
        forkJoinPool.submit(() -> list.parallelStream().forEach(System.out::println));
        System.out.println("value sum ---------- : " + sum);

//        ForkJoinPool
//        list.stream().parallel().filter(Prim)

    }
}
