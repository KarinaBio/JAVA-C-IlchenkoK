package com.univ.Task_6_1;

public class Buket {
    Flower[] flowers;
    Grass[] grasses;
    Additional[] additionals;

    public Buket(Flower[] flowers, Grass[] grasses, Additional[] additionals) {
        this.flowers = flowers;
        this.grasses = grasses;
        this.additionals = additionals;
    }

    public double getPrice(){
        double suma = 0.0;
        for (Flower f: flowers
             ) {
            suma += f.getPrice();
        }
        for (Grass g: grasses
             ) {
            suma += g.getPrice();
        }
        for (Additional a: additionals
             ) {
            suma += a.getPrice();
        }
        return suma;
    }

    public Flower getFlowerByLenght(int lower, int higher){
        for (Flower f: flowers
             ) {
            if(lower < f.getLenghtOfFlower() && f.getLenghtOfFlower() < higher)
                return f;
        }
        return new Flower();
    }
}
