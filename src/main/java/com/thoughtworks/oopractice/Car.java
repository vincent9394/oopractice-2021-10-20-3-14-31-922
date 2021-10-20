package com.thoughtworks.oopractice;

public class Car extends Vehicle {

        public Car(Engine engine){
            super("car",engine.getSpeed());
        }

}
