package com.univ.Task_3_1;

import java.util.ArrayList;
import java.util.List;

public class Task_3_1_Main {
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
        Fraction res = new Fraction(1, 1);
        for (Fraction frac: list
             ) {
            res = addFrac(res, frac);
        }
        res.setNumerator(res.getNumerator() - res.getDenominator());
        System.out.println(res);
    }

    public static Fraction addFrac(Fraction fraction1, Fraction fraction2){
        Fraction frac = new Fraction(0, 0);
        frac.setDenominator(Util.least_common_multiple(fraction1.getDenominator(), fraction2.getDenominator()));
        frac.setNumerator(fraction1.getNumerator()*(frac.getDenominator()/fraction1.getDenominator()) + fraction2.getNumerator()*(frac.getDenominator()/fraction2.getDenominator()));
        return frac;
    }
}
