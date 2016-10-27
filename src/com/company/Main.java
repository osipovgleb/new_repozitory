package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int[][] a = new int[n][m];
        
        int value = 0;
        for (int j = 0; j < m; j++) {
            for (int i = 0; j - i >= 0 && i < n; i++) {
                a[i][j - i] = value;
                value++;
            }
        }
        for (int i = 1; i < n; i++) {
            for (int j = 0;i+j<n  && m - 1 - j >= 0; j++) {
                a[i + j][m - 1 - j] = value;
                value++;
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(a[i][j]);
            }
            System.out.println("");
        }
    }

}


/*    */