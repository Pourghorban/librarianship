package com.example.persistence;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnectionTest {
    public static void main(String[] args) {
        String url = "jdbc:sqlserver://localhost:1433;databaseName=librarianship_DB";
        String username = "sa";
        String password = "Samim123";

        try (Connection connection = DriverManager.getConnection(url, username, password)) {
            System.out.println("Connected to the database!");
        } catch (SQLException e) {
            System.out.println("Failed to make connection!");
            e.printStackTrace();
        }
    }
}
