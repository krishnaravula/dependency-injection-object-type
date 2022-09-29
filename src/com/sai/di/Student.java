package com.sai.di;

public class Student {


    int id;


    Cheat cheat;

    public void setCheat(Cheat cheat) {
        this.cheat = cheat;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void cheating(){
        cheat.cheat();
        System.out.println("Id is " +id);
    }
}
