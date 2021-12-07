package com.univ.Task_4_1;

import java.util.ArrayList;
import java.util.List;

public class Task_4_1_Main {
    public static void main(){
        List<Fraction> list = new ArrayList<>();
        list.add(new Fraction(4, 10));
        list.add(new Fraction(3, 5));
        list.add(new Fraction(2, 3));
        list.add(new Fraction(4, 6));
        for (Fraction frac: list
        ) {
            frac.Skorotiti();
        }
        Polinom polinom1 = new Polinom(list);
        Polinom polinom2 = new Polinom(list);
        System.out.println(polinom1.addPolinom(polinom2));
    }
}
