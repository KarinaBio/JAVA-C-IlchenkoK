package com.univ.Task_6_10;

public class Cabriolet extends Car{
    private String color;

    public Cabriolet(){
        super();
        color = "black";
    }
    public Cabriolet(String id, int fuel, int cost, int speed, String color) {
        super(id, speed, fuel, cost);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {

        return super.toString() + " Cabriolet{" +
                "color='" + color + '\'' +
                '}';
    }

}
