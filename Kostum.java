package com.univ.Task_7_11;

public class Kostum extends Odezsha{
    private double cost;

    public Kostum(String material, double cost) {
        this.material = material;
        this.cost = cost;
    }

    @Override
    public void getMaterial() {
        System.out.println("Material: " + material);
    }

    public double getCost() {
        return cost;
    }
}
