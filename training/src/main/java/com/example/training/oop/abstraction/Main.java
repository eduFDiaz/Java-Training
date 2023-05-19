package com.example.training.oop.abstraction;

//2 Q: What is the difference between an abstract class and an interface in Java?

//A: An abstract class is a class that cannot be instantiated and may have abstract and non-abstract methods. 
// An interface is a blueprint of a class that contains only abstract methods and constant (final) fields. 
// A class can extend only one abstract class but can implement multiple interfaces.

// Abstraction is a process of hiding the implementation details and showing only functionality to the user.

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.makeSound();
        dog.swim();
        dog.sleep();

        Horse horse = new Horse();
        horse.makeSound();
        horse.swim();
        horse.sleep();
    }
}