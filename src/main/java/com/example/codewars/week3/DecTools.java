package com.example.codewars.week3;
//Determine the total number of digits in the integer (n>=0) given as input to the function.
// For example, 9 is a single digit, 66 has 2 digits and 128685 has 6 digits.
// Be careful to avoid overflows/underflows.
//https://www.codewars.com/kata/58fa273ca6d84c158e000052/train/java
//7 kyu
public class DecTools {
    public static int Digits(long n) {
        return String.valueOf(n).length();
    }
}
    //        if (n == 0) return 1;
    //        // log10(100) = 2.0 -> (int)2.0 + 1 = 3 цифры
    //        return (int) Math.log10(n) + 1;

