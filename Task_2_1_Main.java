package com.univ.task_2_1;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Task_2_1_Main {
    public static void main()
    {
        List<Student> students = new ArrayList<>();
        students.add(new Student(1, "Pavlo Pinchuk", "London", new Date(2002, 6, 22), "mechmat", 3, "kompmat1"));
        students.add(new Student(2, "Urii Dud", "Leningrad", new Date(1999, 16, 01), "journalism", 4, "jm2"));
        students.add(new Student(3, "Anatolii Gul", "Kiev", new Date(1980, 10, 10), "mechmat", 2, "kompmat1"));
        students.add(new Student(4, "Michailo Gopkalo", "Katar", new Date(1990, 5, 20), "kompscience", 3, "kompsc2"));

        for (Student stud: students
             ) {
            if(stud.getBirth().after(new Date(1995, 1, 1)))
            {
                System.out.println(stud.toString());
            }
        }
        System.out.println("/////////////////////////////////////////");
        for (Student stud: students
        ) {
            if(stud.getKurs() == 3)
            {
                System.out.println(stud.toString());
            }
        }
        System.out.println("/////////////////////////////////////////");
        for (Student stud: students
        ) {
            if(stud.getFacultet() == "mechmat")
            {
                System.out.println(stud.toString());
            }
        }
        System.out.println("/////////////////////////////////////////");
        for (Student stud: students
        ) {
            if(stud.getGroup() == "kompmat1")
            {
                System.out.println(stud.toString());
            }
        }
    }
}
