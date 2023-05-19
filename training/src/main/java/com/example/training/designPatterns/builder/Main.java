package com.example.training.designPatterns.builder;

// Builder Pattern is used to create complex objects with multiple attributes and some are optional.
// It could also be used to create an immutable object, but not always necessarily.

public class Main {
    public static void main(String[] args) {
        DatabaseConnection connection = new DatabaseConnectionBuilder("jdbc:mysql://localhost:3306/mydb")
        .setUsername("user")
        // .setPassword("password123")
        .setDriver("com.mysql.jdbc.Driver")
        .setConnectionPoolSize(10)
        .build();

        System.out.println(connection);
    }    
}
