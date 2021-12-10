package com.univ.Task_3_10;

import java.util.ArrayList;
import java.util.List;

public class Task_3_10_Main {
    public static void main() {
        List<Line> list = new ArrayList<>();
        list.add(new Line(4, 7));
        list.add(new Line(4, -1));
        list.add(new Line(14, -1));
        list.add(new Line(2, 8));
        list.add(new Line(2, -4));
        list.add(new Line(4, -11));
        // intersect_y
        for (Line line : list){
            double[] ans = line.intersect_y();
            System.out.println(ans[0] + "  " +ans[1]);
        }
        // intersect_x
        System.out.println("------------------------");
        for (Line line : list){
            double[] ans = line.intersect_x();
            System.out.println(ans[0] + "  " +ans[1]);
        }
        // line.a_intersect_b
        System.out.println("------------------------");
        Line l1 = new Line(-3, 5);
        for (Line line : list){
            double[] ans = line.a_intersect_b(l1);
            System.out.println(ans[0] + "  " +ans[1]);
        }
        // parallel lines from list
        System.out.println("------------------------");
        for (int i = 0; i < list.size(); i++){
            for (int j = i + 1; j < list.size(); j++){
                if (list.get(i).getK() == list.get(j).getK()){
                    System.out.println("line " + (i+1) + " and line " + (j+1) + " parallel");
                }
            }
        }
    }

}
