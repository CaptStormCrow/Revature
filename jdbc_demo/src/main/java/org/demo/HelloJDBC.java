package org.demo;

import java.sql.*;

public class HelloJDBC {
    public static void main(String[] args) {

        Connection connection=null;
        try {
            //Step 1, load driver
            Class. forName("org.postgresql.Driver");
            System.out.println("Driver Loaded");


            //Step 2 Open connection
            String url="jdbc:postgresql://localhost:5432/postgres";
            String username="postgres";
            String password="password";
            connection = DriverManager.getConnection(url,username,password);
            System.out.println("Connection/Ping Successful");

            //Step 3 -Create Statement
            Statement statement=connection.createStatement();
            String sql="select id,name,age,contact,city,gender from employee_schema.employee";

            //step4 execute
            ResultSet resultSet=statement.executeQuery(sql);
            System.out.println("Query Executed");

            //Step 5- process results
            while(resultSet.next()){
                System.out.print(" ID: "+resultSet.getInt("id"));
                System.out.print(" Name: "+resultSet.getString("name"));
                System.out.print(" City: "+resultSet.getString("city"));
                System.out.print(" Contact: "+resultSet.getLong("contact"));
                System.out.print(" Gender: "+resultSet.getString("gender"));
                System.out.println(" Age: "+resultSet.getInt("age"));
            }

        } catch (ClassNotFoundException | SQLException e) {
            System.out.println(e);
        }finally{
            try{
                //Step 6 - close connection
                connection.close();
                System.out.println("Connection closed");
            }catch (SQLException e){
                System.out.println(e);
            }
        }

    }
}
