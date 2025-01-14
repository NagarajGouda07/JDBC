package com.xworkz.naga.runner;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Raja {
    public static void main(String[] args) {
        String URL = "jdbc:mysql://localhost:3306/employees";
        String username = "root";
        String password = "Nagaraj@007";

        try {
            // Load the MySQL JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Establish the connection
            Connection connection = DriverManager.getConnection(URL, username, password);
            System.out.println("Connection established successfully!");

            // Close the connection
            connection.close();
        } catch (ClassNotFoundException e) {
            System.err.println("JDBC Driver not found!");
            e.printStackTrace();
        } catch (SQLException e) {
            System.err.println("Database connection failed!");
            e.printStackTrace();
        }
    }
}