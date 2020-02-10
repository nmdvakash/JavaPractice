package com;

public class ReverseStringWithOutSpecialCharacter {

    public static void main(String[] args) {
        String str = "a#b%1C$";
        String output = getReverseStringWithoutSpecialCharacter(str);
        System.out.println("output  ::  " + output);
        // output  ::  C#b%1a$
    }

    public static String getReverseStringWithoutSpecialCharacter(String str) {
        int len = str.length() - 1;
        int i = 0;
        char[] chars = str.toCharArray();
        while (len > i) {
            if (!Character.isAlphabetic(str.charAt(i)))
                i++;
            else if (!Character.isAlphabetic(str.charAt(len))) {
                len--;
            } else {
                char tmp = chars[i];
                chars[i] = chars[len];
                chars[len] = tmp;
                len--;
                i++;
            }
        }
        return String.valueOf(chars);
    }
}
