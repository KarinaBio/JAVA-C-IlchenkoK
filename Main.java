package com.univ;


import java.util.Random;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {

        // HW 1 : task 2.3

        Scanner in = new Scanner(System.in);
        float a = in.nextFloat();
        float b = in.nextFloat();
        double ans = Math.sqrt(a * b);
        System.out.print(a);
        System.out.print('\n');
        System.out.print(b);
        System.out.print('\n');
        System.out.print(ans);
        System.out.print('\n');
        System.out.printf("%e", ans);
    }
}
