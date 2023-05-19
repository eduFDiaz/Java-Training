package com.example.training.designPatterns.facade;

// A Facade is a design pattern that provides a simplified interface
// to a more complex subsystem. 
// This can make a system easier to understand and use, particularly
//  if the subsystem involves many interacting classes or complicated dependencies.

public class Main {
    public static void main(String[] args) {
            DatabaseFacade databaseFacade = new DatabaseFacade();
            databaseFacade.fetchDataFromDatabase("username", "password");
    }
}
