package com.univ.Task_5_15;

import java.util.Objects;

public class Window {
    private String window;

    public  Window(String window){
        this.window = window;
    }
    public Window(){
        this.window = "window";
    }

    public String getWindow() {
        return window;
    }

    public void setWindow(String window) {
        this.window = window;
    }

    @Override
    public String toString() {
        return "Window{" + "window='" + window + '\'' + '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Window window1 = (Window) o;
        return Objects.equals(window, window1.window);
    }

    @Override
    public int hashCode() {
        return Objects.hash(window);
    }
}
