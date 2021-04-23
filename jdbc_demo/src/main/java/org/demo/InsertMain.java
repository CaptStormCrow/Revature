package org.demo;

import java.sql.*;

public class InsertMain {
    public static void main(String[] args) {
        Connection connection = null;
        try {
            //Step 1, load driver
            Class.forName("org.postgresql.Driver");
            System.out.println("Driver Loaded");


            //Step 2 Open connection
            String url = "jdbc:postgresql://localhost:5432/postgres";
            String username = "postgres";
            String password = "password";
            connection = DriverManager.getConnection(url, username, password);
            System.out.println("Connection/Ping Successful");

            //Step 3 -Create Statement
            String sql = "INSERT INTO employee_schema.employee2\n" +
                    "(\"name\", city, contact, gender, age, deptid)\n" +
                    "VALUES(?, ?, ?, ?, ?, ?);\n";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, "James");
            preparedStatement.setString(2, "Seattle");
            preparedStatement.setLong(3, 987654321);
            preparedStatement.setString(4, "M");
            preparedStatement.setInt(5, 23);
            preparedStatement.setInt(6, 9003);

            //step4 execute
            int c = preparedStatement.executeUpdate();

            //Step 5- process results
            System.out.println("Query Executed - " + c + " no of row/s inserted successfully");

        } catch (ClassNotFoundException | SQLException e) {
            System.out.println(e);
        } finally {
            try {
                //Step 6 - close connection
                connection.close();
                System.out.println("Connection closed");
            } catch (SQLException e) {
                System.out.println(e);
            }
        }
    }
}


//Try to update(contact, id) and delete employee by id.