package com.univ.Task_6_1;

public class Task_6_1_Main {
    public static void main(){
        Flower f1 = new Flower("Rosa", 10, 300215, 1, 5);
        Flower f2 = new Flower("Fialka", 5, 113252, 2, 8);
        Flower f3 = new Flower("Rosa", 12, 294322, 4, 3);
        Flower []flowers = new Flower[]{f1, f2, f3};
        Grass g1 = new Grass("Sino", 5, 221342, 10, false);
        Grass []grasses = new Grass[]{g1};
        Additional a1 = new Additional("Strip", 3);
        Additional a2 = new Additional("Strip", 5);
        Additional []additionals = new Additional[]{a1,a2};
        Buket buket = new Buket(flowers, grasses, additionals);
        System.out.println(buket.getPrice());
        System.out.println(buket.getFlowerByLenght(4, 7));
    }
}
