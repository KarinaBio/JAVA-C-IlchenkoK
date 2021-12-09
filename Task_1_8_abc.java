package com.univ;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task_1_8_abc {

    public static void main(){
        String s1;
        Scanner sc = new Scanner(System.in);
        s1 = sc.nextLine();
        // a
        System.out.println("TASK a");
        try {
            int num = Integer.parseInt(s1);
            if (num % 9 == 0){
                System.out.println(num + " Кратне 9");
            }
            else if (num % 6 == 0){
                System.out.println(num + " Кратне 6");
            }
            else if (num % 4 == 0){
                System.out.println(num + " Кратне 4");
            } else {
                System.out.println(num);
            }
        } catch (NumberFormatException e) {
            System.out.println("Not an int number");
        }

        System.out.println("TASK b");
        // b
        char[] charArray = s1.toCharArray();
        try {
            int y = Character.getNumericValue(charArray[0]);
            if (y != s1.length() - 1){
                System.out.println("No");
            } else {
                boolean flag = true;
                for (int i = 1; i < charArray.length; i++) {
                    if (!Character.isLetter(charArray[i])) {
                        System.out.println("No");
                        flag = false;
                        break;
                    }
                }
                if (flag){
                    System.out.println("Yes");
                }
            }
        } catch (NumberFormatException e) {
            System.out.println("Not an int number");
        }
        // c
        System.out.println("TASK c");
        int digit;
        int letters_cnt = 0;
        boolean wrong = false;
        boolean flag = true;
        for (char c : charArray) {
            if (Character.isLetter(c)) {
                letters_cnt += 1;
            } else if (Character.isDigit(c) && flag){
                digit = Character.getNumericValue(c);
                flag = false;
            } else {
                wrong = true;
            }
        }
        if (!wrong){
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
