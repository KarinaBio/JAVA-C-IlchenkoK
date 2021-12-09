package com.univ.Task_3;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;

public class Task_3_main {
    public static void main() {
        Students[] students = {
                new Students("Pavlo", "1", "80", 2, new int[] {74, 69}),
                new Students("Oleg", "2", "25", 3, new int[] {26, 56, 89}),
                new Students("Ira", "3", "12", 1, new int[] {70}),
                new Students("Masha", "1", "32", 2, new int[] {85, 81})
        };
        writeFile("stds.stds", students);
        students = readFile("stds.stds");
        System.out.println(Arrays.toString(students));

        Students std = new Students("Roma", "4", "63", 2, new int[] {65, 48});

        assert students != null;
        students = addStudent(students, std);
        System.out.println(Arrays.toString(students));

        searchByName("stds.stds", "std.std", "pib3");
        searchByMark("stds.stds");
    }

    public static Students[] addStudent(Students[] students, Students student) {
        Students[] new_students = new Students[students.length + 1];
        for (int i = 0; i < students.length; i++) {
            new_students[i] = students[i];
        }
        new_students[students.length] = student;
        return new_students;
    }

    public static void searchByName(String file_read, String file_write, String name) {
        Students[] students = readFile(file_read);
        assert students != null;
        for (Students std: students) {
            if (name.equals(std.name)) {
                writeFile(file_write, new Students[] {std});
            }
        }
    }

    public static void searchByMark(String file_read) {
        Students[] students = readFile(file_read);
        assert students != null;
        double worst_mark = Double.MAX_VALUE;
        Students worst_std = null;
        for (Students std: students) {
            int[] marks = std.marks;
            double cur_mark = 0;
            for (int mark: marks) {
                cur_mark += mark;
            }
            cur_mark /= marks.length;
            if (cur_mark < worst_mark) {
                worst_mark = cur_mark;
                worst_std = std;
            }
        }
        System.out.println(worst_std);
    }

    public static void writeFile(String filename, Students[] std) {
        FileOutputStream fos;
        BufferedOutputStream bos;
        ObjectOutputStream oos;

        try {
            fos = new FileOutputStream(filename);
            bos = new BufferedOutputStream(fos);
            oos = new ObjectOutputStream(bos);

            for (Students s: std)
                oos.writeObject(s);

            oos.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static Students[] readFile(String filename) {
        FileInputStream fis;
        BufferedInputStream bis;
        ObjectInputStream ois;

        try {
            fis = new FileInputStream(filename);
            bis = new BufferedInputStream(fis);
            ois = new ObjectInputStream(bis);

            ArrayList<Students> list = new ArrayList<>();
            try {
                while (true) {
                    list.add((Students) ois.readObject());
                }
            } catch (EOFException e) {
                ois.close();
                return list.toArray(new Students[0]);
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}

