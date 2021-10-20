package com.thoughtworks.oopractice;

public class Driver {
    public static void main(String[] args) {
        Car honda = new Car(new GasolineEngine());
        Car tesla = new Car(new ElectricEngine());
        Truck hiace = new Truck();
        honda.speedUp();
        hiace.speedUp();
        tesla.speedUp();

    }
}
