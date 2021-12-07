package com.univ;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //Task 1.1
//        int a1;
//        char a2;
//        String a3;
//        System.out.println(a1 + "\n" + a2 + "\n" + a3);
        //Task 1.2
        System.out.println("hello, world\n");
        //Task 1.3 - Дізнався
        //Task 1.4 - Правда
        //Task 1.5 and 1.6
        int a, b, c;
        Scanner scanner = new Scanner(System.in);
        a = scanner.nextInt();
        b = scanner.nextInt();
        c = scanner.nextInt();
        System.out.println(a + " " + b + " " + c);
        System.out.println("Suma: " + (a + b + c));
        //Task 2.1
        String stud;
        stud = scanner.next();
        System.out.println("Привіт, " + stud);
        scanner.close();
    }
}
