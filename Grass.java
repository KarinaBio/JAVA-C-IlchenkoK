package com.univ.Task_6_1;

public class Grass extends Plant{
    private boolean live;

    public Grass(){
        super();
        live = false;
    }

    public Grass(String name, double price, int color, int time, boolean live) {
        super(name, price, color, time);
        this.live = live;
    }

    public boolean isLive() {
        return live;
    }

    public void setLive(boolean live) {
        this.live = live;
    }
}
