package com.example.training.designPatterns.Singleton;

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
