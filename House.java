package com.univ.Task_5_15;

import java.util.Arrays;

public class House {

    private Window[] windows;
    private Door[] doors;
    private int[] walls;

    public House(Window[] windows, Door[] doors, int[] walls){
        this.doors = doors;
        this.walls = walls;
        this.windows = windows;
    }
    public void close_the_door(Door door){
        for (Door d : doors) {
            if (d.equals(door)) {
                door.setIs_closed(true);
            }
        }
    }
    public void print_num_windows(){
        System.out.println(windows.length);
    }
    public void print_num_doors(){
        System.out.println(doors.length);
    }

    public Door[] getDoors() {
        return doors;
    }

    public int[] getWalls() {
        return walls;
    }

    public void setDoors(Door[] doors) {
        this.doors = doors;
    }

    public void setWalls(int[] walls) {
        this.walls = walls;
    }

    public void setWindows(Window[] windows) {
        this.windows = windows;
    }

    public Window[] getWindows() {
        return windows;
    }

    @Override
    public String toString() {
        return "House{" +
                "windows=" + Arrays.toString(windows) +
                ", doors=" + Arrays.toString(doors) +
                ", walls=" + Arrays.toString(walls) +
                '}';
    }
}
