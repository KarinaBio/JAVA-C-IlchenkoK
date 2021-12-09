package com.univ;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.nio.file.Paths;
public class Main {

    public static void run(String filename1, String filename2) throws IOException {
        String content = Files.lines(Paths.get(filename1)).reduce("", String::concat);
        String s = content.replaceAll("^ +| +$|( )+", "$1");
        System.out.println(s);
        String[] words = s.split(" ");
        String max_word = "";
        for (String word: words
             ) {
            if(word.length() > max_word.length())
                max_word = word;
        }
        System.out.println("Max_word: " + max_word);
        System.out.println("Word_count: " + words.length);
        List<String> words2 = new ArrayList<>();
        for (String word: words
             ) {
            if(word.length() > 1)
                words2.add(word);
        }
        System.out.println("Word_count after deleting small words: " + words2.size());

        try(FileWriter writer = new FileWriter(filename2, false))
        {
            int cnt = 0;
            for (String word: words2
                 ) {
                if(cnt < 80)
                {
                    cnt += word.length();
                    writer.write(word + " ");
                }
                else
                {
                    writer.append('\n');
                    cnt = 0;
                }
            }
            writer.flush();
        }
        catch(IOException ex){

            System.out.println(ex.getMessage());
        }
    }

    public static void main(String[] args) {
        try{
            run("src/com/univ/filename1.txt", "src/com/univ/filename2.txt");
        }
        catch (IOException ex){
            System.out.println(ex.getMessage());
        }
    }
}
