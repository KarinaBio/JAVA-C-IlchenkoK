package com.univ.Task_6_10;

public abstract class Car {
    private String id;
    private int speed;
    private int fuel;
    private int cost;

    public Car(){
        id = "1";
        speed = 0;
        fuel = 0;
        cost = 0;
    }
    public Car(String id, int speed, int fuel, int cost){
        this.id = id;
        this.cost = cost;
        this.fuel =fuel;
        this.speed = speed;
    }

    public String getId() {
        return id;
    }

    public int getSpeed() {
        return speed;
    }

    public int getFuel() {
        return fuel;
    }

    public int getCost() {
        return cost;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setFuel(int fuel) {
        this.fuel = fuel;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id='" + id + '\'' +
                ", speed=" + speed +
                ", fuel=" + fuel +
                ", cost=" + cost +
                '}';
    }
}
