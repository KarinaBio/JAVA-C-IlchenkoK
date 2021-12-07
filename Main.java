package com.univ;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //Task_1_1();
        //Task_1_2();
        //Task_1_3();
        //Task_1_5();
        Task_1_6();
    }

    public static void Task_1_1() {
        String[] mas = {"a1", "a2"};

        for (String s : mas) {
            System.out.println(s);
        }

        String[] mas2 = new String[2];
        mas2[0] = "b1";
        mas2[1] = "b2";
        for (int i = 0; i < mas2.length; i++) {
            System.out.println(mas2[i]);
        }
    }

    public static void Task_1_2() {
        Scanner scanner = new Scanner(System.in);
        String[] array = scanner.nextLine().split(" ");
        Integer[] mas = new Integer[array.length];
        for (int i = 0; i < mas.length; i++) {
            mas[i] = Integer.parseInt(array[i]);
        }
        Integer min = mas[0], max = mas[0];
        for (int i = 1; i < mas.length; i++) {
            if (min > mas[i])
                min = mas[i];
            if (max < mas[i])
                max = mas[i];
        }
        System.out.println("Min: " + min);
        System.out.println("Max: " + max);
    }

    public static void Task_1_3() {
        System.out.println("Введіть кількість значень: ");
        int n;
        double sum = 0f;
        Scanner in = new Scanner(System.in);
        n = in.nextInt();

        double[] numArray = new double[n];
        for(int i = 0; i < n; i++)
        {
            numArray[i] = in.nextDouble();
            sum+=numArray[i];
        }
        double mean = sum/n, standartDeviation = 0.0;
        System.out.println("Mean: " + mean);
        for(double num: numArray)
        {
            standartDeviation += Math.pow(num - mean, 2);
        }
        System.out.println("standartDeviation: " + standartDeviation);
    }
    public static void Task_1_5() {
        Scanner in = new Scanner(System.in);

        double x = in.nextDouble();
        double y = in.nextDouble();
        double z = in.nextDouble();

        double bestX = Double.NaN;
        double bestY = Double.NaN;
        double bestZ = Double.NaN;
        double bestDist = Double.POSITIVE_INFINITY;

        while(in.hasNextDouble())
        {
            double xi = in.nextDouble();
            double yi = in.nextDouble();
            double zi = in.nextDouble();
            double dist = Math.pow(x - xi, 2) + Math.pow(y- yi,2) + Math.pow(z -zi, 2);
            if(dist < bestDist)
            {
                bestX = xi;
                bestY = yi;
                bestZ = zi;
                bestDist = dist;
            }
        }
        System.out.printf("Closest point = {%f, %f, %f)\n", bestX, bestY, bestZ);
    }
    public static void Task_1_6(){
        System.out.println("Введіть рядок чисел: ");
        Scanner scanner = new Scanner(System.in);
        String[] array = scanner.nextLine().split(" ");
        int min = array[0].length();
        for(int i = 1; i < array.length; i++)
        {
            if(min > array[i].length())
                min = array[i].length();
        }
        for(int i = 0; i < array.length; i++)
        {
            if(array[i].length() == min)
            {
                System.out.println(array[i]);
            }
        }
    }
}