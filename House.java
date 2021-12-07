package com.univ;

import java.util.Date;

// Task 2.6
public class House {

    private int id;
    private int number;
    private double square;
    private int floor;
    private int num_rooms;
    private String street;
    private String type;
    private int expluatation;

    public House(int id, int number, double square,int floor,
            int num_rooms, String street, String type,int expluatation){
        this.id = id;
        this.number = number;
        this.square = square;
        this.floor = floor;
        this.num_rooms = num_rooms;
        this.street = street;
        this.type = type;
        this.expluatation = expluatation;
    }

    public double getSquare() {
        return square;
    }

    public int getExpluatation() {
        return expluatation;
    }

    public int getFloor() {
        return floor;
    }

    public int getId() {
        return id;
    }

    public int getNum_rooms() {
        return num_rooms;
    }

    public int getNumber() {
        return number;
    }

    public String getStreet() {
        return street;
    }

    public String getType() {
        return type;
    }

    public void setExpluatation(int expluatation) {
        this.expluatation = expluatation;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNum_rooms(int num_rooms) {
        this.num_rooms = num_rooms;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void setSquare(float square) {
        this.square = square;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "House{" +
                "id=" + id +
                ", number=" + number +
                ", square=" + square +
                ", floor=" + floor +
                ", num_rooms=" + num_rooms +
                ", street='" + street + '\'' +
                ", type='" + type + '\'' +
                ", expluatation=" + expluatation +
                '}';
    }
}