package com.univ.Task_4_0;

public class Task_4_0_Main {
    public static void main(){
        String mas[] = {"mes1", "mes2", "mes3"};
        ConnectionManager cm = new ConnectionManager(mas);
        while(cm.existConnection()){
            cm.getConnection().show();
        }
    }
}
