package com.univ;

public class Main6 {

    public static void main(String[] args) {
        Task_2_1_and_2_2.run();
        Task_3_1_to_task_3_4 task = new Task_3_1_to_task_3_4();
        Task_3_1_to_task_3_4 task2 = new Task_3_1_to_task_3_4("John");
        Task_3_5_and_3_6 dog1 = new Task_3_5_and_3_6("spot", "Ruff!");
        Task_3_5_and_3_6 dog2 = new Task_3_5_and_3_6("scruffy", "Wurf!");
        dog1.bark();
        dog2.bark();
    }
}
