//kyu:6
//link:
//task: https://www.codewars.com/kata/5467e4d82edf8bbf40000155
// Your task is to make a function that can take any non-negative integer as an argument and return it with its digits in descending order. Essentially, rearrange
// the digits to create the highest possible number.
//Examples:
//Input: 42145 Output: 54421
// Input: 145263 Output: 654321
//Input: 123456789 Output: 987654321
package com.example.demo;

public class DescendingOrder {
    public static int sortDesc(final int num) {

        String numStr = String.valueOf(num);

        int[] digits = new int[numStr.length()];
        for (int i = 0; i < numStr.length(); i++) {
            digits[i] = numStr.charAt(i) - '0';
        }

        for (int i = 0; i < digits.length; i++) {
            for (int j = i + 1; j < digits.length; j++) {
                if (digits[j] > digits[i]) {
                    // swapping values
                    int temp = digits[i];
                    digits[i] = digits[j];
                    digits[j] = temp;
                }
            }
        }
        int result = 0;
        for (int digit : digits) {
            result = result * 10 + digit;
        }
        return result;
    }
}