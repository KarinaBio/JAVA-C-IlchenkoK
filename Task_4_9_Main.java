package com.univ.Task_4_9;

import com.univ.Task_3_10.Line;

import java.util.ArrayList;
import java.util.List;

public class Task_4_9_Main {

    public static Triangle max_square(List<Triangle> list){
        Triangle ans = list.get(0);
        double max_sq = ans.Square();
        for (Triangle triangle : list){
            if (triangle.Square() > max_sq){
                ans = triangle;
                max_sq = triangle.Square();
            }
        }
        return ans;
    }

    public static Triangle min_square(List<Triangle> list){
        Triangle ans = list.get(0);
        double min_sq = ans.Square();
        for (Triangle triangle : list){
            if (triangle.Square() < min_sq){
                ans = triangle;
                min_sq = triangle.Square();
            }
        }
        return ans;
    }

    public static void main() {
        List<Triangle> list = new ArrayList<>();
        Point a = new Point (0,0);
        Point b = new Point (0,2);
        Point c = new Point (2,0);
        Triangle t1 = new Triangle(a,b,c);
        System.out.println(t1.get_side_ab());
        System.out.println(t1.Perimeter());
        System.out.println(t1.Square());
        list.add(t1);
        a = new Point (0,0);
        b = new Point (0,3);
        c = new Point (2,0);
        Triangle t2 = new Triangle(a,b,c);
        list.add(t2);
        a = new Point (1,1);
        b = new Point (0,3);
        c = new Point (2,0);
        Triangle t3 = new Triangle(a,b,c);
        list.add(t3);
        a = new Point (1,1);
        b = new Point (3,3);
        c = new Point (4,0);
        Triangle t4 = new Triangle(a,b,c);
        list.add(t4);

        Triangle max;
        max = max_square(list);
        System.out.println(max.toString());
        System.out.println("max: "+max.Square());

        Triangle min;
        min = min_square(list);
        System.out.println(min.toString());
        System.out.println("min: "+min.Square());


    }
}
