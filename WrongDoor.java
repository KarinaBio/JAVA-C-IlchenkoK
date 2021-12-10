package com.univ.Task_5_15;

public class WrongDoor extends Exception{
    int id;
    public WrongDoor(String message, int id){
        super(message);
        this.id = id;
    }
    public int getId() {
        return id;
    }
}
