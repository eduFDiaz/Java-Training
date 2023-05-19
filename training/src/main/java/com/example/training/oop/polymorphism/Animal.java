package com.example.training.oop.polymorphism;

// Method Overriding
class Animal {
    void makeSound() {
        System.out.println(this.getClass().getSimpleName()+ " makes a sound");
    }
}

class Dog extends Animal {
    @Override
    void makeSound() {
        System.out.println("Bark");
    }
}

class Mice extends Animal {
}