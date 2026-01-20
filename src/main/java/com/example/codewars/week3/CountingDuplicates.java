//Count the number of Duplicates
//Write a function that will return the count of distinct case-insensitive alphabetic characters and numeric digits that occur more than once in the input string.
// The input string can be assumed to contain only alphabets (both uppercase and lowercase) and numeric digits.
//6 kyu
//link: https://www.codewars.com/kata/54bf1c2cd5b56cc47f0007a1
package com.example.codewars.week3;

import java.util.stream.Collectors;
import java.util.Map;
public class CountingDuplicates {
    public static int duplicateCount(String text) {
        return (int) text.toLowerCase()
            .chars()
            .mapToObj(c -> (char) c)
            .collect(Collectors.groupingBy(
                c -> c,        //по самому символу
                Collectors.counting()
            ))
            .values()
            .stream()
            .filter(count -> count > 1)
            .count();
    }
}
