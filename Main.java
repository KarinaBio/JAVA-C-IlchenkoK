package com.univ;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;


public class Main {

    public static void main(String[] args) {

        List<House> houses = new ArrayList<>();
        houses.add(new House(1, 15, 34.6, 2, 2,
                "Street1", "type1", 45));
        houses.add(new House(2, 16, 134.6, 1, 3,
                "Street1", "type1", 45));
        houses.add(new House(3, 14, 234.6, 3, 3,
                "Street1", "type5", 45));
        houses.add(new House(4, 19, 38.6, 12, 2,
                "Street1", "type2", 45));

        // a
        for (House house: houses
        ) {
            if(house.getNum_rooms() == 3)
            {
                System.out.println(house.toString());
            }
        }
        System.out.println("/////////////////////////////////////////");

        // b
        for (House house: houses
        ) {
            if(house.getNum_rooms() == 3 && (house.getFloor() >= 2 && house.getFloor() < 5))
            {
                System.out.println(house.toString());
            }
        }
        System.out.println("/////////////////////////////////////////");

        // c
        for (House house: houses
        ) {
            if(house.getSquare() >= 100)
            {
                System.out.println(house.toString());
            }
        }
        System.out.println("/////////////////////////////////////////");

    }
}
