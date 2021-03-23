package com.java8.funtional;


import java.util.function.*;

public class JFunctionalInterface {

    public static void main(String[] args) {
        Function<String, Integer> fun = str -> Integer.valueOf(str);
        Integer integer = fun.apply("12345");
        System.out.println("value :: " + integer);

        Predicate<String> predicate = obj -> "String".equals(obj);
        Boolean aBoolean = predicate.test("String");
        System.out.println("Predicate Value :: " + aBoolean);

        Supplier<String> supplier = () -> "Akash";
        String string = supplier.get();
        System.out.println("Supplier Value :: " + string);

        IntFunction<String> intFunction = value -> value + "";
        String intString = intFunction.apply(123);
        System.out.println("IntFunction value :: " + intString);

        IntSupplier intSupplier = () -> 12344;
        int value = intSupplier.getAsInt();
        System.out.println("IntSupplier value :: "+value);


    }

}
