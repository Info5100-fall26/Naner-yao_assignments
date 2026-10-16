package com.example;

abstract class Vehicle {
    String brand;
    String model;
    int wheels;

    Vehicle(String brand, String model, int wheels) {
        this.brand = brand;
        this.model = model;
        this.wheels = wheels;
    }

    abstract void move();

    void showInfo() {
        System.out.println(brand + " " + model + ", wheels: " + wheels);
    }
}

class Car extends Vehicle {
    Car(String brand, String model) {
        super(brand, model, 4);
    }

    void move() {
        System.out.println("The car drives on the road.");
    }
}

class Motorbike extends Vehicle {
    Motorbike(String brand, String model) {
        super(brand, model, 2);
    }

    void move() {
        System.out.println("The motorbike rides on the road.");
    }
}

class Aircraft extends Vehicle {
    Aircraft(String brand, String model) {
        super(brand, model, 3);
    }

    void move() {
        System.out.println("The aircraft flies in the air.");
    }
}

class Ship extends Vehicle {
    Ship(String brand, String model) {
        super(brand, model, 0);
    }

    void move() {
        System.out.println("The ship sails on the water.");
    }
}

public class App 
{
    public static void main( String[] args )
    {
        Vehicle[] vehicles = {
            new Car("Toyota", "Camry"),
            new Motorbike("Yamaha", "R1"),
            new Aircraft("Airbus", "A350"),
            new Ship("Carnival", "Panorama")
        };

        for (Vehicle v : vehicles) {
            v.showInfo();
            v.move();
            System.out.println();
        }

        System.out.println("Question: Which vehicle has no wheels?");
        for (Vehicle v : vehicles) {
            if (v.wheels == 0) {
                System.out.println("Answer: " + v.brand + " " + v.model);
            }
        }
    }
}