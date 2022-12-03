package com.univ;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task_2_1_and_2_2 {
    static Scanner sc = new Scanner(System.in);
    static Random rnd = new Random();

    public static void run(){
        int n;
        System.out.print("n = ");
        n = sc.nextInt();
        int[][] matr = inputRandomSquareMatrix(n);
        showMatrix(matr);
        System.out.println("-----------------");
        matr = sortRows(matr);
        showMatrix(matr);
        System.out.println("-----------------");
        cyclicShift(matr, 2);
        showMatrix(matr);
    }

    static void showMatrix(int[][] matr) {
        for (int i = 0; i < matr.length; i++) {
            for (int j = 0; j < matr[i].length; j++) {
                System.out.print(" " + matr[i][j]);
            }
            System.out.println();
        }
    }

    static int[][] inputSquareMatrix(int n) {
        int[][] res = new int[n][n];
        for (int i = 0; i < n * n; i++) {
            System.out.printf("a[%d][%d] = ", i / n, i % n);
            res[i / n][i % n] = sc.nextInt();
        }
        return res;
    }

    static int[][] inputRandomSquareMatrix(int n) {
        int[][] res = new int[n][n];
        for (int i = 0; i < n * n; i++) {
            res[i / n][i % n] = rnd.nextInt(2 * n + 1) - n;
        }
        return res;
    }

    static void cyclicShift(int[][] matr, int k) {
        for (int i = 0; i < matr.length; i++) {
            int[] row = new int[matr[i].length];
            for (int j = 0; j < matr[i].length; j++) {
                if (j + k < matr[i].length)
                    row[j] = matr[i][j + k];
                else
                    row[j] = matr[i][j + k - matr[i].length];
            }
            for (int j = 0; j < matr[i].length; j++) {
                matr[i][j] = row[j];
            }
        }
    }

    static int[][] sortRows(int[][] matr) {
        int n = matr.length;
        int[][] res = new int[n][n];

        for(int i = 0; i < n; i++)
        {
            Arrays.sort(matr[i]);
            res[i] = matr[i].clone();
        }
        return res;
    }
}
