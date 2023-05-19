package com.example.training.designPatterns.factory;

// Factory Pattern is a creational pattern that provides an interface for creating objects
// in a superclass, but allows subclasses to alter the type of objects that will be created.
// This pattern is used when you don't know ahead of time what class object you need.    

public class Main {
    public static void main(String[] args) {
        Animal animal = AnimalFactory.createAnimal("cat");
        animal.speak();

        Animal animal2 = AnimalFactory.createAnimal("dog");
        animal2.speak();
    }
}
