package org.example;

import java.sql.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        try (Connection conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", "user", "pass")) {
            try (Statement stmt = conn.createStatement()) {

                ResultSet rs = stmt.executeQuery("select * from public.user");

                while( rs.next()){
                    System.out.println( rs.getString("id")+", "+ rs.getString("name"));
                }

            } catch (SQLException e) {
                throw new RuntimeException(e);
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }


    }
}