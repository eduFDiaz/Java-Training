package com.example.training.designPatterns.builder;

public class DatabaseConnection {
    String url;
    String username;
    String password;
    String driver;
    int connectionPoolSize;

    // Private constructor, so it can only be instantiated by the builder
    DatabaseConnection(DatabaseConnectionBuilder builder) {
        this.url = builder.url;
        this.username = builder.username;
        this.password = builder.password;
        this.driver = builder.driver;
        this.connectionPoolSize = builder.connectionPoolSize;
    }

    @Override
    public String toString() {
        return "DatabaseConnection [url=" + url + ", username=" + username + ", password=" + password + ", driver="
                + driver + ", connectionPoolSize=" + connectionPoolSize + "]";
    }
}
