package com.univ.task_2_1;

import java.util.Date;

public class Student {
    private int id;
    private String PIB;
    private String adress;
    private Date birth;
    private String facultet;
    private int kurs;
    private String group;

    public Student(int id, String PIB, String adress, Date birth, String facultet, int kurs, String group) {
        this.id = id;
        this.PIB = PIB;
        this.adress = adress;
        this.birth = birth;
        this.facultet = facultet;
        this.kurs = kurs;
        this.group = group;
    }

    public int getId() {
        return id;
    }

    public String getPIB() {
        return PIB;
    }

    public String getAdress() {
        return adress;
    }

    public Date getBirth() {
        return birth;
    }

    public String getFacultet() {
        return facultet;
    }

    public int getKurs() {
        return kurs;
    }

    public String getGroup() {
        return group;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setPIB(String PIB) {
        this.PIB = PIB;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }

    public void setFacultet(String facultet) {
        this.facultet = facultet;
    }

    public void setKurs(int kurs) {
        this.kurs = kurs;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    @Override
    public String toString()
    {
        return "Student {" + PIB + ", " + facultet + ", " + kurs + ", " + group + "}";
    }
}
