package com.univ.Task_6_10;

public class Task_6_10_Main {
    public static void main() {
        Sedan s1 = new Sedan("1", 8, 100000, 100, 1);
        Sedan s2 = new Sedan("2", 7, 200000, 90, 10);
        Sedan s3 = new Sedan("3", 6, 150000, 130, 12);
        Sedan s4 = new Sedan("4", 8, 170000, 120, 2);
        Cabriolet c1 = new Cabriolet("5", 9, 300000, 130, "black");
        Cabriolet c2 = new Cabriolet("6", 8, 500000, 150, "black");
        Sedan[] sedans = new Sedan[]{s1,s2,s3,s4};
        Cabriolet[] cabriolets = new Cabriolet[]{c1,c2};
        Taxopark taxopark = new Taxopark(sedans, cabriolets);
        System.out.println(taxopark.getCost());
        System.out.println(taxopark.getMaxFuel());
        System.out.println(taxopark.getMinFuel());
    }
}
