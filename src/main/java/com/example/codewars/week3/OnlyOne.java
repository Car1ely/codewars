package com.example.codewars.week3;

//Task: Write a function which returns True if ONLY ONE of the boolean flag is True,
// otherwise return False. If there are no boolean flag, return False
//6 kyu
//https://www.codewars.com/kata/5734c38da41454b7f700106e/train/java

import java.util.Arrays;

public class OnlyOne {
    public static boolean onlyOne(Boolean... args) {
        if (args == null || args.length == 0) {
            return false;
        }
        return Arrays.stream(args)
            .filter(arg -> arg != null && arg)
            .count() == 1;
    }
}