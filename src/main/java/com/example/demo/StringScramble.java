//kyu: 7
//link: https://www.codewars.com/kata/5822d89270ca28c85c0000f3
// task: Given a string and an array of indices, rearrange the characters of the string so that each character is placed at the position specified by the corresponding index in the array.
//Example
//input: "abcd", [0, 3, 1, 2]
//output: "acdb"
//Explanation
//The character 'a' is placed at index 0.
//The character 'b' is placed at index 3.
//The character 'c' is placed at index 1.
//The character 'd' is placed at index 2.
//Notes
//The string and the array will be of equal length.
//The string will contain valid characters (A-Z, a-z, or 0-9);
//the array will contain valid indices.
package com.example.demo;

public class StringScramble {

    public static String scramble(String str, int[] indices) {
        int length = str.length();
        char[] result = new char[length];
        for(int i = 0; i <length; i++){
            result[indices[i]] = str.charAt(i);
        }
        return new String(result);
    }
}