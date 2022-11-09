package com.univ.task_1_5;

public class Task_1_5_Debug {
    public static void main(String args[]){
        printDebug("aa", "bb");
    }

    public static void printDebug(String... args){
        if(args.length == 0)
        {
            System.out.println("Жоден фргумент не передається");
            return;
        }

        for(int i = 0; i < args.length; i++)
        {
            System.out.print(args[i] + ", ");
        }
    }
}
