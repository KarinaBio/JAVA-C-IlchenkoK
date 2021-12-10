package com.univ;

import java.util.Scanner;


public class Main {

    // HW 4 Task 4.20.k
    public static void main(String[] args) {
        int deg = 2;
        int i = 1, ii = 3, j = 8, jj = 6, k = -1;
        double x, ans = 1, tmp;
        Scanner scanner = new Scanner(System.in);
        x = scanner.nextDouble();
        ans += x / 2.0;
        while (true) {
            tmp = Math.pow(-1, k) * (Math.pow(x, deg) * i) / j;
            if (Math.abs(tmp) > 0.001) {
                ans += tmp;
                ii += 2;
                i *= ii;
                jj += 2;
                j *= jj;
                deg += 1;
                k += 1;

                continue;
            }
            System.out.println(ans);
            System.out.println(Math.sqrt(1.0+x));
            break;
        }
    }
}
