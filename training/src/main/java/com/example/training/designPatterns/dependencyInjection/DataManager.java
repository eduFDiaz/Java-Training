package com.example.training.designPatterns.dependencyInjection;

public class DataManager {
    private Database database;

    public DataManager(Database database) {
        this.database = database;
    }

    public void processData(String data) {
        // Process data
        System.out.println("Processing data: " + data);
        database.saveData(data);
    }
}