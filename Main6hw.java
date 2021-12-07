package com.univ;

import java.util.Scanner;
import java.util.Random;


public class Main {

    static Scanner sc = new Scanner(System.in);
    static Random rnd = new Random();

    public static void main6hw(String[] args) {

        Task_2_5();
    }

    static int[][] inputRandomSquareMatrix(int n) {
        int[][] res = new int[n][n];
        for (int i = 0; i < n * n; i++) {
            res[i / n][i % n] = rnd.nextInt(2 * n + 1);
        }
        return res;
    }

    static void showMatrix(int[][] matr) {
        for (int i = 0; i < matr.length; i++) {
            for (int j = 0; j < matr[i].length; j++) {
                System.out.print(" " + matr[i][j]);
            }
            System.out.println();
        }
    }

    public static void Task_2_5() {
        // transpose of a square matrix in place size = n
        int n;
        System.out.print("розмір матриці n = ");
        n = sc.nextInt();
        int[][] matrix = inputRandomSquareMatrix(n);
        showMatrix(matrix);
        System.out.println("-----------------");

        for (int i = 0; i < n; i++){
            for (int j = i + 1; j < n; j++){
                int tmp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = tmp;
            }
        }
        showMatrix(matrix);
    }
}
