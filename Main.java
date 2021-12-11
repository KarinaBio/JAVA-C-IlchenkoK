package com.univ;

import java.util.Random;
import java.util.Scanner;


public class Main {

    // HW 2 : task 4.2
    public static double Function(double x, double y){
        double a = x*x*y*y;
        double res = a;
        a *= x*y;
        res += a;
        a *= x*y;
        res += a;
        return (res);
    }

    public static void main(String[] args) {
        // HW 2 : task 3.22

        Scanner in = new Scanner(System.in);
        float a = in.nextFloat();
        float b = in.nextFloat();
        float c = in.nextFloat();
        double p = (a + b + c) / 2;
        double median1 = 0.5 * Math.sqrt(2 * a * a + 2 * b * b - c * c);
        double median2 = 0.5 * Math.sqrt(2 * a * a + 2 * c * c - b * b);
        double median3 = 0.5 * Math.sqrt(2 * c * c + 2 * b * b - a * a);
        double bisector1 = 2 * Math.sqrt(a * b * p * (p - c)) / (a + b);
        double bisector2 = 2 * Math.sqrt(a * c * p * (p - b)) / (a + c);
        double bisector3 = 2 * Math.sqrt(c * b * p * (p - a)) / (c + b);
        double height1 = (2 / a) * Math.sqrt(p * (p - a) * (p - b) * (p - c));
        double height2 = (2 / b) * Math.sqrt(p * (p - a) * (p - b) * (p - c));
        double height3 = (2 / c) * Math.sqrt(p * (p - a) * (p - b) * (p - c));
        System.out.print("median1 = " + median1 + '\n');
        System.out.print("median2 = " + median2 + '\n');
        System.out.print("median3 = " + median3 + '\n');
        System.out.print("bisector1 = " + bisector1 + '\n');
        System.out.print("bisector2 = " + bisector2 + '\n');
        System.out.print("bisector3 = " + bisector3 + '\n');
        System.out.print("height1 = " + height1 + '\n');
        System.out.print("height2 = " + height2 + '\n');
        System.out.print("height3 = " + height3 + '\n');


        // HW 2 : task 4.2

        double x = in.nextFloat();
        double y = in.nextFloat();
        System.out.print(Function(x, y));

    }
}
