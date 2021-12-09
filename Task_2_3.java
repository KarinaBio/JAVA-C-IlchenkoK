package com.univ;

import java.util.Scanner;

public class Task_2_3 {
    public static void main(){
        String s1;
        Scanner sc = new Scanner(System.in);
        s1 = sc.nextLine();

        char ans = s1.charAt(0);
        int len = 1;
        int i = 1;
        while (s1.charAt(i) == ans){
            len += 1;
            i+=1;
        }
        char tmp;
        int tmp_cnt;
        while (i < s1.length()){
            tmp = s1.charAt(i);
            tmp_cnt = 1;
            i+=1;
            while (i < s1.length()){
                if (s1.charAt(i) == tmp){
                    tmp_cnt += 1;
                    i+= 1;
                } else {
                    break;
                }
            }
            if (tmp_cnt > len){
                ans = tmp;
                len = tmp_cnt;
            }
        }
        System.out.println(ans + "   " + len);

    }
}
