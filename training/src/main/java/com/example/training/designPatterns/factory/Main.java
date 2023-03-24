package com.example.training.designPatterns.factory;

public class Main {
    public static void main(String[] args) {
        Animal animal = AnimalFactory.createAnimal("cat");
        animal.speak();
        
    }
}
