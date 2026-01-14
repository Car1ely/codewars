//kyu:7
//link: https://www.codewars.com/kata/554b4ac871d6813a03000035
//task Examples
//highAndLow("1 2 3 4 5") // return "5 1"
//highAndLow("1 2 -3 4 5") // return "5 -3"
//highAndLow("1 9 3 4 -5") // return "9 -5"
//Notes
//All numbers are valid Int32, no need to validate them.
//There will always be at least one number in the input string.
//Output string must be two numbers separated by a single space, and highest number is first.
package com.example.demo;

public class HighestAndLowest {
    public static String highAndLow(String numbers) {
        String stringArray[] = numbers.split(" ");
        int min = Integer.parseInt(stringArray[0]);
        int max = Integer.parseInt(stringArray[0]);
        for(String num : stringArray){
            int current = Integer.parseInt(num);
            if(current > max){
                max = current;
            }
            if(current < min){
                min = current;
            }


        }
        return String.format("%d %d", max, min);
    }
}