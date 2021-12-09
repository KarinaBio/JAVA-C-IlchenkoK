package com.univ.Task_6_1;

public class Flower extends Plant{
    private int lenghtOfFlower;

    public Flower(){
        super();
        lenghtOfFlower = 0;
    }

    public Flower(String name, double price, int color, int time, int lenghtOfFlower) {
        super(name, price, color, time);
        this.lenghtOfFlower = lenghtOfFlower;
    }

    public int getLenghtOfFlower() {
        return lenghtOfFlower;
    }

    public void setLenghtOfFlower(int lenghtOfFlower) {
        this.lenghtOfFlower = lenghtOfFlower;
    }
}
