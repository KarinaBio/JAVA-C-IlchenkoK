package com.univ.Task_5_1;

public class Word{
    private String word;

    public Word(String word) {
        this.word = word;
    }

    public Word() {
        this.word = "";
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    @Override
    public String toString(){
        return word;
    }

    public boolean equals(Word other){
        if (word == null)
            return other.word == null;
        return this.word.equals(other.word);
    }

    @Override
    public int hashCode(){
        int p = 31;
        int hash = 0;
        long p_pow = 1;
        for(int i = 0; i <this.word.length(); i++){
            hash = (int)(hash + (this.word.charAt(i) - 'a' + 1) * p_pow);
            p_pow = p_pow*p;
        }
        return hash;
    }
}
