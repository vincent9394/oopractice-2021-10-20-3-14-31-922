package com.thoughtworks.oopractice;

public class Vehicle {
    private String name;
    private int speed;

    public Vehicle(String name, int speed) {
        this.name = name;
        this.speed = speed;
    }

    public void speedUp (){
        System.out.printf("%s : speed up to %d km/h \n", name, speed);
    }
}
