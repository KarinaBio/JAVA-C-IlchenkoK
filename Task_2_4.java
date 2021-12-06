package com.univ;

public class Task_2_4 {
    public static void Task_2_4()
    {
        int a = 0b101;
        int b = 0b11111;
        int c = 0b1 << a-1;
        System.out.println(Integer.toBinaryString(a)
                + "\n" + Integer.toBinaryString(b)
                + "\n" + Integer.toBinaryString(c));
        System.out.println(Integer.toBinaryString(b^c));
    }
}
