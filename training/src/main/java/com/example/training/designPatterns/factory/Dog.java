package com.example.training.designPatterns.factory;

public class Dog implements Animal {
    @Override
    public void speak() {
        System.out.println("Woof!");
    }
}