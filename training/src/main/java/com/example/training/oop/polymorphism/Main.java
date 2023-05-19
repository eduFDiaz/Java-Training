package com.example.training.oop.polymorphism;

// 4 Q: Explain the concept of method overloading and method overriding in Java.

//A: Method overloading occurs when two or more methods in the same class have the same name but different parameters. Method overriding occurs when a subclass provides a new implementation for a method that is already defined in its superclass.

// Polymorphism in OOP is the ability of an object to take on many forms. 
// The most common use of polymorphism in OOP occurs when a parent class reference is used to refer to a child class object.
// This allows the child class to behave as the parent class and to override or implement its methods.

public class Main {
    public static void main(String[] args) {

        //Overloading
        Calculator calc = new Calculator();
        System.out.println(calc.add(1,1));
        System.out.println(calc.add(1.0,2.3));

        //Overriding
        Dog fido = new Dog();
        Mice mickey = new Mice();

        fido.makeSound();
        mickey.makeSound();
    }
}
