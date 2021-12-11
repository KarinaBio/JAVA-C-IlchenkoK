package com.univ;

import java.util.Random;
import java.util.Scanner;

public class Main {

    // HW 3 : task 2.13
    public static void Sortxxx(int n, int m) {
        Scanner in = new Scanner(System.in);
        int[][] arr = new int[n][m];
        for (int i = 0; i < n; i += 1) {
            for (int j = 0; j < m; j += 1) {
                arr[i][j] = in.nextInt();
            }
        }

        for (int i = 0; i < n; i += 1) {
            int k = 0, p = 0;
            for (int j = 0; j < m; j += 1) {
                if (arr[i][j] == 0) {
                    p += 1;
                } else {
                    arr[i][k] = arr[i][j];
                    k += 1;
                }
            }
            for (int j = m-1; j > m-p-1; j -= 1){
                arr[i][j] = 0;
            }
        }

        for (int i = 0; i < n; i += 1) {
            for (int j = 0; j < m; j += 1) {
                System.out.print(arr[i][j] + "  ");
            }
            System.out.print('\n');
        }

    }

    public static void main(String[] args) {


        // HW 3 : task 2.13
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        Sortxxx(n, m);

    }
}
