package com.example.training.designPatterns.builder;

public class DatabaseConnectionBuilder {
    String url;
    String username = "default_user";
    String password = "default_password";
    String driver = "com.mysql.cj.jdbc.Driver";
    int connectionPoolSize = 5;

    public DatabaseConnectionBuilder(String url) {
        this.url = url;
    }

    public DatabaseConnectionBuilder setUsername(String username) {
        this.username = username;
        return this;
    }

    public DatabaseConnectionBuilder setPassword(String password) {
        this.password = password;
        return this;
    }

    public DatabaseConnectionBuilder setDriver(String driver) {
        this.driver = driver;
        return this;
    }

    public DatabaseConnectionBuilder setConnectionPoolSize(int connectionPoolSize) {
        this.connectionPoolSize = connectionPoolSize;
        return this;
    }

    public DatabaseConnection build() {
        return new DatabaseConnection(this);
    }
}

