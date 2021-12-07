package com.univ;

import com.univ.task_1_2.Task_1_2_Class;
import com.univ.task_1_3_and_1_4.Task_1_3_and_1_4_Class;
import com.univ.task_1_3_and_1_4.Task_1_3_and_1_4_Main;
import com.univ.task_1_5.Task_1_5_Main;
import com.univ.task_2_1.Task_2_1_Main;

public class Main {

    public static void main(String[] args) {
        Task_1_2_Class temp = new Task_1_2_Class("World");
//        temp.method_1(); - Не можна викликати, бо protected
        temp.method_2();
        Task_1_3_and_1_4_Main.Task_1_3_and_1_4_Main_Run();
        //Task_1_5_Main.Task_1_5_Main_Run();
        Task_2_1_Main.main();
    }
}
