package com.example.training.oop.abstraction;

public abstract class Animal {
    public abstract void makeSound();
    void sleep() {
        System.out.println(this.getClass().getSimpleName()+" is sleeping");
    }
}

// Interface
interface Swimmable {
    void swim();
    
}

class Dog extends Animal implements Swimmable {
    public void makeSound() { System.out.println("Bark!"); }
    public void swim() { System.out.println("Dog can swim"); }
}

class Horse extends Animal implements Swimmable {
    public void makeSound() { System.out.println("Neigh!"); }
    public void swim() { System.out.println("Horse can swim");}
}