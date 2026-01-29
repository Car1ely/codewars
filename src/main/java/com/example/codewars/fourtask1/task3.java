package com.example.codewars.fourtask1;
public class task3 {
    static int B;
    static int H;
    public static void main(String[] args) {
        int[][] testInputs = {
            {2, 3},
            {-1, 2}
        };

        for (int i = 0; i < testInputs.length; i++) {
             B = testInputs[i][0];
             H = testInputs[i][1];

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
}