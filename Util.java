package com.univ.Task_4_1;

public class Util {
    public static int gcd(int a, int b) {
        if (b==0) return a;
        return gcd(b,a%b);
    }

    public static int least_common_multiple(int a, int b) {
        return (a*b)/gcd(a, b);
    }
}
