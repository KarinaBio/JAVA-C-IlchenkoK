package com.univ.Task_6_1;

public abstract class Plant {
    private String name;
    private double price;
    private int color;
    private int time;

    public Plant(){
        name = "";
        price = 0;
        color = 0;
        time = 0;
    }

    public Plant(String name, double price, int color, int time) {
        this.name = name;
        this.price = price;
        this.color = color;
        this.time = time;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getColor() {
        return color;
    }

    public int getTime() {
        return time;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setColor(int color) {
        this.color = color;
    }

    public void setTime(int time) {
        this.time = time;
    }

    @Override
    public String toString(){
        return name;
    }
}
