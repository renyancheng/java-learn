package com.mufeng.test.sql;

import java.io.PrintWriter;
import java.sql.*;

public class ConnectTest {
    public static void main(String[] args) {
        try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/learn", "root", "root")) {
            DriverManager.setLogWriter(new PrintWriter(System.out));
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * from student");
            while (resultSet.next()) {
                System.out.println(resultSet.getString(2));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
