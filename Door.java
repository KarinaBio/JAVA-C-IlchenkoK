package com.univ.Task_5_15;

import java.util.Objects;

public class Door {

    private int id;
    private boolean is_closed;

    public Door(int door){
        this.id = door;
        this.is_closed = false;
    };
    public Door(){
        this.id = 0;
        this.is_closed = false;
    }

    public boolean isIs_closed() {
        return is_closed;
    }

    public void setIs_closed(boolean is_closed) {
        this.is_closed = is_closed;
    }

    public int getDoor() {
        return id;
    }

    public void setDoor(int door) {
        this.id = door;
    }

    @Override
    public String toString() {return "Door{" +"door=" + id + '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Door door = (Door) o;
        return id == door.id && is_closed == door.is_closed;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
