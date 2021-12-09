package com.univ;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Task_from_5_to_8 {
    public static void main(){
        String s1;
        Scanner sc = new Scanner(System.in);
        s1 = sc.nextLine();
        s1 = s1.replaceAll("^ +| +$|( )+", "$1");

        //5
        String[] arr = s1.split(" ");
        List<String> words = new ArrayList<>();
        for (String word: arr
             ) {
            if(word.equals("small") || word.equals("large"))
                words.add("very");
            words.add(word);
        }
        for (String word: words
             ) {
            System.out.print(word + " ");
        }
        System.out.println();

        //6
        StringBuffer sb = new StringBuffer(s1);
        sb.append(", that we use to ilustrate the methods of class StringBuffer");
        System.out.println(sb.toString());

        //7
        int cnt_words = arr.length, cnt_symbols = s1.length();
        int cnt_znaks = 0, cnt_sentence = 0;
        for(int i = 0; i < s1.length(); i++)
        {
            if(s1.charAt(i) == ','
                    || s1.charAt(i) == ':'
                    || s1.charAt(i) == ';')
            {
                cnt_znaks++;
            }
            if (s1.charAt(i) == '.'
            || s1.charAt(i) == '!'
            || s1.charAt(i) == '?')
            {
                cnt_znaks++;
                cnt_sentence++;
            }
        }
        System.out.println("Symbols: " + cnt_symbols);
        System.out.println("Words: " + cnt_words);
        System.out.println("Znaks: " + cnt_znaks);
        System.out.println("Sentences: " + cnt_sentence);

        //8
        String enter_word = sc.nextLine();
        for (String word: arr
             ) {
            if(enter_word.toLowerCase(Locale.ROOT).equals(word.toLowerCase(Locale.ROOT)))
            {
                System.out.println("Yes");
                return;
            }
        }
        System.out.println("No");
    }
}
