package com.java8.stream.lists;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Segregate {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Akash", "Akash", "Akash", "Akash", "Akash", "AkashN", "AkashN", "AkashN", "AkashN", "AkashN", "AkashN", "AkashN", "AkashNamdev", "AkashNamdev", "AkashNamdev", "AkashNamdev", "AkashNamdev", "AkashNamdev");
        getStream(list.stream());



    }

    public static void getStream(Stream<String> stream) {
        System.out.println(stream.collect(Collectors.groupingBy(String::toString)));
        //System.out.println(stream.collect(Collectors.toSet()));//java.lang.IllegalStateException: stream has already been operated upon or closed
    }
}
