package com.univ.Task_3_10;

public class Line {
    // пряма задається у вигляді y = kx + b

    private double k;
    private double b;

    public Line(double k, double b){
        this.k = k;
        this.b = b;
    }

    public double getB() {
        return b;
    }

    public double getK() {
        return k;
    }

    public void setB(double b) {
        this.b = b;
    }

    public void setK(double k) {
        this.k = k;
    }

    @Override
    public String toString() {
        return "Line{" + "k=" + k + ", b=" + b + '}';
    }
    public double[] intersect_x(){
        double[] arr =  {-b/k, 0};
        return arr;
    }
    public double[] intersect_y(){
        double[] arr = {0, b};
        return arr;
    }
    public double[] a_intersect_b(Line line){
        double x = - (b - line.getB()) / (k - line.getK());
        double y = k * x - b;
        double[] arr = {x, y};
//        System.out.println(b - line.getB());
//        System.out.println(k - line.getK());
//        System.out.println(x);
        return arr;
    }
}
