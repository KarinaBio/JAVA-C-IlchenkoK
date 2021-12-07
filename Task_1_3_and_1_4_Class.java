package com.univ.task_1_3_and_1_4;

public class Task_1_3_and_1_4_Class {
    public String str1;
    protected String str2;
    private String str3;

    public Task_1_3_and_1_4_Class(String str1, String str2, String str3) {
        this.str1 = str1;
        this.str2 = str2;
        this.str3 = str3;
    }

    public void method()
    {
        Task_1_3_and_1_4_Class temp = new Task_1_3_and_1_4_Class("Hello, ", "Johnnie ", "Walker");
        System.out.println(temp.str1 + temp.str2 + temp.str3); // Можна звертатись до всього, бо ми в цьому класі
    }
}

