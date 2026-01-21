//Complete the solution so that it splits the string into strings of two characters in a list/array (depending on the language you use).
// If the string contains an odd number of characters then it should replace the missing second character of the final pair with an underscore ('_').
//kyu 6
//https://www.codewars.com/kata/515de9ae9dcfc28eb6000001/train/java
package com.example.codewars.week3;

public class StringSplit {
    public static String[] solution(String s) {
        if (s == null || s.isEmpty()) {
            return new String[0];
        }
        if (s.length() % 2 != 0) {
            s += "_";
        }
        String[] result = new String[s.length() / 2];
        for (int i = 0; i < result.length; i++) {
            result[i] = s.substring(i * 2, i * 2 + 2); //через два символа в исходной строке
        }
        return result;
    }
}
