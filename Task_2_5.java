package com.univ;

public class Task_2_5 {
    public static void Task_2_5()
    {
        int n = 0b11111100000000000000000000000000;
        int s = 0b10000000000000000000000000000000;
        int nd = n & s;
        int nd2 = nd >> 31;
        n = n << 1;
        n = n | nd2;
        System.out.println(Integer.toBinaryString(n));
        nd = n & s;
        nd2 = nd >> 11;
        n = n << 1;
        n = n | nd2;
        System.out.println(Integer.toBinaryString(n));
        nd = n & s;
        nd2 = nd >> 11;
        n = n << 1;
        n = n | nd2;
        System.out.println(Integer.toBinaryString(n));
        n = n << 1;
        n = n | nd2;
        System.out.println(Integer.toBinaryString(n));
        nd = n & s;
        nd2 = nd >> 11;
        n = n << 1;
        n = n | nd2;
        System.out.println(Integer.toBinaryString(n));
        nd = n & s;
        nd2 = nd >> 11;
        n = n << 1;
        n = n | nd2;
        System.out.println(Integer.toBinaryString(n));
        n = n << 1;
        n = n | nd2;
        System.out.println(Integer.toBinaryString(n));
        nd = n & s;
        nd2 = nd >> 11;
        n = n << 1;
        n = n | nd2;
        System.out.println(Integer.toBinaryString(n));
        nd = n & s;
        nd2 = nd >> 11;
        n = n << 1;
        n = n | nd2;
        System.out.println(Integer.toBinaryString(n));
    }
}
