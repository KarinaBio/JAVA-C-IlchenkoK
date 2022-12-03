package com.univ;

public class Task_3_5_and_3_6 {
    public String name;
    public String say;

    public Task_3_5_and_3_6(String name, String say) {
        this.name = name;
        this.say = say;
    }

    public void bark()
    {
        System.out.println(name + " say " + say);
    }
}
