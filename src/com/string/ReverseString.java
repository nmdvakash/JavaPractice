package com.string;

/**
 * Reverse String using String builder method and Using without method
 */
public class ReverseString {

    public static void main(String[] args) {
        String str = "AkashNamdevEveryThing";
        reverseThrowStringBuilderMethod(new StringBuilder(str));
        reverseThrowLogic(str);
    }

    private static void reverseThrowStringBuilderMethod(StringBuilder str){
        System.out.println(" reverseThrowStringBuilderMethod   ::  " + str.reverse());
        System.out.println(" reverseThrowStringBuilderMethod   ::  " + str.delete(0,2));
    }

    private static void reverseThrowLogic(String str){
        for(int i = str.length() - 1; i > -1 ; i--){
            System.out.print(str.charAt(i));
        }
    }
}
