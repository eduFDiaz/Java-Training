package com.example.training.designPatterns.dependencyInjection;

public class MySQLDatabase implements Database {
    @Override
    public void saveData(String data) {
        // Save data to MySQL database
        System.out.println("Data saved to MySQL database: " + data);
    }
}