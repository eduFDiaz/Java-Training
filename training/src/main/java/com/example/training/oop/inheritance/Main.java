package com.example.training.oop.inheritance;

//1 Q: Explain the concept of inheritance in Java, and provide an example. 

//A: Inheritance is one of the four fundamental principles of Object-Oriented Programming (OOP) that allows a class (subclass or derived class) to inherit properties and methods from another class (superclass or base class). This promotes code reusability and modular design. 

public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        car.display(); // This is a vehicle
        car.carInfo(); // This is a car
    }
}