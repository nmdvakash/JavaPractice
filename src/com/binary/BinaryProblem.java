package com.binary;

import java.math.BigInteger;

public class BinaryProblem {

    /**
     * Binary Program
     *
     * Condition
     *  if 1, then subtract from 1
     *     0, then divide from 2
     *
     * @param args
     */

    public static void main(String[] args) {
        System.out.println("value ------ :: "+fastSolution("011110110"));
    }

    private static Integer fastSolution(String string) {
        Integer index = string.indexOf("1");
        return index == -1 ? 0 : string.replace("0", "").length() + string.length() - index - 1;
    }

    private static int solution(String s) {
        int numberOfTimes = 0;
        BigInteger decimal = new BigInteger(s, 2);
        while ( !decimal.equals(new BigInteger("0"))) {
            if (!decimal.testBit(0)) {
                decimal = decimal.divide(BigInteger.valueOf(2));
            } else {
                decimal = decimal.subtract(BigInteger.valueOf(1));
            }
            numberOfTimes++;
        }
        return numberOfTimes;
    }
}
