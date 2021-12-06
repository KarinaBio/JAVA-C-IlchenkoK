package com.univ;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //3.6
        float a;
        a = 1.0f/10000.0f;
        System.out.println(a);
        double b;
        b = 1.0/10000.0;
        System.out.println(b);
        float c = 19.33E15f;
        System.out.println(c);
        double d = 19.33E15;
        System.out.println(d);
        float e = (float)Math.PI;
        System.out.println(e);
        double f = Math.E;
        System.out.println(f);
        float p = (float)Math.sqrt(5);
        System.out.println(p);
        float m = (float)Math.log(100);
        System.out.println(m);

        //3.7
        double m1, m2, r;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter m1: ");
        m1 = in.nextDouble();
        System.out.print("Enter m2: ");
        m2 = in.nextDouble();
        System.out.print("Enter r: ");
        r = in.nextDouble();
        double F = 6.673E-11*(m1*m2)/(r*r);
        System.out.println("F: " + F);

        double X;
        System.out.print("Enter X: ");
        X = in.nextDouble();
        System.out.println("Int: " + (int)X);
        System.out.println("Chastinka: " + (X - (int)X));
        if((X - (int)X) < -0.00000001)
            System.out.println("Int max: " + ((int)X));
        else
            System.out.println("Int max: " + ((int)X + 1));
        if((X - (int)X) < 0.00000001)
            System.out.println("Int min: " + ((int)X - 1));
        else
            System.out.println("Int min: " + (int)X);
        in.close();

        System.out.println("Res: " + Rosenbrock2d(1,1));
        System.out.println("Res: " + Rosenbrock2d(2,4));
        System.out.println("Res: " + Rosenbrock2d(2.5,4.3));
    }

    public static double Rosenbrock2d(double x, double y)
    {
        return 100*Math.pow((x*x - y),2) + Math.pow(x-1, 2);
    }
}