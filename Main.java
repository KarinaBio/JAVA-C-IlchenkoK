package com.univ;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //task_3_2();
        //task_3_3();
        //task_3_4();
        //task_3_5();
        //task_4_20_a();
        //task_4_20_b();
    }

    public static void task_3_2() {
        Random rn = new Random();
        int n = rn.nextInt(50) + 10;
        System.out.println("Number: " + n);
        for (int i = 0; i < 25; i++) {
            int t = rn.nextInt() % 50;
            while (t <= n) {
                t = rn.nextInt() % 50;
            }
            System.out.println(t);
        }
    }

    public static void task_3_3() {
        Random rn = new Random();
        int n = rn.nextInt(6) + 1;
        System.out.println("Number: " + n);
    }

    public static void task_3_4() {
        int a, b, c;
        Scanner scanner = new Scanner(System.in);
        a = scanner.nextInt();
        b = scanner.nextInt();
        c = scanner.nextInt();
        if (a == b && b == c) {
            System.out.println("Res: 1");
        } else {
            if (a == b || b == c || c == a) {
                System.out.println("Res: 2");
            } else {
                System.out.println("Res: 3");
            }
        }
    }

    public static void task_3_5() {
        int a, b, c, d, e, tmp;
        Scanner scanner = new Scanner(System.in);
        a = scanner.nextInt();
        b = scanner.nextInt();
        c = scanner.nextInt();
        d = scanner.nextInt();
        e = scanner.nextInt();
        if (b < a) {
            tmp = a;
            a = b;
            b = tmp;
        }
        if (d < c) {
            tmp = c;
            c = d;
            d = tmp;
        }
        if (c < a) {
            tmp = b;
            b = d;
            d = tmp;
            c = a;
        }
        a = e;
        if (b < a) {
            tmp = a;
            a = b;
            b = tmp;
        }
        if (a < c) {
            tmp = b;
            b = d;
            d = tmp;
            a = c;
        }
        if (d < a)
            System.out.println(d);
        else
            System.out.println(a);
    }

    public static void task_4_20_a() {
        int i = 1, j = 1;
        long k = 1;
        double x, ans = 0, tmp = 0;
        Scanner scanner = new Scanner(System.in);
        x = scanner.nextDouble();
        while (true) {
            tmp = (Math.pow(x, i) * j) / k;
            if (Math.abs(tmp) > 0.001) {
                ans += tmp;
                j *= -1;
                k *= (i + 1);
                k *= (i + 2);
                i += 2;
                //System.out.println("i: " + i + ", j: " + j + ", k: " + k);
                continue;
            }
            System.out.println(ans);
            break;
        }
    }

    public static void task_4_20_b() {
        int i = 0, j = 1;
        long k = 1;
        double x, ans = 0, tmp = 0;
        Scanner scanner = new Scanner(System.in);
        x = scanner.nextDouble();
        while (true) {
            tmp = (Math.pow(x, i) * j) / k;
            if (Math.abs(tmp) > 0.01) {
                ans += tmp;
                j *= -1;
                k *= (i + 1);
                k *= (i + 2);
                i += 2;
                //System.out.println("i: " + i + ", j: " + j + ", k: " + k);
                continue;
            }
            System.out.println(ans);
            break;
        }
    }
}
