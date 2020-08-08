package com.string;

/**
 * Strings arrange one after another
 * Exam:
 *   String a = "hackerrank"
 *   String b = "mountain"
 *
 *   Output : hmaocuknetrariannk
 */
public class StringPassword {


    public static void main(String[] args) {
        String a = "hackerrank";
        String b = "mountain";
        String str  = getNewString(a, b);
        System.out.println("value -------- :: "+str);
    }

    public static String getNewString(String a, String b) {

        String result = "";
        for (int i = 0; i < a.length() || i < b.length(); i++) {

            if (i < a.length()) {
                result += a.charAt(i);
            }
            if (i < b.length()) {
                result += b.charAt(i);
            }
        }
        return result;
    }

}
