package com.thoughtworks.oopractice;

public abstract class Engine {
    private int speed;

    public Engine(int speed) {
        this.speed = speed;
    }

    public int getSpeed(){
        return speed;
    }
}
