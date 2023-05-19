package com.example.training.designPatterns.Singleton;

// Singleton is a creational design pattern that lets you ensure that a class has only one instance, 
// while providing a global access point to this instance. 
// This is convenient when we need to make sure we have only one instance of a class for the entire application.   

public class Main {
    public static void main(String[] args) {
        
        Singleton singleton = Singleton.getInstance();
        singleton.showCreationTime();

        Singleton singleton2 = Singleton.getInstance();
        singleton2.showCreationTime();
        
        Singleton singleton3 = Singleton.getInstance();
        singleton3.showCreationTime();
    }
}
