package com.findmissing;

import java.util.ArrayList;
import java.util.List;

public class FindMissingNumber {

    public static void main(String[] args) {

        List<Long> list = new ArrayList<>();

        Long i = 0L;
        Long total = 0L;
        int finalTotal = 0;
        while (i <= 5) {
            finalTotal += i;
            if (!i.equals(4L)) {
                list.add(i);
                total = total + i++;
                System.out.println("::   " + total + "  " + i);
            } else {
                System.out.println("Call  " + i);
                i++;
            }
        }

        System.out.println("list :: " + list);
        System.out.println("total :: " + total);

        System.out.println("Logical Total ::  " + (5 * (5 + 1) / 2));
        System.out.println(findMissingNumber(total, 5L));


        System.out.println("final  total :: " + finalTotal);
    }

    public static Long findMissingNumber(Long total, Long lenght) {
        return (lenght * (lenght + 1) / 2) - total;
    }
}
