package com.example.codewars.fourtask1;

public class task3 {
    static int B;
    static int H;

    static {
        int[][] testInputs = {
            {2, 3},
            {-1, 2}
        };

        for (int[] input : testInputs) {
            B = input[0];
            H = input[1];

            try {
                if (B <= 0 || H <= 0) {
                    throw new Exception("must be positive");
                }
                System.out.println(B * H);
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }

    public static void main(String[] args) {

    }
}