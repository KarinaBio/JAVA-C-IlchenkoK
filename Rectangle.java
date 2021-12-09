package com.univ;

public class Rectangle {
    private int id;
    private int x1;
    private int x2;
    private int y1;
    private int y2;

    public Rectangle(int id, int x1, int y1, int x2, int y2){
        this.id = id;
        this.x1 = x1;
        this.x2 = x2;
        this.y1 = y1;
        this.y2 = y2;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "id=" + id +
                ", x1=" + x1 +
                ", x2=" + x2 +
                ", y1=" + y1 +
                ", y2=" + y2 +
                '}';
    }
    public int length_1(){
        return Math.abs(x1-x2);
    }
    public int length_2(){
        return Math.abs(y1-y2);
    }
    public int perimeter(){
        return 2*length_1() + 2*length_2();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getX1() {
        return x1;
    }

    public void setX1(int x1) {
        this.x1 = x1;
    }

    public int getX2() {
        return x2;
    }

    public void setX2(int x2) {
        this.x2 = x2;
    }

    public int getY1() {
        return y1;
    }

    public void setY1(int y1) {
        this.y1 = y1;
    }

    public int getY2() {
        return y2;
    }

    public void setY2(int y2) {
        this.y2 = y2;
    }
}
