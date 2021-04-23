package com.app.dbutil;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class PostgresConnection {

    private PostgresConnection(){}
    private static Connection connection;

    static {
        try {
            Class.forName("org.postgresql.Driver");
            String url = "jdbc:postgresql://localhost:5432/postgres";
            String username = "postgres";
            String password = "password";
            connection = DriverManager.getConnection(url, username, password);
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println(e);
        }
    }
    public static Connection getConnection(){
        return connection;





    }


}


/* How to build SingleTon Java class?
Disable Constructor by making it private
Keep a static method which checks and returns the instance of the connection object

 */