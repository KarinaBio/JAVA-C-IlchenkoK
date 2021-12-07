package com.univ;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Task_1_14();
        Task_1_26();
    }

    public static void Task_1_14() {
        System.out.println("Введіть рядок чисел: ");
        Scanner scanner = new Scanner(System.in);
        String[] array = scanner.nextLine().split(" ");
        Integer[] mas = new Integer[array.length];
        for (int i = 0; i < mas.length; i++) {
            mas[i] = Integer.parseInt(array[i]);
        }
        Integer[] mas_ans = new Integer[array.length];
        mas_ans[0] = mas[0];
        int j = 0;
        for (int i = 1; i < mas.length; i++) {
            if (mas[i] != mas_ans[j]){
                j += 1;
                mas_ans[j] = mas[i];
            }
        }
        for (int i = 0; i <= j; i++) {
            System.out.println(mas_ans[i]);
        }
    }
    public static void Task_1_26() {
        System.out.println("Введіть кількість пенні в монетах: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        // [50 , 25 , 10, 1]
        Integer[] mas = new Integer[4];
        String[] mas_str = {"50 коп", "25 коп","10 коп","1 коп"};
        mas[0] = n / 50;
        n = n % 50;
        mas[1] = n / 25;
        n = n % 25;
        mas[2] = n / 10;
        n = n % 10;
        mas[3] = n;
        for (int i = 0; i < mas.length; i++) {
            if (mas[i] != 0){
                System.out.println(mas_str[i] + " * " + mas[i]);
            }
        }
    }
}
