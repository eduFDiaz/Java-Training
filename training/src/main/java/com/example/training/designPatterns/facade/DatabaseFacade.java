package com.example.training.designPatterns.facade;

public class DatabaseFacade {
    private Connection connection;
    private Authentication authentication;
    private DataFetcher dataFetcher;

    public DatabaseFacade() {
        this.connection = new Connection();
        this.authentication = new Authentication();
        this.dataFetcher = new DataFetcher();
    }

    public void fetchDataFromDatabase(String username, String password) {
        connection.connect();
        authentication.authenticate(username, password);
        dataFetcher.fetchData();
    }
}
