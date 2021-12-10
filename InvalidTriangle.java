package com.univ.Task_4_9;

public class InvalidTriangle extends Exception{
    private Point a;
    private Point b;
    private Point c;

    public InvalidTriangle(String message, Point a, Point b, Point c){
        super(message);
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public Point getA() {
        return a;
    }

    public Point getB() {
        return b;
    }

    public Point getC() {
        return c;
    }
}
