/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.programsmanagementapp.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * This class represents the database connection to the programinfo.db file located at
 * C:/users/nlakhal/sql/programinfo.db. 
 * The getConnection() method uses the DriverManager class to obtain a connection
 * to the database and returns the connection object.

Note that you may need to adjust the file path to match the location 
* of the programinfo.db file on your machine. 
* Additionally, this implementation uses the SQLite database engine, 
* but you can replace the dbURL string with a different JDBC URL if you're using a different database engine.
 * 
 * 
 * 
 * @author nlakhal
 */
public class DBConnection {
     public static Connection getConnection() throws SQLException {
        //Change the path the database (.db) file on your machine...
        //Just by changing the URL you point to another database
        String dbURL = "jdbc:sqlite:C:/users/nlakhal/sql/programinfo.db";
               // The format is: "jdbc:sqlite:myfilepath.db"

        Connection conn = DriverManager.getConnection(dbURL);  //predefined in JAVA
        return conn;
    }
}
