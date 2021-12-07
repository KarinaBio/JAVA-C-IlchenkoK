package com.univ.Task_4_0;

public class ConnectionManager {
    private Connection cons[];
    private int n;
    private int current;

    ConnectionManager(){
        current = 0;
    }

    ConnectionManager(int n){
        this.n = n;
        cons = new Connection[n];
        current = 0;
    }

    ConnectionManager(String[] mas){
        current = 0;
        this.n = mas.length;
        cons = new Connection[this.n];
        for(int i = 0; i < mas.length; i++){
            cons[i] = new Connection(mas[i]);
        }
    }

    public Connection getConnection(int i){
        assert (i>=0): "Negative index";
        if(i >= n)
            return new Connection("No connection");
        return cons[i];
    }

    public Connection getConnection(){
        assert (current<n): "no connection";
        return cons[current++];
    }

    public boolean existConnection(){
        return current<n;
    }
}
