package com.example.codewars.fourtask1;

public class task2 {
    public static void main(String[] args) {
        String[] testCases = {
            "-150",
            "150000",
            "1500000000",
            "213333333333333333333333333333333333",
            "-1000000000000"
        };

        for (String s : testCases) {
            try {
                long n = Long.parseLong(s);
                System.out.println(n + " can be fitted in:");
                if (n >= Byte.MIN_VALUE && n <= Byte.MAX_VALUE) {
                    System.out.println("* byte");
                }
                if (n >= Short.MIN_VALUE && n <= Short.MAX_VALUE) {
                    System.out.println("* short");
                }
                if (n >= Integer.MIN_VALUE && n <= Integer.MAX_VALUE) {
                    System.out.println("* int");
                }
                System.out.println("* long");

            } catch (Exception e) {
                System.out.println(s + " can not be fitted anywhere.");
            }
        }
    }
}
