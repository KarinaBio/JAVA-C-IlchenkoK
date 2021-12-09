package com.univ;

public class Circle {
    private int id;
    private int r;
    private int x;
    private int y;

    public Circle(int id, int x, int y, int r){
        this.id = id;
        this.r = r;
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "id=" + id +
                ", r=" + r +
                ", x=" + x +
                ", y=" + y +
                '}';
    }

    public int getR() {
        return r;
    }

    public void setR(int r) {
        this.r = r;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public double square(){
        return 3.14 * r * r;
    }
}
