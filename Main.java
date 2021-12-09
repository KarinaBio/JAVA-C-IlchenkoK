package com.univ;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

// Task 9
public class Main {
    public static Segment max_segment(List<Segment> segments){
        Segment ans = segments.get(0);
        double max = segments.get(0).length();
        for (Segment sss : segments){
            if (sss.length() > max){
                ans = sss;
                max = ans.length();
            }
        }
        return ans;
    }

    public static Rectangle max_perimeter(List<Rectangle> rectangles){
        Rectangle ans = rectangles.get(0);
        double max = rectangles.get(0).perimeter();
        for (Rectangle rrr : rectangles){
            if (rrr.perimeter() > max){
                ans = rrr;
                max = ans.perimeter();
            }
        }
        return ans;
    }

    public static Circle min_square(List<Circle> circles){
        Circle ans = circles.get(0);
        double min = circles.get(0).square();
        for (Circle ccc : circles){
            if (ccc.square()  < min){
                ans = ccc;
                min = ans.square();
            }
        }
        return ans;
    }

    public static void main(String[] args) {

        Segment s;
        Circle c;
        Rectangle r;

        List<Segment> segments = new ArrayList<>();
        List<Circle> circles = new ArrayList<>();
        List<Rectangle> rectangles = new ArrayList<>();
        try{
            Scanner scanner = new Scanner(new File("src/com/univ/data.txt"));
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] obj = line.split(" ");
                System.out.println(line);
                // Segment
                if (Integer.parseInt(obj[0]) == 1){
                    s = new Segment(1, Integer.parseInt(obj[1]), Integer.parseInt(obj[2]), Integer.parseInt(obj[3]),Integer.parseInt(obj[4]));
                    segments.add(s);
                } else if (Integer.parseInt(obj[0]) == 2){
                    r = new Rectangle(2, Integer.parseInt(obj[1]), Integer.parseInt(obj[2]), Integer.parseInt(obj[3]),Integer.parseInt(obj[4]));
                    rectangles.add(r);
                } else  if (Integer.parseInt(obj[0]) == 3){
                    c = new Circle(3, Integer.parseInt(obj[1]), Integer.parseInt(obj[2]), Integer.parseInt(obj[3]));
                    circles.add(c);
                }
            }
        }
        catch (IOException ex){
            System.out.println(ex.getMessage());
        }
        System.out.println("max_segment " + max_segment(segments).toString());
        System.out.println("max_perimeter " + max_perimeter(rectangles).toString());
        System.out.println("min_square " + min_square(circles).toString());
    }
}
