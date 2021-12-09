package com.univ.Task_3;

import java.io.Serial;
import java.io.Serializable;
import java.util.Arrays;

class Students implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;
    public String name;
    public String course;
    public String book_of_grades;
    public int number_of_subjects;
    public int[] marks;

    Students(String name, String course, String book_of_grades, int number_of_subjects, int[] marks) {
        this.name = name;
        this.course = course;
        this.book_of_grades = book_of_grades;
        this.number_of_subjects = number_of_subjects;
        this.marks = marks;
    }

    @Override
    public String toString() {
        return "Student: {" +
                "name='" + name + '\'' +
                ", course='" + course + '\'' +
                ", book_of_grades='" + book_of_grades + '\'' +
                ", number_of_subjects=" + number_of_subjects +
                ", marks=" + Arrays.toString(marks) +
                '}';
    }
}
