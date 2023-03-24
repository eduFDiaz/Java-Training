package com.example.training.designPatterns.dependencyInjection;

public class PostgresDatabase implements Database {
    @Override
    public void saveData(String data) {
        // Save data to MySQL database
        System.out.println("Data saved to Postgres database: " + data);
    }
}
