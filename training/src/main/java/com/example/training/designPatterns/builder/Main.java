package com.example.training.designPatterns.builder;

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
