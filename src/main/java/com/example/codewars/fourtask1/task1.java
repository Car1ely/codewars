package com.example.codewars.fourtask1;

public class task1 {
    public static void main(String[] args) {
        int[][] queries = {
            {0, 2, 10}, // 10 раз
            {5, 3, 5}   // 5 раз
        };

        for (int i = 0; i < queries.length; i++) {
            int a = queries[i][0];
            int b = queries[i][1];
            int n = queries[i][2];

            int currentTerm = a;

            for (int j = 0; j < n; j++){
                currentTerm += (int) (Math.pow(2, j) * b) ;
                System.out.print(currentTerm + " ");
            }
            System.out.println();
        }
    }
}
