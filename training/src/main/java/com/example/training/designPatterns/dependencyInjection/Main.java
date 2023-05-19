package com.example.training.designPatterns.dependencyInjection;

public class Main {
    public static void main(String[] args) {
        Database mySQLDatabase = new MySQLDatabase();
        Database postgreSQLDatabase = new PostgresDatabase();

        // Inject the MySQLDatabase instance into the DataManager class
        DataManager dataManagerMySQL = new DataManager(mySQLDatabase);

        // Inject the PostgreSQLDatabase instance into the DataManager class
        DataManager dataManagerPostgreSQL = new DataManager(postgreSQLDatabase);

        // Use the DataManager to process data with different database clients
        dataManagerMySQL.processData("Sample data for MySQL");
        dataManagerPostgreSQL.processData("Sample data for PostgreSQL");
    }
}
