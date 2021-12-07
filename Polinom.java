package com.univ.Task_4_1;

import java.util.List;

public class Polinom {
    List<Fraction> list;

    public Polinom(List<Fraction> obj) {
        list = obj;
    }

    public List<Fraction> getList() {
        return list;
    }

    public void setList(List<Fraction> list) {
        this.list = list;
    }

    public Polinom addPolinom(Polinom polinom){
        if(list.size() != polinom.list.size())
        {
            System.out.println("Ця програма додає поліноми тільки однакової довжини.");
            return this;
        }
        else
        {
            for(int i = 0; i < list.size(); i++)
            {
                list.get(i).add(polinom.list.get(i));
            }
        }
        return this;
    }

    @Override
    public String toString(){
        String str = "{Polinom: " + list.get(0);
        for(int i = 1; i < list.size(); i++)
        {
            str += " + " + list.get(i) + "x^" + i ;
        }
        str += " }";
        return str;
    }
}
