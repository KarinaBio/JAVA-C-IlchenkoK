package com.univ.Task_4_9;

public class Triangle  {
    private Point a;
    private Point b;
    private Point c;

    public Triangle(Point a, Point b, Point c){
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

    public void setA(Point a) {
        this.a = a;
    }

    public void setB(Point b) {
        this.b = b;
    }

    public void setC(Point c) {
        this.c = c;
    }

    @Override
    public String toString() {
        return "Triangle{" + "a=" + a.toString() +
                ", b=" + b.toString() +
                ", c=" + c.toString() + '}';
    }

    public double get_side_ab(){
        return Math.sqrt(Math.pow(a.getX() - b.getX(), 2) + (Math.pow(a.getY() - b.getY(), 2)));
    }
    public double get_side_bc(){
        return Math.sqrt(Math.pow(c.getX() - b.getX(), 2) + (Math.pow(c.getY() - b.getY(), 2)));
    }
    public double get_side_ac(){
        return Math.sqrt(Math.pow(a.getX() - c.getX(), 2) + (Math.pow(a.getY() - c.getY(), 2)));
    }

    public double Perimeter(){
        return get_side_ab() + get_side_ac() + get_side_bc();
    }
    public double Square(){
        double p = Perimeter() / 2;
        return Math.sqrt(p * (p-get_side_bc()) * (p-get_side_ac()) * (p-get_side_ab()));
    }

}
