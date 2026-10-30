package com.example;

class Animals {
    protected double size;
    protected double weight;
    protected boolean predator;

    public Animals(double size, double weight, boolean predator) {
        this.size = size;
        this.weight = weight;
        this.predator = predator;
    }

    public void describe() {
        System.out.println("Size: " + size + " cm, Weight: " + weight + " kg, "
                + (predator ? "Predator" : "Vegetarian"));
    }
}

class Bird extends Animals {
    private String species;
    private double wingspan;

    public Bird(double size, double weight, boolean predator,
                String species, double wingspan) {
        super(size, weight, predator);
        this.species = species;
        this.wingspan = wingspan;
    }

    @Override
    public void describe() {
        System.out.print(species + " | ");
        super.describe();
        System.out.println("  Wingspan: " + wingspan + " cm");
    }
}

class LandAnimal extends Animals {
    private String species;
    private int legs;

    public LandAnimal(double size, double weight, boolean predator,
                      String species, int legs) {
        super(size, weight, predator);
        this.species = species;
        this.legs = legs;
    }

    @Override
    public void describe() {
        System.out.print(species + " | ");
        super.describe();
        System.out.println("  Legs: " + legs);
    }
}

class Fish extends Animals {
    private String species;
    private int fins;

    public Fish(double size, double weight, boolean predator,
                String species, int fins) {
        super(size, weight, predator);
        this.species = species;
        this.fins = fins;
    }

    @Override
    public void describe() {
        System.out.print(species + " | ");
        super.describe();
        System.out.println("  Fins: " + fins);
    }
}

public class App {
    public static void main(String[] args) {
        Animals[] animals = {
            new Bird(90, 5.5, true, "Bald Eagle", 220),
            new LandAnimal(600, 5000, false, "Elephant", 4),
            new Fish(500, 1100, true, "Great White Shark", 5)
        };

        for (Animals a : animals) {
            a.describe();
        }
    }
}