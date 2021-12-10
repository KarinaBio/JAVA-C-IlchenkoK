package com.univ.Task_5_1;

public class Task_5_1_Main {
    public static void main(){
        Word word1 = new Word("Hello");
        Word word2 = new Word("my");
        Word word3 = new Word("comrades");
        Word mas[] = new Word[]{word1, word2, word3};
        Sentence sentence1 = new Sentence(mas);
        Sentence sentence2 = new Sentence(mas);
        Sentence sentence3 = new Sentence(mas);
        Sentence mas2[] = new Sentence[]{sentence1, sentence2, sentence3};
        Text text = new Text(mas2);
        Text text2 = new Text(mas2);
        System.out.println(text);
        System.out.println(text.equals(text2));
        System.out.println(text.hashCode());
    }
}
