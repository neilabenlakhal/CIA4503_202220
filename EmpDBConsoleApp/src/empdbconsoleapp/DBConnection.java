package empdbconsoleapp;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *  C:\Users\nlakhal\SQL
 * @author nlakhal
 */
import java.sql.*;

public class DBConnection {
    public static Connection getConnection() throws SQLException {
        //Change the path the database (.db) file on your machine...
        //Just by changing the URL you point to another database
        String dbURL = "jdbc:sqlite:C:/users/nlakhal/sql/empinfo.db";

        Connection conn = DriverManager.getConnection(dbURL);
        return conn;
    }
}
