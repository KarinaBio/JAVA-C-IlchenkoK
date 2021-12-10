package com.univ.Task_5_15;

public class Task_5_15_Main {

    public static void main() {

        try {
            Window w1 = new Window("1");
            Window w2 = new Window("2");
            Window w3 = new Window("3");
            Window[] windows = new Window[]{w1,w2,w3};
            try {
                Door d1 = new Door(1);
                Door d2 = new Door(2);
                Door[] doors = new Door[]{d1, d2};
                int[] walls = {1,2,3,4};
                House house = new House(windows,doors,walls);
                house.print_num_doors();
                house.print_num_windows();
                house.close_the_door(d1);
                System.out.println(d1.isIs_closed());
                System.out.println(d2.isIs_closed());
            } catch (WrongDoor ee){
                System.out.println(ee.getMessage());
            }
        } catch (EmptyWindow e){
            System.out.println(e.getMessage());}

    }
}
