package com.example.training.oop.overloadingAndOverriding;

// 4 Q: Explain the concept of method overloading and method overriding in Java.

//A: Method overloading occurs when two or more methods in the same class have the same name but different parameters. Method overriding occurs when a subclass provides a new implementation for a method that is already defined in its superclass.

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
