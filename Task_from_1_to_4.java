package com.univ;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task_from_1_to_4 {
    public static void main(){
        String s1;
        Scanner sc = new Scanner(System.in);
        s1 = sc.nextLine();
        s1 = s1.replaceAll("^ +| +$|( )+", "$1");

        //1
        String[] words = s1.split(" ");
        System.out.println("Words count: " + words.length);

        //2
        for(int i = words.length - 1; i >= 0; i--){
            System.out.print(words[i] + " ");
        }
        System.out.println();

        //3
        for(int i = 0; i < words.length; i++){
            if(words[i].equals("small"))
                words[i] = "very large";
            System.out.print(words[i] + " ");
        }
        System.out.println();

        //4
        List<String> words2 = new ArrayList<>();
        for (String word: words
             ) {
            if(word.equals("a") || word.equals("an"))
                continue;
            else
                words2.add(word);
            System.out.print(word + " ");
        }

    }
}
