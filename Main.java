package com.univ;

public class Main {
    public static void main(String[] args) {
        final int a = 0X1010000A;
        final int b = 0X1234DE;
        int c = a + b;
        System.out.println("A + B: " + Integer.toBinaryString(c));
        int bin = -0b10;
        int bin2 = 0b101110;
        c = bin + bin2;
        System.out.println("A + B: " + (-21%4));
        System.out.println("bin1 + bin2: " + Integer.toBinaryString(c));
        c = ~bin;
        System.out.println("~bin: " + Integer.toBinaryString(c));
        c = bin & bin2;
        System.out.println("b1 & b2: " + Integer.toBinaryString(c));
        c = bin | bin2;
        System.out.println("bin + bin2: " + Integer.toBinaryString(c));
        c = bin ^ bin2;
        System.out.println("bin ^ bin2: " + Integer.toBinaryString(c));
        c = bin << 2;
        System.out.println("bin << 2: " + Integer.toBinaryString(c));
        c = bin >> 2;
        System.out.println("bin >> 2: " + Integer.toBinaryString(c));
        c = bin >>> 2;
        System.out.println("bin >>> 2: " + Integer.toBinaryString(c));
        Task_2_2.Task2_2();
        Task_2_3.Task_2_3();
        Task_2_4.Task_2_4();
        Task_2_5.Task_2_5();
    }
}
