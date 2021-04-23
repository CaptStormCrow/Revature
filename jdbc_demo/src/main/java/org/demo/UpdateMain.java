package org.demo;

import java.sql.*;

public class UpdateMain {

   public static void main(String[] args) {
        Connection connection = null;
        Statement stmt = null;
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
            stmt = connection.createStatement();
            String sql = "INSERT INTO employee_schema.employee2\n" +
                    "(\"name\", city, contact, gender, age, deptid)\n" +
                    "VALUES(?, ?, ?, ?, ?, ?);\n";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, "Benny");
            preparedStatement.setString(2, "Mesa");
            preparedStatement.setLong(3, 524387166);
            preparedStatement.setString(4, "M");
            preparedStatement.setInt(5, 30);
            preparedStatement.setInt(6, 9001);

            //step4 execute
            stmt.executeUpdate(sql);

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
