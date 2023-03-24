package com.example.training.oop.inheritance;

public class Vehicle {
    void display() {
        System.out.println("This is a vehicle");
    }
}

class Car extends Vehicle {
    void carInfo() {
        System.out.println("This is a car");
    }
}