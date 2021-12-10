package com.univ.Task_6_10;

public class Sedan extends Car {
    private int age;

    public Sedan(){
        super();
        age = 0;
    }
    public Sedan(String id, int fuel, int cost, int speed, int age){
        super(id,speed,fuel,cost);
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return super.toString() + "Sedan{" +
                "age=" + age +
                '}';
    }
}
