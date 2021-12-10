package com.univ.Equation;

public class QuadraticEquation {
    private double a;
    private double b;
    private double c;

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public void getResult(){
        double d = b*b - 4*a*c;
        if(d < 0) {
            System.out.println("diskriminant < 0");
        }
        if(d==0){
            if(a == 0)
            {
                if(b == 0)
                {
                    System.out.println("a=0, b=0, equation does not make sense");
                }
                else
                {
                    System.out.println("x = " + (-c/b));
                }
            }
            else
            {
                System.out.println("x = " + (-b+Math.sqrt(d))/(2*a));
            }
        }
        if(d > 0){
            if(a == 0)
            {
                if(b == 0)
                {
                    System.out.println("a=0, b=0, equation does not make sense");
                }
                else
                {
                    System.out.println("x = " + (-c/b));
                }
            }
            else
            {
                System.out.println("x1 = " + (-b+Math.sqrt(d))/(2*a));
                System.out.println("x2 = " + (-b-Math.sqrt(d))/(2*a));
            }
        }
    }
}
